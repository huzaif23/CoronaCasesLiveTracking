package com.app.mvvmpractice.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.app.mvvmpractice.model.CountryCases

@Database(entities = [CountryCases::class], version = 1, exportSchema = false)
abstract class CoronaDb : RoomDatabase() {
    abstract fun getCountryCasesDao(): CountryCasesDao
}