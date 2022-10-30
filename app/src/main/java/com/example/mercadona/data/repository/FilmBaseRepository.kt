package com.example.mercadona.data.repository

import com.example.mercadona.data.remote.datasource.FilmRemoteDataSource
import javax.inject.Inject

class FilmBaseRepository @Inject constructor(
    private val filmLocalDataSource: FilmLocalDataSource,
    private val filmRemoteDataSource: FilmRemoteDataSource
) {

}


interface FilmLocalDataSource {
}