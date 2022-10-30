package com.example.mercadona.data.entity.bo

data class FilmBo (

    val id: String?,
    val title: String?,
    val originalTitle: String?,
    val originalTitleRomanised: String?,
    val image: String?,
    val movieBanner: String?,
    val description: String?,
    val director: String?,
    val producer: String?,
    val releaseDate: String?,
    val runningTime: String?,
    val rtScore: String?,
    val people: List<PeopleBo>,
    val species: List<SpecieBo>,
    val locations: List<LocationBo>,
    val vehicles: List<VehicleBo>,
    val url: String?
)