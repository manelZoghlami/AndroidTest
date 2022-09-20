package com.example.androidtest.ui.addcity

import android.widget.Toast
import com.example.androidtest.databinding.FragmentAddCityBinding
import com.example.androidtest.ui.addcity.model.CityUI

class AddCityView(
    viewModel: AddCityViewModel,
    binding: FragmentAddCityBinding,
    goToBack: () -> Unit
) {

    init {
        binding.insert.setOnClickListener {
            if (binding.city.text.isNullOrBlank()) {
              Toast.makeText(binding.root.context, "Requis", Toast.LENGTH_LONG).show()
            }else {
                viewModel.addCity(
                    CityUI(
                        binding.city.text.toString()
                    )
                )
                goToBack.invoke()
            }

        }

    }
}