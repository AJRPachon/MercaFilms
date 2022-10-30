package com.example.mercadona.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mercadona.data.entity.bo.FilmBo
import com.example.mercadona.domain.GetFilmDetailUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

class FilmDetailViewModel @Inject constructor(
    private val getFilmDetailUseCase : GetFilmDetailUseCase
): ViewModel() {

    private val filmLd : MutableLiveData<FilmBo> = MutableLiveData()

    fun requestFilm(filmId : String) {
        viewModelScope.launch(Dispatchers.IO) {
            getFilmDetailUseCase.getFilm(filmId).collect{
                filmLd.postValue(it)
            }
        }
    }

    fun getFilmLd() : LiveData<FilmBo>{
        return filmLd
    }




}