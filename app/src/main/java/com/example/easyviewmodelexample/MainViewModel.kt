package com.example.easyviewmodelexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * ViewModels hold the responsibility of handling all business logic for all UI Controllers
 * (Activities or Fragments).
 * In this example, we just want to increment the _count of the textview each time the button
 * is pressed. So we only need one methods:
 * 1. Return the updated _count after the button is pressed.
 *
 * We also have implemented an example of LiveData using a backing property so our MainActivity
 * will be able to use the property.
 */
class MainViewModel: ViewModel() {

    // declaring a LiveData variable to count the number of button presses
    private var _count = MutableLiveData<Int>(0)
    val count: LiveData<Int>
    get() = _count

    // initiation block that starts as soon as the ViewModel is called
    init {
        _count.value = 0
    }

    // Method to update current _count that we will reference in main
    // also increments the count each time
    fun updateCount() {
       _count.value = _count.value?.plus(1)
    }

}