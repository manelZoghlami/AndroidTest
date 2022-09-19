package com.example.androidtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.example.androidtest.ui.addcity.AddCityFragment
import com.example.androidtest.ui.city.CityListFragment
import com.example.androidtest.ui.weatherCity.WeatherCityFragment
import com.example.dataLayer.common.CityDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
             if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.root_container, WeatherCityFragment.newInstance(0.0, 0.0))
                .commitAllowingStateLoss()
        }
    }
}