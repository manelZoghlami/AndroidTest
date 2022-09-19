package com.example.androidtest.ui.weatherCity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidtest.R
import com.example.androidtest.databinding.FragmentCityListBinding
import com.example.androidtest.databinding.FragmentWeatherCityBinding
import com.example.androidtest.di.injector
import com.example.androidtest.ui.city.CityViewModel
import javax.inject.Inject

class WeatherCityFragment : Fragment() {
    private lateinit var binding: FragmentWeatherCityBinding
    @Inject
    lateinit var weatherCityViewModel: WeatherCityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector?.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWeatherCityBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        WeatherCityView(binding = binding,
                        viewModel = weatherCityViewModel,
                        name = arguments?.getString("city") ?:"",
                        owner = viewLifecycleOwner)

    }

    companion object {
        fun newInstance(cityName: String) =
            WeatherCityFragment().apply {
                arguments = Bundle().apply {
                   putString("city", cityName)
                }
            }
    }
}