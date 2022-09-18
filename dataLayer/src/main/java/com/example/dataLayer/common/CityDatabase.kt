package com.example.dataLayer.common
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.dataLayer.city.CityDao
import com.example.dataLayer.city.models.CityEntity

@Database
    (entities = [CityEntity::class],
    version = 1,
    exportSchema = false
)

abstract class CityDatabase : RoomDatabase() {
abstract fun cityDao(): CityDao
}