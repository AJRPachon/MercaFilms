package com.example.mercadona.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.mercadona.AppApplication
import com.example.mercadona.R
import com.example.mercadona.data.entity.bo.FilmBo
import com.example.mercadona.di.component.AppComponent
import com.example.mercadona.ui.viewmodel.FilmViewModel
import com.example.mercadona.ui.viewmodel.ViewModelFactory
import javax.inject.Inject

class FilmsFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory : ViewModelFactory<FilmViewModel>
    private val viewModel : FilmViewModel by lazy { viewModelFactory.create(FilmViewModel::class.java) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_films, container, false)
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