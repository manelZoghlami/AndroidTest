package com.example.androidtest.ui.city

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidtest.databinding.FragmentCityListBinding
import com.example.androidtest.di.injector
import com.example.androidtest.ui.addcity.AddCityViewModel
import javax.inject.Inject

class CityListFragment : Fragment() {

    private lateinit var binding: FragmentCityListBinding
    @Inject
    lateinit var cityViewModel: CityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector?.inject(this)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCityListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        CityView(
            binding = binding,
            owner = viewLifecycleOwner,
            viewModel = cityViewModel
        )
    }

    companion object {
        @JvmStatic
        fun newInstance() = CityListFragment()
    }
}