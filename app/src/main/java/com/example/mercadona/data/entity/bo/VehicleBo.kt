package com.example.mercadona.data.entity.bo

import com.example.mercadona.data.entity.dto.FilmDto

data class VehicleBo(

    val id: String?,
    val name: String?,
    val description: String?,
    val vehicleClass: String?,
    val length: String?,
    val pilot: String?,
    val films: List<FilmDto>,
    val url: String?
)