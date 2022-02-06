package com.bignerdranch.android.learndagger2.di.modules

import com.bignerdranch.android.learndagger2.model.ConnectionManager
import com.bignerdranch.android.learndagger2.model.NetworkUtils
import com.bignerdranch.android.learndagger2.model.server.ServerApi
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class ServerApiModule {

    @Named("prod")
    @Provides
    fun provideServerApiProd(): ServerApi {
        return ServerApi("prod.server.com")
    }

    @Named("dev")
    @Provides
    fun provideServerApiDev(): ServerApi {
        return ServerApi("dev.server.com")
    }
}