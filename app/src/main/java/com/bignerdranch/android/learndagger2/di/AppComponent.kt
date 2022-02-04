package com.bignerdranch.android.learndagger2.di

import com.bignerdranch.android.learndagger2.MainActivity
import dagger.Component

@Component(modules = [StorageModule::class, NetworkModule::class])
interface AppComponent {
//fun getDatabaseHelper():DatabaseHelper
//fun getNetworkUtils():NetworkUtils
fun injectMainActivity(mainActivity: MainActivity)
}