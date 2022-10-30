package com.example.mercadona.data.remote.repository

import com.example.mercadona.data.entity.bo.FilmBo
import com.example.mercadona.data.remote.datasource.FilmRemoteDataSource

interface FilmRemoteRepository {
    suspend fun getFilmList() : List<FilmBo>?
}

internal class FilmRemoteRepositoryImpl(
    private val remote: FilmRemoteDataSource
) : FilmRemoteRepository {
    override suspend fun getFilmList(): List<FilmBo>? {
        return remote.getFilmsListRDS()
    }

}