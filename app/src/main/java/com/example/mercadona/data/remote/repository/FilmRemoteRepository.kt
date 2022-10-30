package com.example.mercadona.data.remote.repository

import com.example.mercadona.data.entity.bo.FilmBo
import com.example.mercadona.data.remote.datasource.FilmRemoteDataSource
import kotlinx.coroutines.flow.Flow

interface FilmRemoteRepository {
    suspend fun getFilmList() : Flow<List<FilmBo>>
}

internal class FilmRemoteRepositoryImpl(
    private val remote: FilmRemoteDataSource
) : FilmRemoteRepository {
    override suspend fun getFilmList(): Flow<List<FilmBo>> {
        return remote.getFilmsListRDS()
    }

}