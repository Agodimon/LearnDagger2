package com.bignerdranch.android.learndagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bignerdranch.android.learndagger2.di.DatabaseHelper
import com.bignerdranch.android.learndagger2.di.NetworkModule
import com.bignerdranch.android.learndagger2.di.NetworkUtils
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    //    lateinit var databaseHelper: DatabaseHelper
    //    lateinit var networkUtils: NetworkUtils

    @Inject
    lateinit var databaseHelper: DatabaseHelper

    @Inject
    lateinit var networkUtils: NetworkUtils




//    @Inject
//    lateinit var print:NetworkModule

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val appComponent = (application as App).appComponent
//        databaseHelper = appComponent.getDatabaseHelper()
//        networkUtils = appComponent.getNetworkUtils()

        (application as App)
            .appComponent
            .injectMainActivity(this)
//     Log.d("TAG",print.printer("print msg DI"))
        databaseHelper
        networkUtils.printer("Hello44444444444444444444444444444444444")
        networkUtils.printerOne("6545555555554588888888888888888888888888888888")


    }
}