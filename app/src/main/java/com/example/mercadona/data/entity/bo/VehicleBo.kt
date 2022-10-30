package com.example.mercadona.data.entity.bo

data class VehicleBo(

    val id: String?,
    val name: String?,
    val description: String?,
    val vehicleClass: String?,
    val length: String?,
    val pilot: String?,
    val films: List<FilmBo>,
    val url: String?
)