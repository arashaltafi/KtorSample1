package com.arash.altafi.ktorsample1

import android.app.Application
import com.arash.altafi.ktorsample1.di.getApplicationModules
import org.koin.core.context.startKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            androidLogger(Level.DEBUG)
            modules(
                getApplicationModules()
            )
        }
    }
}