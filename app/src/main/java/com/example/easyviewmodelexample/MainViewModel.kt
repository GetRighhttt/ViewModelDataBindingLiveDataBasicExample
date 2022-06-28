package com.example.easyviewmodelexample

import androidx.lifecycle.ViewModel

/**
 * ViewModels hold the responsibility of handling all business logic for all UI Controllers
 * (Activities or Fragments).
 * In this example, we just want to increment the count of the textview each time the button
 * is pressed. So we only need two methods:
 * 1. Return the current count.
 * 2. Return the updated count after the button is pressed.
 */
class MainViewModel: ViewModel() {
    private var count = 0

    // method to return the current count that we will reference in Main
    fun returnCurrentCount(): Int {
        return count
    }

    // Method to update current count that we will reference in main
    fun returnUpdatedCount(): Int {
        return ++count
    }

}