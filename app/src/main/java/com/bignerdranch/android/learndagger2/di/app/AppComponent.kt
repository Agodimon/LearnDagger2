package com.bignerdranch.android.learndagger2.di.app

import com.bignerdranch.android.learndagger2.di.modules.*
import com.bignerdranch.android.learndagger2.extensions.Dev
import com.bignerdranch.android.learndagger2.extensions.EventHandlerType
import com.bignerdranch.android.learndagger2.extensions.Prod
import com.bignerdranch.android.learndagger2.model.DatabaseHelper
import com.bignerdranch.android.learndagger2.model.NetworkUtils
import com.bignerdranch.android.learndagger2.model.event.EventHandler
import com.bignerdranch.android.learndagger2.model.server.ServerApi
import com.bignerdranch.android.learndagger2.ui.MainActivity
import com.bignerdranch.android.learndagger2.ui.MainActivityPresenter
import dagger.Component
import dagger.Provides
import javax.inject.Named


@Component(
    modules = [
        StorageModule::class,
        NetworkModule::class,
        MainModule::class,
        ServerApiModule::class,
        IntoSetModule::class
    ]
)
interface AppComponent {
fun injectMainActivity(mainActivity: MainActivity)
}