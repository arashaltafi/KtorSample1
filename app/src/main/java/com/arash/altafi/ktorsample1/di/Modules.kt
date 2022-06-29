package com.arash.altafi.ktorsample1.di

import org.koin.core.module.Module

fun getApplicationModules() : List<Module> = listOf(networkModule, viewModelModule)