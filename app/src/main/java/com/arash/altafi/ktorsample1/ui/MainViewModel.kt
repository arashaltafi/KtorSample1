package com.arash.altafi.ktorsample1.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.arash.altafi.ktorsample1.datasource.repository.RandomPersonRepository
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

private typealias PeopleList = List<Person>

class MainViewModel(
    private val randomPersonRepository: RandomPersonRepository
) : ViewModel() {

    private val _sharedFlow = MutableSharedFlow<PeopleList>(
        replay = 1,
        onBufferOverflow = BufferOverflow.SUSPEND
    )

    val peopleListFlow: SharedFlow<PeopleList> = _sharedFlow

    fun getRandomUsers(resultListCount: Int) = viewModelScope.launch {
        _sharedFlow.emitAll(
            randomPersonRepository.getUsers(resultListCount)
        )

    }

}