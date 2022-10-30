package com.example.mercadona.di.module

import com.example.mercadona.data.local.repository.FilmLocalRepository
import com.example.mercadona.data.remote.datasource.FilmRemoteDataSource
import com.example.mercadona.data.remote.datasource.FilmRemoteDataSourceImpl
import com.example.mercadona.data.remote.repository.FilmRemoteRepository
import com.example.mercadona.data.remote.repository.FilmRemoteRepositoryImpl
import com.example.mercadona.data.remote.ws.FilmWs
import com.example.mercadona.data.repository.FilmBaseRepository
import com.example.mercadona.domain.GetFilmsUseCase
import com.example.mercadona.domain.GetFilmsUseCaseImpl
import dagger.Module
import dagger.Provides

@Module
class FilmRemoteModule {

    @Provides
    fun filmRemoteRepository(remote: FilmRemoteDataSource) =
        FilmRemoteRepositoryImpl(remote) as FilmRemoteRepository

    @Provides
    fun filmRemoteDataSource(filmWs: FilmWs) =
        FilmRemoteDataSourceImpl(filmWs) as FilmRemoteDataSource

    @Provides
    fun getFilmsUseCase(filmLocalRepository: FilmLocalRepository, baseRepository: FilmBaseRepository) =
        GetFilmsUseCaseImpl(filmLocalRepository, baseRepository) as GetFilmsUseCase
}