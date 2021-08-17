package com.app.mvvmpractice.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "country_cases")
data class CountryCases(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "country") val country: String,
    @ColumnInfo(name = "lat_lon") val countryLatLon: String?,
    @ColumnInfo(name = "flag") val flag: String,
    @ColumnInfo(name = "continent") val continent: String?,
    @ColumnInfo(name = "cases") val cases: String,
    @ColumnInfo(name = "today_cases") val todayCases: String,
    @ColumnInfo(name = "deaths") val deaths: String,
    @ColumnInfo(name = "recovered") val recovered: String,
    @ColumnInfo(name = "active") val active: String,
    @ColumnInfo(name = "critical") val critical: String
)