package com.example.mercadona.data.remote.repository

import com.example.mercadona.data.repository.FilmRemoteDataSource

interface FilmRemoteRepository {
}

internal class FilmRemoteRepositoryImpl(
    remote: FilmRemoteDataSource
)