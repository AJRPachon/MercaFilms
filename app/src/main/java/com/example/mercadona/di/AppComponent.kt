package com.example.mercadona.di

import com.example.mercadona.AppApplication
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = []
)
interface AppComponent {

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: AppApplication) : Builder
        fun build(): AppComponent
    }

    fun inject(app : AppApplication)
}