package com.example.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel:ViewModel() {

private  val _repository= repository()
 private   val _count= mutableStateOf( _repository.getCounter().count)
    val countt: MutableState<Int> =_count

    fun onIncrement(){
       _repository.increment()
        _count.value= _repository.getCounter().count

    }

    fun onDecrement(){
        _repository.decrement()
        _count.value=_repository.getCounter().count

    }





}
