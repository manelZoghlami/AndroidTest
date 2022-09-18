package com.example.androidtest.ui.addcity

import android.view.View
import androidx.core.view.isVisible
import com.example.androidtest.databinding.FragmentAddCityBinding
import com.example.androidtest.ui.addcity.model.CityUI
import com.example.androidtest.utils.visibleIf

class AddCityView(
    view: View,
    viewModel: AddCityViewModel, binding: FragmentAddCityBinding
) {

    init {

        binding.insert.setOnClickListener {
            binding.cityErrorInputLayout.visibleIf(binding.city.text.isNullOrBlank())
            binding.cityErrorInputLayout.error= "Requis"

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