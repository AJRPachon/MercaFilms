package com.example.mercadona.data.entity.dbo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "vehicle")
data class VehicleDbo(

    @PrimaryKey(autoGenerate = false) val id: String?,
    val name: String?,
    val description: String?,
    val vehicleClass: String?,
    val length: String?,
    val pilot: String?,
    val url: String?
)
