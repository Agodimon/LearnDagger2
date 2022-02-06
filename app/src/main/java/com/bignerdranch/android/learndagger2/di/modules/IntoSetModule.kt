package com.bignerdranch.android.learndagger2.di.modules

import com.bignerdranch.android.learndagger2.model.event.Analytics
import com.bignerdranch.android.learndagger2.model.event.Event
import com.bignerdranch.android.learndagger2.model.event.EventHandler
import com.bignerdranch.android.learndagger2.model.event.Logger
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet


@Module
class IntoSetModule {

    @IntoSet
    @Provides
    fun provideAnalytics(): EventHandler {
        return Analytics()
    }

    @IntoSet
    @Provides
    fun provideLogger(): EventHandler {
        return Logger()
    }

}