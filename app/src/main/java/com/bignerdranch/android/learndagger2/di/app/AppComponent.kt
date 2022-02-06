package com.bignerdranch.android.learndagger2.di.app

import com.bignerdranch.android.learndagger2.di.modules.MainModule
import com.bignerdranch.android.learndagger2.di.modules.NetworkModule
import com.bignerdranch.android.learndagger2.di.modules.ServerApiModule
import com.bignerdranch.android.learndagger2.di.modules.StorageModule
import com.bignerdranch.android.learndagger2.extensions.Dev
import com.bignerdranch.android.learndagger2.extensions.Prod
import com.bignerdranch.android.learndagger2.model.NetworkUtils
import com.bignerdranch.android.learndagger2.model.server.ServerApi
import com.bignerdranch.android.learndagger2.ui.MainActivityPresenter
import dagger.Component
import dagger.Provides
import javax.inject.Named


@Component(
    modules = [
        StorageModule::class,
        NetworkModule::class,
        MainModule::class,
        ServerApiModule::class
    ]
)
interface AppComponent {

    fun getNetworkUtils(): dagger.Lazy<NetworkUtils>

    @Prod("1")
    fun getServerApiProd1(): ServerApi

    @Prod("2")
    fun getServerApiProd2(): ServerApi

    @Dev
    fun getServerApiDev(): ServerApi

}