package com.example.mercadona.di.module

import android.content.Context
import com.example.mercadona.data.local.dao.FilmDao
import com.example.mercadona.data.local.database.AppRoomDatabase
import com.example.mercadona.data.local.datasource.FilmLocalDataSource
import com.example.mercadona.data.local.datasource.FilmLocalDataSourceImpl
import com.example.mercadona.data.local.repository.FilmLocalRepository
import com.example.mercadona.data.local.repository.FilmLocalRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FilmLocalModule {

    @Provides
    fun filmLocalRepository(local: FilmLocalDataSource) =
        FilmLocalRepositoryImpl(local) as FilmLocalRepository

    @Provides
    fun filmLocalDataSource(filmDao: FilmDao) =
        FilmLocalDataSourceImpl(filmDao) as FilmLocalDataSource

    @Provides
    @Singleton
    fun appRoomDatabaseProvider(context: Context) =
        AppRoomDatabase.buildDatabase(context) as AppRoomDatabase
}