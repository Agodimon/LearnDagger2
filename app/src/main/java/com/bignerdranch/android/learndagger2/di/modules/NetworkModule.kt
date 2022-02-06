package com.bignerdranch.android.learndagger2.di.modules

import com.bignerdranch.android.learndagger2.model.ConnectionManager
import com.bignerdranch.android.learndagger2.model.NetworkUtils
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {

    @Provides
    fun provideNetworkUtils(connectionManager: ConnectionManager): NetworkUtils {
        return NetworkUtils(connectionManager)
    }

    @Provides
    fun provideConnectionManager(): ConnectionManager {
        return ConnectionManager()
    }

}