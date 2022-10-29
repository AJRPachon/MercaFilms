package com.example.mercadona.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.Query
import androidx.room.Transaction
import com.example.mercadona.data.entity.dbo.*
import com.example.mercadona.data.entity.dbo.relation.FilmWithData
import kotlinx.coroutines.flow.Flow

@Dao
interface FilmDao {

    //////////// GET ////////////////////////////////////////////////////////////////////////////

    @Transaction
    @Query("SELECT * FROM film")
    fun getFilmList() : Flow<List<FilmWithData>>


    ////////// INSERT ///////////////////////////////////////////////////////////////////////////

    @Transaction
    @Insert(onConflict = IGNORE)
    fun insertFilms(
        films : List<FilmDbo?>,
        locations : List<LocationDbo?>,
        peoples : List<PeopleDbo?>,
        species : List<SpecieDbo?>,
        vehicle : List<VehicleDbo?>
    )

    //////// UPDATE ////////////////////////////////////////////////////////////////////////////
    //TODO UPDATE DAO

    /////// DELETE /////////////////////////////////////////////////////////////////////////////
    //TODO DELETE DAO
}