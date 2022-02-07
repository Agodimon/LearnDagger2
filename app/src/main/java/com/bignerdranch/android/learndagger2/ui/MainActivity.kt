package com.bignerdranch.android.learndagger2.ui

import android.app.Application
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.bignerdranch.android.learndagger2.di.app.App
import com.bignerdranch.android.learndagger2.R
import com.bignerdranch.android.learndagger2.model.ConnectionManager
import com.bignerdranch.android.learndagger2.model.NetworkUtils
import com.bignerdranch.android.learndagger2.model.event.EventHandler
import com.bignerdranch.android.learndagger2.model.server.ServerApi

class MainActivity : AppCompatActivity() {

    lateinit var networkUtilsLazy: dagger.Lazy<NetworkUtils>
    lateinit var serverApiOne: ServerApi
    lateinit var serverApiTwo: ServerApi

    lateinit var eventHandler: Set<EventHandler>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        networkUtilsLazy = (application as App).appComponent.getNetworkUtils()
        findViewById<Button>(R.id.button_one).setOnClickListener {
            val networkUtils = networkUtilsLazy.get()
        }

        serverApiOne = (application as App).appComponent.getServerApiDev()
        serverApiTwo = (application as App).appComponent.getServerApiProd1()




    }
}