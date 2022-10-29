package com.example.mercadona.data.entity.dbo.relation.crossref

import androidx.room.Entity

@Entity(primaryKeys = ["filmId", "peopleId"])
data class FilmPeopleCrossRef(

    val filmId : String,
    val peopleId : String
)
