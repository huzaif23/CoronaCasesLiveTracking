package com.app.mvvmpractice.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.app.mvvmpractice.R
import com.app.mvvmpractice.model.CountryCases
import com.app.mvvmpractice.viewmodel.CountryCasesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    var viewModel: CountryCasesViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(CountryCasesViewModel::class.java)
        viewModel!!.getCountryCasesData()
        viewModel!!.getCountryCases().observe(this,{
            Log.d("test",""+it.deaths)
        })
    }

//    fun observeData() {
//        viewModel.getCountryCasesData().
//    }
}