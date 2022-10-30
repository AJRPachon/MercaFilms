package com.example.mercadona.data.local.repository

import com.example.mercadona.data.entity.bo.FilmBo
import com.example.mercadona.data.local.datasource.FilmLocalDataSource
import kotlinx.coroutines.flow.Flow

interface FilmLocalRepository {
    suspend fun getFilm(filmId : String) : Flow<FilmBo>
    suspend fun deleteFilm(filmId : String)
    suspend fun insertFilms(filmList : List<FilmBo>)
}

internal class FilmLocalRepositoryImpl(
    private val local: FilmLocalDataSource
): FilmLocalRepository {
    override suspend fun getFilm(filmId: String): Flow<FilmBo> {
        return local.getFilm(filmId)
    }

    override suspend fun deleteFilm(filmId: String) {
        local.deleteFilm(filmId)
    }

    override suspend fun insertFilms(filmList: List<FilmBo>) {
        local.insertFilms(filmList)
    }
}