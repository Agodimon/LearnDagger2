package com.bignerdranch.android.learndagger2.model.event

interface EventHandler {
    fun handle(event: Event)
}