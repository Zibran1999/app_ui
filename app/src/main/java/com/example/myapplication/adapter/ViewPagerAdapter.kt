package com.example.myapplication.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.fragments.LikedVideoFragment
import com.example.myapplication.fragments.VideoFragment

class ViewPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

    override fun getItemCount(): Int = NUM_TABS

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return VideoFragment()
            1 -> return LikedVideoFragment()

        }
        return VideoFragment()
    }

    companion object {
        private const val NUM_TABS = 2
    }
}
