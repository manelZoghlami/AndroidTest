package com.example.androidtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.room.Room
import com.example.androidtest.ui.addcity.AddCityFragment
import com.example.androidtest.ui.city.CityListFragment
import com.example.androidtest.ui.weatherCity.WeatherCityFragment
import com.example.dataLayer.common.CityDatabase

class MainActivity : AppCompatActivity(), CityListFragment.OnAddCityListFragmentListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
             if(savedInstanceState == null) {
                 navigateToFragment(CityListFragment.newInstance(), true, false)
        }
    }

    override fun onCityClicked(cityName: String) {
        navigateToFragment(WeatherCityFragment.newInstance(cityName), true)
    }

    override fun goToAddCity() {
        navigateToFragment(AddCityFragment.newInstance(), true)
    }

    private fun navigateToFragment( fragment: Fragment?,
                                    withAnimation: Boolean,
                                    addToBackStack: Boolean = true) {
        val transaction = supportFragmentManager.beginTransaction()
        if (addToBackStack)
        transaction.addToBackStack(fragment.toString())
        if (withAnimation) transaction.setCustomAnimations(R.anim.slide_up_anim, R.anim.slide_down_anim)
         else transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        transaction.add(android.R.id.content, fragment!!).addToBackStack(null).commit()
    }
}