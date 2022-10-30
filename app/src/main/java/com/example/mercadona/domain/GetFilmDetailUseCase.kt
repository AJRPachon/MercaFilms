package com.example.mercadona.domain

import com.example.mercadona.data.entity.bo.FilmBo
import com.example.mercadona.data.local.repository.FilmLocalRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow

interface GetFilmDetailUseCase {
    suspend fun getFilm(filmId : String) : Flow<FilmBo>
}

internal class GetFilmDetailUseCaseImpl(
    private val localRepository: FilmLocalRepository
): GetFilmDetailUseCase{
    override suspend fun getFilm(filmId : String): Flow<FilmBo> = flow {
        emitAll(localRepository.getFilm(filmId))
    }
}