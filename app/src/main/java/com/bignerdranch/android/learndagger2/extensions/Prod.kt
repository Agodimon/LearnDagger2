package com.bignerdranch.android.learndagger2.extensions

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Prod(val value:String="")