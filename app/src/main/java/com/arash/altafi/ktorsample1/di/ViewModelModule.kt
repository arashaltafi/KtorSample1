package com.arash.altafi.ktorsample1.di

import com.arash.altafi.ktorsample1.datasource.repository.RandomPersonRepository
import com.arash.altafi.ktorsample1.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    factory {
        RandomPersonRepository(get())
    }

    viewModel {
        MainViewModel(get())
    }
}