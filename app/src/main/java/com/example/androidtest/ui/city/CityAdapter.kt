package com.example.androidtest.ui.city

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidtest.databinding.ItemCityBinding
import com.example.androidtest.ui.addcity.model.CityUI

internal class CityAdapter : RecyclerView.Adapter<CityAdapter.CityViewHolder>() {

    var cityList: ArrayList<CityUI> = arrayListOf()
    private var listener: OnItemCityListClickedListener? = null

    lateinit var binding: ItemCityBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        binding =
            ItemCityBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CityViewHolder(binding.root)
    }

    override fun getItemCount(): Int = cityList.size

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        holder.setIsRecyclable(false)
        val item = cityList[position]
        binding.cityName.text = item.city.replaceFirstChar { it.uppercaseChar() }
        holder.itemView.setOnClickListener {
            listener?.onItemClicked(item.city)
        }
    }

    fun updateListener(listener: OnItemCityListClickedListener) {
        this.listener = listener
    }

    class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    interface OnItemCityListClickedListener {
        fun onItemClicked(cityName: String)
    }
}
