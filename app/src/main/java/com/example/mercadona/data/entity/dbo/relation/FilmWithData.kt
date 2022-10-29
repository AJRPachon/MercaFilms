package com.example.mercadona.data.entity.dbo.relation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.mercadona.data.entity.dbo.*
import com.example.mercadona.data.entity.dbo.relation.crossref.FilmLocationCrossRef
import com.example.mercadona.data.entity.dbo.relation.crossref.FilmPeopleCrossRef
import com.example.mercadona.data.entity.dbo.relation.crossref.FilmVehicleCrossRef

data class FilmWithData(

    @Embedded
    val film: FilmDbo,

    @Relation(
        parentColumn = "filmId",
        entityColumn = "locationId",
        associateBy = Junction(FilmLocationCrossRef::class)
    )
    val locations: List<LocationDbo>,

    @Relation(
        entity = LocationDbo::class,
        parentColumn = "filmId",
        entityColumn = "filmLocationId"
    )
    val locationsWithPeople: List<LocationWithPeople>,

    @Relation(
        parentColumn = "filmId",
        entityColumn = "peopleId",
        associateBy = Junction(FilmPeopleCrossRef::class)
    )
    val peoples: List<PeopleDbo>,

    @Relation(
        parentColumn = "filmId",
        entityColumn = "filmSpecieId",
        associateBy = Junction(SpecieDbo::class)
    )
    val species: List<SpecieDbo>,

    @Relation(
        parentColumn = "filmId",
        entityColumn = "vehicleId",
        associateBy = Junction(FilmVehicleCrossRef::class)
    )
    val vehicles: List<VehicleDbo>,

    )



