package com.psbskb.kotlincounter.page

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val _repository: CounterRepository = CounterRepository()
    private var _count = mutableStateOf(_repository.counter.count)
    val count: MutableState<Int> = _count

    fun increment() {
        _repository.increment()
        _count.value = _repository.counter.count
    }

    fun decrement() {
        _repository.decrement()
        _count.value = _repository.counter.count
    }
}