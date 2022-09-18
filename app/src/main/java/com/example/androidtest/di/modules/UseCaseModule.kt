package com.example.androidtest.di.modules

import com.example.domainlayer.repository.CityRepository
import com.example.domainlayer.useCase.GetAllCityUseCase
import com.example.domainlayer.useCase.SaveCityUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {
    @Provides
    fun provideSaveCityUseCase(repository: CityRepository): SaveCityUseCase {
        return SaveCityUseCase(repository)
    }

    @Provides
    fun provideCityListUseCase(repository: CityRepository): GetAllCityUseCase {
        return GetAllCityUseCase(repository)
    }
}