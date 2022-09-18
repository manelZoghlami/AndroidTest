package com.example.androidtest.di.modules

import android.content.Context
import androidx.room.Room
import com.example.dataLayer.city.CityDao
import com.example.dataLayer.common.CityDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule {

    @Provides
    fun provideCityDao(cityDatabase: CityDatabase): CityDao {
        return cityDatabase.cityDao()
    }

    @Provides
    @Singleton
    fun provideAppDataBase(appContext: Context): CityDatabase {
        return Room.databaseBuilder(
            appContext,
            CityDatabase::class.java, "city"
        ).build()
    }


}