package com.bignerdranch.android.learndagger2.di.app

import com.bignerdranch.android.learndagger2.di.modules.MainModule
import com.bignerdranch.android.learndagger2.di.modules.NetworkModule
import com.bignerdranch.android.learndagger2.di.modules.ServerApiModule
import com.bignerdranch.android.learndagger2.di.modules.StorageModule
import com.bignerdranch.android.learndagger2.model.NetworkUtils
import com.bignerdranch.android.learndagger2.model.server.ServerApi
import com.bignerdranch.android.learndagger2.ui.MainActivityPresenter
import dagger.Component
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

    @Named("prod")
    fun getServerApiProd(): ServerApi

    @Named("dev")
    fun getServerApiDev(): ServerApi

}