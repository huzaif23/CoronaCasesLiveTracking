package com.app.mvvmpractice.repository

import com.app.mvvmpractice.db.CountryCasesDao
import com.app.mvvmpractice.model.CountryCases
import com.app.mvvmpractice.network.CountryCasesApiService
import io.reactivex.rxjava3.core.Observable
import javax.inject.Inject

class Repository @Inject constructor(
    val countryCasesDao: CountryCasesDao,
    private val countryCasesApiService: CountryCasesApiService
) {

    fun getCountryCases(): Observable<CountryCases> {
        return countryCasesApiService.getCountryCasesDetails()
    }

}