package com.bignerdranch.android.learndagger2.di

import dagger.Module
import dagger.Provides

@Module
class StorageModule {

    @Provides
    fun provideDatabaseHelper(): DatabaseHelper {
        return DatabaseHelper()
    }

}