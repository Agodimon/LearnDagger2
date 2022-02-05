package com.bignerdranch.android.learndagger2.di

import com.bignerdranch.android.learndagger2.MainActivity
import com.bignerdranch.android.learndagger2.MainActivityPresenter
import dagger.Component

@Component(modules = [StorageModule::class, NetworkModule::class, MainModule::class])
interface AppComponent {

    fun getMainActivityPresenter(): MainActivityPresenter
}