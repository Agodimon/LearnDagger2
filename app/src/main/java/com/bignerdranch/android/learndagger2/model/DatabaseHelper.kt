package com.bignerdranch.android.learndagger2.model

import javax.inject.Inject

class DatabaseHelper @Inject constructor(private val repository: Repository)