package com.bignerdranch.android.learndagger2.di

import com.bignerdranch.android.learndagger2.MainActivityPresenter
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