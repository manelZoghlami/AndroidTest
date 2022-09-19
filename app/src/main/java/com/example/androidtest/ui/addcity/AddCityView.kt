package com.example.androidtest.ui.addcity

import android.view.View
import com.example.androidtest.databinding.FragmentAddCityBinding
import com.example.androidtest.ui.addcity.model.CityUI

class AddCityView(
    viewModel: AddCityViewModel, binding: FragmentAddCityBinding
) {

    init {
        binding.insert.setOnClickListener {
            if (binding.city.text.isNullOrBlank()) {
                binding.cityErrorInputLayout.error = "Requis"
            }
            viewModel.addCity(
                CityUI(
                    binding.city.text.toString(),
                    binding.lat.text.toString().toDouble(),
                    binding.lng.text.toString().toDouble()
                )
            )
        }

    }
}