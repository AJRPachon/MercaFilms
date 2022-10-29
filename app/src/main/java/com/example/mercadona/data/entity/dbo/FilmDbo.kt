package com.example.mercadona.data.entity.dbo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "film")
data class FilmDbo(

    @PrimaryKey(autoGenerate = false) val id: String?,
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
    val url: String?
)
