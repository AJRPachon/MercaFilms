package com.example.mercadona.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
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
            filmListLd.postValue(getFilmsUseCase.getFilms())
        }
    }

    fun getFilmsLD() : LiveData<List<FilmBo>> {
        return filmListLd
    }
}