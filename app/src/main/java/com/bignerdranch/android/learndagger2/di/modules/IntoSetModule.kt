package com.bignerdranch.android.learndagger2.di.modules

import com.bignerdranch.android.learndagger2.extensions.EventHandlerKey
import com.bignerdranch.android.learndagger2.extensions.EventHandlerType
import com.bignerdranch.android.learndagger2.model.DatabaseHelper
import com.bignerdranch.android.learndagger2.model.event.Analytics
import com.bignerdranch.android.learndagger2.model.event.Event
import com.bignerdranch.android.learndagger2.model.event.EventHandler
import com.bignerdranch.android.learndagger2.model.event.Logger
import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoMap
import dagger.multibindings.IntoSet
import dagger.multibindings.StringKey
import java.util.ArrayList


@Module
class IntoSetModule {


    @IntoMap
    @EventHandlerKey(EventHandlerType.ANALYTICS)
    @Provides
    fun provideAnalytics(): EventHandler {
        return Analytics()
    }

    @IntoMap
    @EventHandlerKey(EventHandlerType.LOGGER)
    @Provides
    fun provideLogger(): EventHandler {
        return Logger()
    }

//    @ElementsIntoSet
//    @Provides
//    fun provideDatabaseEventHandlers(databaseHelper: DatabaseHelper): Set<EventHandler> {
//        return databaseHelper.getEventHandlers()
//    }






}
