package com.example.mercadona.data.entity.dbo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "location")
data class LocationDbo(

    @PrimaryKey(autoGenerate = false) val id: String,
    val name: String?,
    val climate: String?,
    val terrain: String?,
    val surfaceWater: String?,
    val url: String?
)
