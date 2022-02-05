package com.bignerdranch.android.learndagger2

import com.bignerdranch.android.learndagger2.di.DatabaseHelper
import com.bignerdranch.android.learndagger2.di.NetworkUtils

class MainActivityPresenter(
    private val databaseHelper: DatabaseHelper,
    private val networkUtils: NetworkUtils
) {
}