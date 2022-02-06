package com.bignerdranch.android.learndagger2.di.app

import android.app.Application
import com.bignerdranch.android.learndagger2.di.DaggerAppComponent

class App:Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}