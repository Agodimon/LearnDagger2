package com.bignerdranch.android.learndagger2.di.modules

import com.bignerdranch.android.learndagger2.model.DatabaseHelper
import com.bignerdranch.android.learndagger2.model.NetworkUtils
import com.bignerdranch.android.learndagger2.ui.MainActivityPresenter
import dagger.Module
import dagger.Provides


@Module
class MainModule {
    @Provides
    fun provideMainActivityPresenter(
        databaseHelper: DatabaseHelper,
        networkUtils: NetworkUtils
    ): MainActivityPresenter {
        return MainActivityPresenter(databaseHelper, networkUtils)
    }
}