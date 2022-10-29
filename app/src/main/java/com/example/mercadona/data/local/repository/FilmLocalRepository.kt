package com.example.mercadona.data.local.repository

import com.example.mercadona.data.repository.FilmLocalDataSource

interface FilmLocalRepository {
}

internal class FilmLocalRepositoryImpl(
    local: FilmLocalDataSource
)