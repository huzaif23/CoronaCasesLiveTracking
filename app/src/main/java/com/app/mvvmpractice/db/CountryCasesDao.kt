package com.app.mvvmpractice.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.app.mvvmpractice.model.CountryCases

@Dao
interface CountryCasesDao {

    @Insert
    fun insertCountryCases(countryCases: CountryCases)

    @Query("Select * from country_cases")
    fun getCountryCases(): LiveData<CountryCases>

}