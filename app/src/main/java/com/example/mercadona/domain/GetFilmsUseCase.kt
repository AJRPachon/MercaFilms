package com.example.mercadona.domain

import com.example.mercadona.data.entity.bo.FilmBo
import com.example.mercadona.data.remote.repository.FilmRemoteRepository

interface GetFilmsUseCase {
    suspend fun getFilms() : List<FilmBo>?
}

internal class GetFilmsUseCaseImpl(
    private val remoteRepository: FilmRemoteRepository
) : GetFilmsUseCase {
    override suspend fun getFilms(): List<FilmBo>? {
        return remoteRepository.getFilmList()
    }

}