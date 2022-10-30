package com.example.mercadona.data.repository

import com.example.mercadona.data.entity.bo.FilmBo
import com.example.mercadona.data.local.datasource.FilmLocalDataSource
import com.example.mercadona.data.remote.datasource.FilmRemoteDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

interface FilmBaseRepository {
    suspend fun getFilmListAndInsertOnBBDD() : Flow<List<FilmBo>>
}

internal class FilmBaseRepositoryImpl @Inject constructor(
    private val filmLocalDataSource: FilmLocalDataSource,
    private val filmRemoteDataSource: FilmRemoteDataSource
) : FilmBaseRepository {

    override suspend fun getFilmListAndInsertOnBBDD(): Flow<List<FilmBo>> = flow {
        val filmListWS = filmRemoteDataSource.getFilmsListRDS()
        filmListWS.let { filmLocalDataSource.insertFilms(it.first()) }
        emitAll(filmLocalDataSource.getFilmList())
    }
}
