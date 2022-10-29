package com.example.mercadona.data.entity.bo

import com.example.mercadona.data.entity.dto.FilmDto

data class PeopleBo(

    val id: String?,
    val name: String?,
    val gender: String?,
    val age: String?,
    val eyeColor: String?,
    val hairColor: String?,
    val films: List<FilmDto>,
    val species: String?,
    val url: String?
)