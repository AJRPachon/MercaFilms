package com.example.mercadona.di.module

import com.example.mercadona.data.remote.repository.FilmRemoteRepository
import com.example.mercadona.data.remote.repository.FilmRemoteRepositoryImpl
import com.example.mercadona.data.repository.FilmRemoteDataSource
import dagger.Module
import dagger.Provides

@Module
class FilmRemoteModule {

    @Provides
    fun filmRemoteRepository(remote: FilmRemoteDataSource) =
        FilmRemoteRepositoryImpl(remote) as FilmRemoteRepository
}