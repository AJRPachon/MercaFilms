package com.example.mercadona.di.component

import com.example.mercadona.AppApplication
import com.example.mercadona.di.module.*
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        FilmRemoteModule::class,
        FilmLocalModule::class,
        FilmBaseModule::class,
        NetworkModule::class,
        ViewModelModule::class
    ]
)
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: AppApplication): Builder
        fun build(): AppComponent
    }

    fun inject(app: AppApplication)
}