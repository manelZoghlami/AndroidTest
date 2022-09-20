package com.example.androidtest.ui.city

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidtest.databinding.FragmentCityListBinding
import com.example.androidtest.di.injector
import javax.inject.Inject

open class CityListFragment : Fragment() {

    private lateinit var binding: FragmentCityListBinding

    @Inject
    lateinit var cityViewModel: CityViewModel
    private var mListener: OnAddCityListFragmentListener? = null
    private var mView: CityView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injector?.inject(this)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnAddCityListFragmentListener) {
            this.mListener = context
        } else {
            throw IllegalStateException("Activity must implement OnAddCityListFragmentListener")
        }
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
        mView = CityView(
            binding = binding,
            onCitySelected = { cityName -> mListener?.onCityClicked(cityName) },
            goToAddCity = { mListener?.goToAddCity() },
            owner = viewLifecycleOwner,
            viewModel = cityViewModel
        )
    }

    override fun onResume() {
        super.onResume()
        mView?.getAllCity()
    }

    companion object {
        @JvmStatic
        fun newInstance() = CityListFragment()
    }

    interface OnAddCityListFragmentListener {
        fun onCityClicked(cityName: String)
        fun goToAddCity()
    }
}