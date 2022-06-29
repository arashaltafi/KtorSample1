package com.arash.altafi.ktorsample1.di

import com.arash.altafi.ktorsample1.datasource.network.NetworkSource
import com.arash.altafi.ktorsample1.datasource.network.RandomUserApi
import org.koin.dsl.module

val networkModule = module {
    single<NetworkSource>{
        RandomUserApi()
    }
}