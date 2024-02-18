package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.adapter.CardViewAdapter

class VideoFragment : Fragment() {
    private lateinit var list: List<Int>
    private lateinit var cardViewAdapter: CardViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_video, container, false)
        val recyclerview = view.findViewById<RecyclerView>(R.id.recyclerview)
        val layoutManager = GridLayoutManager(requireContext(), 3)
        layoutManager.orientation = GridLayoutManager.VERTICAL
        recyclerview.layoutManager = layoutManager
        list = listOf(
            R.drawable.wall3,
            R.drawable.user_img,
            R.drawable.wall,
            R.drawable.wall3,
            R.drawable.user_img,
            R.drawable.wall2,
            R.drawable.wall
        )

        cardViewAdapter = CardViewAdapter(requireContext(), list)
        recyclerview.adapter = cardViewAdapter



        return view
    }


}