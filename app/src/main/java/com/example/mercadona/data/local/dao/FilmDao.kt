package com.example.mercadona.data.local.dao

import androidx.room.*
import androidx.room.OnConflictStrategy.IGNORE
import com.example.mercadona.data.entity.dbo.*
import com.example.mercadona.data.entity.dbo.relation.FilmWithData
import kotlinx.coroutines.flow.Flow

@Dao
interface FilmDao {

    //////////// GET ////////////////////////////////////////////////////////////////////////////

    @Transaction
    @Query("SELECT * FROM film")
    fun getFilmList() : Flow<List<FilmWithData>>

    @Transaction
    @Query("SELECT * FROM film WHERE filmId =:filmId")
    fun getFilm(filmId : String) : Flow<FilmWithData>


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
    @Update
    fun updateFilm(film: FilmDbo)

    /////// DELETE /////////////////////////////////////////////////////////////////////////////
    @Transaction
    @Query("DELETE FROM film WHERE filmId = :filmId")
    fun deleteSelectedFilm(filmId: String)
}