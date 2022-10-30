package com.example.mercadona.data.remote.datasource

import com.example.mercadona.data.entity.bo.FilmBo
import com.example.mercadona.data.entity.toBo
import com.example.mercadona.data.remote.ws.FilmWs


interface FilmRemoteDataSource {
    suspend fun getFilmsListRDS() : List<FilmBo>?
}

class FilmRemoteDataSourceImpl(
    private val filmWs: FilmWs
) : FilmRemoteDataSource {

    override suspend fun getFilmsListRDS(): List<FilmBo>? {
        return filmWs.getFilmList()?.map { it.toBo() }
    }
}