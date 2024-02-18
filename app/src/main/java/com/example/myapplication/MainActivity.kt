package com.example.myapplication

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.example.myapplication.adapter.ViewPagerAdapter
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2
    private lateinit var binding: ActivityMainBinding
    private lateinit var list: List<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewPager = binding.viewPager
        val tableLayout = binding.tabLayout
        list = listOf("Videos", "Liked")
        val pagerAdapter = ViewPagerAdapter(this)
        viewPager.adapter = pagerAdapter
        TabLayoutMediator(tableLayout, viewPager) { tab, pos ->
            tab.text = list[pos]

        }.attach()
    }


}