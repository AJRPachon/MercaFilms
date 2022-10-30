package com.example.mercadona.data.remote.ws

import com.example.mercadona.data.entity.dto.FilmDto
import retrofit2.http.GET

interface FilmWs {

    @GET("/films")
    suspend fun getFilmList() : List<FilmDto>?
}