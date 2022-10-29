package com.example.mercadona.data.entity.dbo.relation.crossref

import androidx.room.Entity

@Entity(primaryKeys = ["filmId", "vehicleId"])
data class FilmVehicleCrossRef(

    val filmId : String,
    val vehicleId : String
)
