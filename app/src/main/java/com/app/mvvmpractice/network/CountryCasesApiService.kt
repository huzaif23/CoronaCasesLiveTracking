package com.app.mvvmpractice.network

import com.app.mvvmpractice.model.CountryCases
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

interface CountryCasesApiService {

    @GET("countries/Pakistan?yesterday/")
    fun getCountryCasesDetails(): Observable<CountryCases>
}