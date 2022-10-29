package com.example.mercadona.di.module

import com.example.mercadona.data.local.repository.FilmLocalRepository
import com.example.mercadona.data.local.repository.FilmLocalRepositoryImpl
import com.example.mercadona.data.repository.FilmLocalDataSource
import dagger.Module
import dagger.Provides

@Module
class FilmLocalModule {

    @Provides
    fun filmLocalRepository(local: FilmLocalDataSource) =
        FilmLocalRepositoryImpl(local) as FilmLocalRepository
}