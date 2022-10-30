package com.example.mercadona.data.remote.ws

import com.example.mercadona.data.entity.dto.FilmDto
import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface FilmWs {

    @GET("/films")
    suspend fun getFilmList() : Flow<List<FilmDto>>
}