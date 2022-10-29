package com.example.mercadona.data.entity.dbo.relation.crossref

import androidx.room.Entity

@Entity(primaryKeys = ["filmId", "locationId"])
data class FilmLocationCrossRef(

    val filmId : String,
    val locationId : String
)
