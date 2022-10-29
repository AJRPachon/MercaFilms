package com.example.mercadona.data.entity.dbo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "specie")
data class SpecieDbo(
    
    @PrimaryKey(autoGenerate = false) val id: String?,
    val name: String?,
    val classification: String?,
    val eyeColors: String?,
    val url: String?
)
