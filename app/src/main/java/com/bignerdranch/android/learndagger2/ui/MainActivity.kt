package com.bignerdranch.android.learndagger2.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bignerdranch.android.learndagger2.di.app.App
import com.bignerdranch.android.learndagger2.R

class MainActivity : AppCompatActivity() {

    lateinit var mainActivityPresenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityPresenter = (application as App).appComponent.getMainActivityPresenter()
    }
}