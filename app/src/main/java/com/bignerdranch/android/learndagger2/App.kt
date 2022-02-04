package com.bignerdranch.android.learndagger2

import android.app.Application
import com.bignerdranch.android.learndagger2.di.AppComponent
import com.bignerdranch.android.learndagger2.di.DaggerAppComponent

class App:Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}