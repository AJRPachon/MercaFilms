package com.example.mercadona.data.entity.dbo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "people")
data class PeopleDbo(

    @PrimaryKey(autoGenerate = false) val peopleId: String,
    val name: String?,
    val gender: String?,
    val age: String?,
    val eyeColor: String?,
    val hairColor: String?,
    val filmId : String?,
    val species: String?,
    val url: String?
)
