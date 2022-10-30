package com.example.mercadona.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mercadona.data.entity.bo.FilmBo
import com.example.mercadona.databinding.FragmentFilmsBinding
import com.example.mercadona.ui.adapter.FilmAdapter
import com.example.mercadona.ui.adapter.FilmCallBack
import com.example.mercadona.ui.viewmodel.FilmViewModel
import com.example.mercadona.ui.viewmodel.ViewModelFactory
import javax.inject.Inject

class FilmsFragment : Fragment() {

    private val adapter by lazy {
        FilmAdapter(
            object : FilmCallBack.OnFilmClickListener {

                override fun onFilmClicked(filmId: String) {
                    val action =
                        FilmsFragmentDirections.actionFilmsFragmentToDetailFilmFragment(filmId)
                    findNavController().navigate(action)
                }

                override fun onDeleteClicked(filmId: String) {
                    //viewModel.deleteFilmSelected(filmId)
                }
            }
        )
    }

    @Inject
    lateinit var viewModelFactory: ViewModelFactory<FilmViewModel>
    private val viewModel: FilmViewModel by lazy { viewModelFactory.create(FilmViewModel::class.java) }

    private var binding: FragmentFilmsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFilmsBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configureBindings()
//        viewModel.getFilmsLD().observe(viewLifecycleOwner, ::onFilmsLoaded)
//        viewModel.requestFilmsWS()
    }

    private fun configureBindings() {
        binding?.filmsFragmentListFilmList?.adapter = adapter
        binding?.filmsFragmentListFilmList?.layoutManager = LinearLayoutManager(
            requireActivity().applicationContext,
            LinearLayoutManager.VERTICAL,
            false
        )
    }

    private fun onFilmsLoaded(films: List<FilmBo>) {
        Log.i("PELICULAS", "films")
    }

}