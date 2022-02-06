package com.bignerdranch.android.learndagger2.di.modules

import com.bignerdranch.android.learndagger2.extensions.Dev
import com.bignerdranch.android.learndagger2.extensions.Prod
import com.bignerdranch.android.learndagger2.model.ConnectionManager
import com.bignerdranch.android.learndagger2.model.NetworkUtils
import com.bignerdranch.android.learndagger2.model.server.ServerApi
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class ServerApiModule {

    @Prod("1")
    @Provides
    fun provideServerApiProd1(): ServerApi {
        return ServerApi("prod1.server.com")
    }

    @Prod("2")
    @Provides
    fun provideServerApiProd2(): ServerApi {
        return ServerApi("prod2.server.com")
    }

    @Dev
    @Provides
    fun provideServerApiDev(): ServerApi {
        return ServerApi("dev.server.com")
    }
}