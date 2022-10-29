package com.example.mercadona.data.entity.dto

import com.google.gson.annotations.SerializedName

data class SpecieDto(

    @SerializedName("id") val id: String? = "",
    @SerializedName("name") val name: String? = "",
    @SerializedName("classification") val classification: String? = "",
    @SerializedName("eye_colors") val eyeColors: String? = "",
    @SerializedName("url") val url: String? = ""
)
