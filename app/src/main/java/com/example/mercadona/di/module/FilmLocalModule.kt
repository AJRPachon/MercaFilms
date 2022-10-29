package com.example.mercadona.di.module

import android.content.Context
import com.example.mercadona.data.local.database.AppRoomDatabase
import com.example.mercadona.data.local.repository.FilmLocalRepository
import com.example.mercadona.data.local.repository.FilmLocalRepositoryImpl
import com.example.mercadona.data.repository.FilmLocalDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FilmLocalModule {

    @Provides
    fun filmLocalRepository(local: FilmLocalDataSource) =
        FilmLocalRepositoryImpl(local) as FilmLocalRepository

    @Provides
    @Singleton
    fun appRoomDatabaseProvider(context: Context) =
        AppRoomDatabase.buildDatabase(context) as AppRoomDatabase
}