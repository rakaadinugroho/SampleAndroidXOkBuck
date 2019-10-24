package com.rakaadinugroho.androidxbuck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with(city_list) {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = CityAdapter(cityDataGenerator())
        }
    }

    private fun cityDataGenerator(): List<CityData> {
        return mutableListOf<CityData>().apply {
            add(CityData("Yogyakarta","DIY"))
            add(CityData("Sleman","DIY"))
            add(CityData("Bantul","DIY"))
            add(CityData("Wates","DIY"))
            add(CityData("Wonosari","DIY"))
        }
    }
}
