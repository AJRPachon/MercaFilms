package com.example.mercadona.ui.viewmodel

import androidx.lifecycle.*
import com.example.mercadona.data.entity.bo.FilmBo
import com.example.mercadona.domain.GetFilmsUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class FilmViewModel @Inject constructor(
    private val getFilmsUseCase: GetFilmsUseCase
): ViewModel() {

    private val filmListLd : MutableLiveData<List<FilmBo>> = MutableLiveData()

    fun requestFilmsWS() {
        viewModelScope.launch(Dispatchers.IO){
            getFilmsUseCase.getFilms().collect{
                filmListLd.postValue(it)
            }
        }
    }

    fun getFilmsLD() : LiveData<List<FilmBo>> {
        return filmListLd
    }

    fun deleteFilm(filmId: String){
        viewModelScope.launch(Dispatchers.IO){
            getFilmsUseCase.deleteFilm(filmId)
        }
    }
}