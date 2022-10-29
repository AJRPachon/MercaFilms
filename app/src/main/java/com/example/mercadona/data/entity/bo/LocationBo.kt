package com.example.mercadona.data.entity.bo

import com.example.mercadona.data.entity.dto.FilmDto
import com.example.mercadona.data.entity.dto.PeopleDto

data class LocationBo(

    val id: String?,
    val name: String?,
    val climate: String?,
    val terrain: String?,
    val surfaceWater: String?,
    val residents: List<PeopleDto>,
    val films: List<FilmDto>,
    val url: String?
)
