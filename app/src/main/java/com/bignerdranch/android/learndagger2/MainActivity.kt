package com.bignerdranch.android.learndagger2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bignerdranch.android.learndagger2.di.DatabaseHelper
import com.bignerdranch.android.learndagger2.di.NetworkModule
import com.bignerdranch.android.learndagger2.di.NetworkUtils
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var mainActivityPresenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityPresenter = (application as App).appComponent.getMainActivityPresenter()
    }
}