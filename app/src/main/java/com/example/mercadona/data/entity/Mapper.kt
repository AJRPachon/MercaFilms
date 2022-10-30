package com.example.mercadona.data.entity

import com.example.mercadona.data.entity.bo.*
import com.example.mercadona.data.entity.dto.*

internal fun FilmDto.toBo() =
    FilmBo(
        id = id,
        title = title,
        originalTitle = originalTitle,
        originalTitleRomanised = originalTitleRomanised,
        image = image,
        movieBanner = movieBanner,
        description = description,
        director = director,
        producer = producer,
        releaseDate = releaseDate,
        runningTime = runningTime,
        rtScore = rtScore,
        people = people.map { it.toBo() },
        species = species.map { it.toBo() },
        locations = locations.map { it.toBo() },
        vehicles = vehicles.map { it.toBo() },
        url = url
    )

//fun getLocationFilms(films : List<FilmDto>) : List<LocationDto> {
//    val locationFilmsList = mutableListOf<LocationDto>()
//
//    for (film in films){
//        for (filmWithLocations in film.locations){
//            for (locationWithfilms in filmWithLocations.films){
//                if(locationWithfilms.id?.equals(film.id) == true){
//                    locationFilmsList.add(filmWithLocations)
//                }
//            }
//        }
//    }
//    return locationFilmsList
//}

internal fun LocationDto.toBo() =
    LocationBo(
        id = id,
        name = name,
        climate = climate,
        terrain = terrain,
        surfaceWater = surfaceWater,
        residents = residents.map { it.toBo() },
        films = emptyList(), //TODO Cambiar emptyList() por las peliculas
        url = url
    )

internal fun PeopleDto.toBo() =
    PeopleBo(
        id = id,
        name = name,
        gender = gender,
        age = age,
        eyeColor = eyeColor,
        hairColor = hairColor,
        films = emptyList(), //TODO Cambiar emptyList() por las peliculas
        species = species,
        url = url
    )

internal fun SpecieDto.toBo() =
    SpecieBo(
        id = id,
        name = name,
        classification = classification,
        eyeColors = eyeColors,
        url = url
    )

internal fun VehicleDto.toBo() =
    VehicleBo(
        id = id,
        name = name,
        description = description,
        vehicleClass = vehicleClass,
        length = length,
        pilot = pilot,
        films = emptyList(), //TODO Cambiar emptyList() por las peliculas
        url = url
    )