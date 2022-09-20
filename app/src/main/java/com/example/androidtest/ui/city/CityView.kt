package com.example.androidtest.ui.city
import androidx.core.view.isVisible
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.example.androidtest.databinding.FragmentCityListBinding

class CityView(private val binding: FragmentCityListBinding,
               owner: LifecycleOwner,
               private val onCitySelected: (String) -> Unit,
               private val goToAddCity: () -> Unit,
               private val viewModel: CityViewModel) : CityAdapter.OnItemCityListClickedListener {
    private var adapter: CityAdapter? = null
    init {
        initializeRecyclerView()
        viewModel.state.observe(owner, Observer { list ->
            binding.emptyList.isVisible = list.isEmpty()
            adapter?.cityList = ArrayList(list)
        })
        binding.iconAddCity.setOnClickListener { 
            goToAddCity.invoke()
        }
        viewModel.getAllCity()
    }

    fun getAllCity() = viewModel.getAllCity()

    private fun initializeRecyclerView() {
        adapter = CityAdapter()
        binding.recyclerView.adapter = adapter
        adapter?.updateListener(this)
    }

    override fun onItemClicked(cityName: String) {
      onCitySelected.invoke(cityName)
    }
}