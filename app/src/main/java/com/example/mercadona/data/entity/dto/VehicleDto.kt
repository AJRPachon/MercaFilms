package com.example.mercadona.data.entity.dto

import com.google.gson.annotations.SerializedName

data class VehicleDto(

    @SerializedName("id") val id: String? = "",
    @SerializedName("name") val name: String? = "",
    @SerializedName("description") val description: String? = "",
    @SerializedName("vehicle_class") val vehicleClass: String? = "",
    @SerializedName("length") val length: String? = "",
    @SerializedName("pilot") val pilot: String? = "",
    @SerializedName("films") val films: List<FilmDto> = emptyList(),
    @SerializedName("url") val url: String? = ""
)
