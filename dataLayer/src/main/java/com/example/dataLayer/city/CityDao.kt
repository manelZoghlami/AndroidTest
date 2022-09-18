package com.example.dataLayer.city

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.dataLayer.city.models.CityEntity
import com.example.domainlayer.models.City


@Dao
interface CityDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCity(cityEntity: CityEntity)

    @Query("Select * from city")
    fun gelAllCity(): List<CityEntity>
}
