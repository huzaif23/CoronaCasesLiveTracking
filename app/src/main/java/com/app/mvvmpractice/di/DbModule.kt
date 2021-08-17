package com.app.mvvmpractice.di

import android.app.Application
import androidx.room.Room
import com.app.mvvmpractice.db.CoronaDb
import com.app.mvvmpractice.db.CountryCasesDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DbModule {

    @Provides
    @Singleton
    fun getDatabase(context: Application): CoronaDb {
        return Room.databaseBuilder(context, CoronaDb::class.java, "CoronaDb")
            .fallbackToDestructiveMigration()
            .allowMainThreadQueries()
            .build()
    }

    @Provides
    @Singleton
    fun getCountryCasesDao(db: CoronaDb): CountryCasesDao {
        return db.getCountryCasesDao()
    }

}