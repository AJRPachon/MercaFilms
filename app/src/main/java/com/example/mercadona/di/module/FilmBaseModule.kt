package com.example.mercadona.di.module

import com.example.mercadona.data.local.datasource.FilmLocalDataSource
import com.example.mercadona.data.remote.datasource.FilmRemoteDataSource
import com.example.mercadona.data.repository.FilmBaseRepository
import com.example.mercadona.data.repository.FilmBaseRepositoryImpl
import dagger.Module
import dagger.Provides

@Module
class FilmBaseModule {

    @Provides
    fun filmBaseRepository(local: FilmLocalDataSource, remote : FilmRemoteDataSource) =
        FilmBaseRepositoryImpl(local, remote) as FilmBaseRepository
}