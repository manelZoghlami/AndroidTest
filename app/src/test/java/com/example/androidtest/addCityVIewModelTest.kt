package com.example.androidtest

import android.util.Log
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.androidtest.ui.addcity.AddCityViewModel
import com.example.androidtest.ui.addcity.model.CityUI
import com.example.androidtest.ui.addcity.model.mapping.toCity
import com.example.domainlayer.models.City
import com.example.domainlayer.repository.CityRepository
import com.example.domainlayer.useCase.SaveCityUseCase
import io.mockk.Answer
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.verify
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.kotlin.whenever


@OptIn(ExperimentalCoroutinesApi::class)
class CityRepositoryImpl {
    @get:Rule
    val testInstantTaskExecutorRule: TestRule = InstantTaskExecutorRule()

    @get:Rule
    val testCoroutineRule = TestCoroutineRule()

    @Mock
    private lateinit var cityRepository: CityRepository

    private val saveCityUseCase = Mockito.mock(SaveCityUseCase::class.java)

    //Annotation de MockK permettant d’injecter automatiquement le mock à notre viewModel
    @InjectMockKs
    private lateinit var viewModel: AddCityViewModel

    private val addCityViewModel = AddCityViewModel(saveCityUseCase)

    private var cityUI = CityUI("Paris")

    //Annotation de JUnit permettant d’appeler la méthode setUp() avant chaque test
    @Before
    fun setUp() = MockKAnnotations.init(this)

    @Test
    fun `check  addCity`() = runTest {
        testCoroutineRule.runBlockingTest {
            val city = addCityViewModel.addCity(cityUI)

        }
    }
}
