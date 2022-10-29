package com.example.mercadona.di

import com.example.mercadona.data.remote.repository.FilmRemoteRepository
import com.example.mercadona.data.remote.repository.FilmRemoteRepositoryImpl
import com.example.mercadona.data.repository.FilmRemoteDataSource
import dagger.Module
import dagger.Provides

@Module
class FilmRemoteModule {

    @Provides
    fun filmRemoteRepository(local: FilmRemoteDataSource) =
        FilmRemoteRepositoryImpl(local) as FilmRemoteRepository
}