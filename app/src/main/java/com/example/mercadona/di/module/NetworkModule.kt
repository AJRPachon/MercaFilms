package com.example.mercadona.di.module

import com.example.mercadona.data.remote.ws.FilmWs
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule{

    @Provides
    @Singleton
    fun retrofitProvider(okHttpClient : OkHttpClient): FilmWs =
        Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("https://ghibliapi.herokuapp.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FilmWs::class.java)

}