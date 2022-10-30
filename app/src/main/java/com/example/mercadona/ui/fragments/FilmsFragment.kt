package com.example.mercadona.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mercadona.data.entity.bo.FilmBo
import com.example.mercadona.databinding.FragmentFilmsBinding
import com.example.mercadona.ui.viewmodel.FilmViewModel
import com.example.mercadona.ui.viewmodel.ViewModelFactory
import javax.inject.Inject

class FilmsFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory : ViewModelFactory<FilmViewModel>
    private val viewModel : FilmViewModel by lazy { viewModelFactory.create(FilmViewModel::class.java) }

    private var binding : FragmentFilmsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFilmsBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        viewModel.getFilmsLD().observe(viewLifecycleOwner, ::onFilmsLoaded)
//        viewModel.requestFilmsWS()
    }

    private fun onFilmsLoaded(films : List<FilmBo>){
        Log.i("PELICULAS", "films")
    }

}