package com.bignerdranch.android.learndagger2.ui

import com.bignerdranch.android.learndagger2.model.DatabaseHelper
import com.bignerdranch.android.learndagger2.model.NetworkUtils

class MainActivityPresenter(
    private val databaseHelper: DatabaseHelper,
    private val networkUtils: NetworkUtils
) {
}