package com.bignerdranch.android.learndagger2.di.app

import com.bignerdranch.android.learndagger2.di.modules.MainModule
import com.bignerdranch.android.learndagger2.di.modules.NetworkModule
import com.bignerdranch.android.learndagger2.di.modules.StorageModule
import com.bignerdranch.android.learndagger2.ui.MainActivityPresenter
import dagger.Component

@Component(modules = [StorageModule::class, NetworkModule::class, MainModule::class])
interface AppComponent {

    fun getMainActivityPresenter(): MainActivityPresenter
}