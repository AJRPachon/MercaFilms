package com.example.mercadona.data.entity.bo

data class PeopleBo(

    val id: String?,
    val name: String?,
    val gender: String?,
    val age: String?,
    val eyeColor: String?,
    val hairColor: String?,
    val films: List<FilmBo>,
    val species: String?,
    val url: String?
)