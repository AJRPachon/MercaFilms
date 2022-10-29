package com.example.mercadona

import android.app.Application
import com.example.mercadona.di.DaggerAppComponent

open class AppApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        configureDi()
    }

    open fun configureDi() {
        DaggerAppComponent.builder()
            .application(this)
            .build()
            .inject(this)
    }

}