package com.example.android.navigation

import android.app.Application
import timber.log.Timber

class AndroidTriviaApp :Application(){

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}