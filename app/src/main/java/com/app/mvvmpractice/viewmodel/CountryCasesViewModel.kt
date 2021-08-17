package com.app.mvvmpractice.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.mvvmpractice.model.CountryCases
import com.app.mvvmpractice.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class CountryCasesViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    private val countryCases: MutableLiveData<CountryCases> = MutableLiveData()

    fun getCountryCasesData() {
        repository.getCountryCases()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                countryCases.value = it
            }, { throwable -> Log.d("test", "error" + throwable.localizedMessage) })
    }

    fun getCountryCases(): MutableLiveData<CountryCases> {
        return countryCases
    }

}