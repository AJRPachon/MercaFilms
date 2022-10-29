package com.example.mercadona.di.component

import com.example.mercadona.AppApplication
import com.example.mercadona.di.module.AppModule
import com.example.mercadona.di.module.FilmLocalModule
import com.example.mercadona.di.module.FilmRemoteModule
import com.example.mercadona.di.module.NetworkModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        FilmRemoteModule::class,
        FilmLocalModule::class,
        NetworkModule::class
    ]
)
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: AppApplication) : Builder
        fun build(): AppComponent
    }

    fun inject(app : AppApplication)
}