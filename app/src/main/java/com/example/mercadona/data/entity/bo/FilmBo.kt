package com.example.mercadona.data.entity.bo

import com.example.mercadona.data.entity.dto.LocationDto
import com.example.mercadona.data.entity.dto.PeopleDto
import com.example.mercadona.data.entity.dto.SpecieDto
import com.example.mercadona.data.entity.dto.VehicleDto

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
    val people: List<PeopleDto>,
    val species: List<SpecieDto>,
    val locations: List<LocationDto>,
    val vehicles: List<VehicleDto>,
    val url: String?
)