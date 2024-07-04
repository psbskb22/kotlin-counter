package com.psbskb.kotlincounter.page

data class CounterModel(var count: Int)

class CounterRepository {
    private var _counter = CounterModel(0)

    var counter: CounterModel = _counter

    fun increment() {
        _counter.count++;
    }

    fun decrement() {
        if (_counter.count > 0) {
            _counter.count--;
        }
    }
}