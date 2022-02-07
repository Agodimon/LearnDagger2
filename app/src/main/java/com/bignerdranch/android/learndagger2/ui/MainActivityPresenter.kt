package com.bignerdranch.android.learndagger2.ui

import com.bignerdranch.android.learndagger2.model.DatabaseHelper
import com.bignerdranch.android.learndagger2.model.NetworkUtils
import javax.inject.Inject

class MainActivityPresenter @Inject constructor(
    private val databaseHelper: DatabaseHelper,
    private val networkUtils: NetworkUtils
) {

    fun postInit(networkUtils: NetworkUtils){
        //..
    }
}