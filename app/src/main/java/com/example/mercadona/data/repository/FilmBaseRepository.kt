package com.example.mercadona.data.repository

import javax.inject.Inject

class FilmBaseRepository @Inject constructor(
    private val filmLocalDataSource: FilmLocalDataSource,
    private val filmRemoteDataSource: FilmRemoteDataSource
) {

}


interface FilmRemoteDataSource {
}

interface FilmLocalDataSource {
}