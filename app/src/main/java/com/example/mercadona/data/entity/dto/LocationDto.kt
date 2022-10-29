package com.example.mercadona.data.entity.dto

import com.google.gson.annotations.SerializedName

data class LocationDto(

    @SerializedName("id") val id: String? = "",
    @SerializedName("name") val name: String? = "",
    @SerializedName("climate") val climate: String? = "",
    @SerializedName("terrain") val terrain: String? = "",
    @SerializedName("surface_water") val surfaceWater: String? = "",
    @SerializedName("residents") val residents: List<PeopleDto> = emptyList(),
    @SerializedName("films") val films: List<FilmDto> = emptyList(),
    @SerializedName("url") val url: String? = ""
)
