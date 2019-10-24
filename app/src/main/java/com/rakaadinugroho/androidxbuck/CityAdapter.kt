package com.rakaadinugroho.androidxbuck

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_city.view.*

class CityAdapter(val cities: List<CityData>): RecyclerView.Adapter<CityAdapter.CityVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityVH {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_city,
            parent,
            false
        )
        return CityVH(view)
    }

    override fun getItemCount(): Int {
        return cities.size
    }

    override fun onBindViewHolder(holder: CityVH, position: Int) {
        holder.bind(cities[position])
    }

    inner class CityVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: CityData) {
            itemView.city_name_item.text = data.name
            itemView.city_province_item.text = data.province
        }
    }
}

data class CityData(val name: String, val province: String)