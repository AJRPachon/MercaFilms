package com.example.mercadona.data.entity.dto

import com.google.gson.annotations.SerializedName

data class PeopleDto(

    @SerializedName("id") val id: String? = "",
    @SerializedName("name") val name: String? = "",
    @SerializedName("gender") val gender: String? = "",
    @SerializedName("age") val age: String? = "",
    @SerializedName("eye_color") val eyeColor: String? = "",
    @SerializedName("hair_color") val hairColor: String? = "",
    @SerializedName("films") val films: List<FilmDto> = emptyList(),
    @SerializedName("species") val species: String? = "",
    @SerializedName("url") val url: String? = ""
)
