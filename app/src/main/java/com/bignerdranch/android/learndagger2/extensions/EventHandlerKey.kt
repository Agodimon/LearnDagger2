package com.bignerdranch.android.learndagger2.extensions

import dagger.MapKey

@MapKey
@Retention(AnnotationRetention.RUNTIME)
annotation class EventHandlerKey(val value: EventHandlerType)
