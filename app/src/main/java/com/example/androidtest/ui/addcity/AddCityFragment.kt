package com.example.androidtest.ui.addcity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidtest.databinding.FragmentAddCityBinding
import com.example.androidtest.di.injector
import javax.inject.Inject

class AddCityFragment : Fragment() {

    @Inject lateinit var addCityViewModel: AddCityViewModel
    private lateinit var binding: FragmentAddCityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector?.inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddCityBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        AddCityView(view = view,
            binding = binding,
            viewModel = addCityViewModel)
    }
    companion object {
        @JvmStatic
        fun newInstance() = AddCityFragment()
    }
}