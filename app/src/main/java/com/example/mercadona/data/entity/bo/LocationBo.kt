package com.example.mercadona.data.entity.bo

data class LocationBo(

    val id: String?,
    val name: String?,
    val climate: String?,
    val terrain: String?,
    val surfaceWater: String?,
    val residents: List<PeopleBo>,
    val films: List<FilmBo>,
    val url: String?
)
