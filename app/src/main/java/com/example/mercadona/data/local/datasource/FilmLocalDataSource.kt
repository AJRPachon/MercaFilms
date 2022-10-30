package com.example.mercadona.data.local.datasource

import com.example.mercadona.data.entity.bo.FilmBo
import com.example.mercadona.data.entity.dbo.*
import com.example.mercadona.data.entity.toBo
import com.example.mercadona.data.entity.toDbo
import com.example.mercadona.data.local.dao.FilmDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

interface FilmLocalDataSource {
    suspend fun getFilm(filmId : String) : Flow<FilmBo>
    suspend fun getFilmList() : Flow<List<FilmBo>>
    suspend fun deleteFilm(filmId : String)
    suspend fun insertFilms(filmList : List<FilmBo>)
}

class FilmLocalDataSourceImpl(
    private val filmDao: FilmDao
) : FilmLocalDataSource {
    override suspend fun getFilm(filmId: String): Flow<FilmBo> {
        return filmDao.getFilm(filmId).map { it.toBo() }
    }

    override suspend fun getFilmList(): Flow<List<FilmBo>> {
        return filmDao.getFilmList().map { it.map { filmWithData ->  filmWithData.toBo()} }
    }

    override suspend fun deleteFilm(filmId: String) {
        filmDao.deleteSelectedFilm(filmId)
    }

    override suspend fun insertFilms(filmList: List<FilmBo>) {

        val locationList = mutableListOf<LocationDbo>()
        val peopleList = mutableListOf<PeopleDbo>()
        val vehicleList = mutableListOf<VehicleDbo>()
        val speciesList = mutableListOf<SpecieDbo>()
        val filmLoadedList = mutableListOf<FilmDbo>()

        filmList.forEach {
            it.locations.forEach { locationBo ->
                locationBo.residents.forEach { resident ->
                    locationList.add(locationBo.toDbo(it.id ?: "", resident.id ?: ""))
                }
            }
            it.people.forEach { peopleBo ->
                peopleList.add(peopleBo.toDbo(it.id ?: ""))
            }
            it.vehicles.forEach { vehicleBo ->
                vehicleList.add(vehicleBo.toDbo(it.id ?: ""))
            }
            it.species.forEach { specieBo ->
                speciesList.add(specieBo.toDbo(it.id ?: ""))
            }
            filmLoadedList.add(it.toDbo())
        }

        filmDao.insertFilms(filmLoadedList,locationList,peopleList,speciesList,vehicleList)
    }

}