package com.example.mercadona.data.entity.dbo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "people")
data class PeopleDbo(

    @PrimaryKey(autoGenerate = false) val id: String,
    val name: String?,
    val gender: String?,
    val age: String?,
    val eyeColor: String?,
    val hairColor: String?,
    val species: String?,
    val url: String?
)
