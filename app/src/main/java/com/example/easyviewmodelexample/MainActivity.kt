package com.example.easyviewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.easyviewmodelexample.databinding.ActivityMainBinding

/**
 * This App is for the purpose of demonstrating the implementation of a ViewModel for
 * UIControllers in Android.
 * We have some simple code to increment the count of our TextView each time our Button
 * is clicked.
 * In Main, we show how to declare a variable for our ViewModel;
 * Create an instance of our ViewModel in Main;
 * And then use the methods IN our ViewModel in Main to complete the task.
 *
 * We also demonstrate how to use LiveData, and ViewBinding.
 */
class MainActivity : AppCompatActivity() {

    // declare data binding variable
    private lateinit var binding: ActivityMainBinding

    // declare a variable to use for our ViewModel
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        /**
         * Because we are not passing in arguments into our constructor for our ViewModel,
         * we do not need a factory class. To get a reference to our ViewModel, you simply
         * just set the viewModel variable we declared = to the ViewModelProvider.
         * Say it's for this class, and then type the name of the ViewModel we made.
         */
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)


        binding.apply {
            /**
             * Normally we would use "binding.ect" to assign our views.
             * "apply {}" scope method extends the functionality of methods so
             * we don't have to keep using binding. .
             */
            // assigning our ViewModel in our XML DataBinding to our MainViewModel
            viewModelXML = viewModel

            // assigning our LifeCycleOwner for our LiveData to THIS class or Activity
            // this allows us to use LiveData in our XML
            lifecycleOwner = this@MainActivity

        }
    }
}