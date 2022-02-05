package com.bignerdranch.android.learndagger2.di

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