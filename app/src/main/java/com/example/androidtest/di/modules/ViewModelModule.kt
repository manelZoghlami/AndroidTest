package com.example.androidtest.di.modules

import com.example.androidtest.ui.addcity.AddCityViewModel
import com.example.androidtest.ui.city.CityViewModel
import com.example.androidtest.ui.weatherCity.WeatherCityViewModel
import com.example.domainlayer.useCase.GetAllCityUseCase
import com.example.domainlayer.useCase.SaveCityUseCase
import com.example.domainlayer.useCase.WeatherCityUseCase
import dagger.Module
import dagger.Provides

@Module
class ViewModelModule {
    @Provides
    fun provideAddCityViewModel(useCase: SaveCityUseCase): AddCityViewModel{
        return AddCityViewModel(useCase)
    }
    @Provides
    fun provideGetAllCityViewModel(useCase: GetAllCityUseCase): CityViewModel {
        return CityViewModel(useCase)
    }
    @Provides
    fun provideWeatherCityViewModel(useCase: WeatherCityUseCase): WeatherCityViewModel {
        return WeatherCityViewModel(useCase)
    }
}