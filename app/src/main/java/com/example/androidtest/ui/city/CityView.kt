package com.example.androidtest.ui.city

import android.view.View
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.example.androidtest.databinding.FragmentCityListBinding

class CityView(private val binding: FragmentCityListBinding,
               owner: LifecycleOwner,
               viewModel: CityViewModel) : CityAdapter.OnItemCityListClickedListener {
    private var adapter: CityAdapter? = null
    init {
        initializeRecyclerView()
        viewModel.state.observe(owner, Observer { list ->
            adapter?.cityList = ArrayList(list)

        })
    }
    private fun initializeRecyclerView() {
        adapter = CityAdapter()
        binding.recyclerView.adapter = adapter
        adapter?.updateListener(this)
    }

    override fun onItemClicked() {

    }
}