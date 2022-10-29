package com.example.mercadona.di

import android.content.Context
import com.example.mercadona.AppApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApplication(app: AppApplication) : Context = app
}