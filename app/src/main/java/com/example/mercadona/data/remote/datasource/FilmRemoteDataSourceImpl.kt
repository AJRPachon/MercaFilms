package com.example.mercadona.data.remote.datasource

import com.example.mercadona.data.entity.bo.FilmBo
import com.example.mercadona.data.entity.toBo
import com.example.mercadona.data.remote.ws.FilmWs
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


interface FilmRemoteDataSource {
    suspend fun getFilmsListRDS() : Flow<List<FilmBo>>
}

class FilmRemoteDataSourceImpl(
    private val filmWs: FilmWs
) : FilmRemoteDataSource {

    override suspend fun getFilmsListRDS(): Flow<List<FilmBo>> {
        return filmWs.getFilmList().map { filmList -> filmList.map { it.toBo() } }
    }
}