package com.example.mercadona.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.mercadona.databinding.FragmentDetailFilmBinding

class DetailFilmFragment : Fragment() {

    private val args: DetailFilmFragmentArgs by navArgs()
    private var binding: FragmentDetailFilmBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailFilmBinding.inflate(inflater, container, false)
        return binding?.root
    }


}