package com.example.mercadona.domain

import com.example.mercadona.data.entity.bo.FilmBo
import com.example.mercadona.data.local.repository.FilmLocalRepository
import com.example.mercadona.data.repository.FilmBaseRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow

interface GetFilmsUseCase {
    suspend fun getFilms() : Flow<List<FilmBo>>
    suspend fun deleteFilm(filmId : String)
}

internal class GetFilmsUseCaseImpl(
    private val localRepository: FilmLocalRepository,
    private val baseRepository: FilmBaseRepository
) : GetFilmsUseCase {
    override suspend fun getFilms(): Flow<List<FilmBo>> = flow{
        emitAll(baseRepository.getFilmListAndInsertOnBBDD())
    }

    override suspend fun deleteFilm(filmId: String) {
        localRepository.deleteFilm(filmId)
    }

}