package com.example.mercadona.data.entity.dbo.relation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.mercadona.data.entity.dbo.LocationDbo
import com.example.mercadona.data.entity.dbo.PeopleDbo

data class LocationWithPeople(

    @Embedded
    val location: LocationDbo,

    @Relation(
        parentColumn = "locationId",
        entityColumn = "peopleId",
        associateBy = Junction(PeopleDbo::class)
    )
    val peoples: List<PeopleDbo>
)
