package com.example.mininetflix

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FavoriteFragment : Fragment(R.layout.fragment_favorite) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        val adaptor = AdaptorFavorite(fetchData1(),fetchData2(),fetchData3())
        recyclerView.layoutManager = GridLayoutManager(view.context , 3)
        recyclerView.adapter = adaptor

    }
    val n = 21
    private fun fetchData1():ArrayList<String>{
        val name = ArrayList<String>()
        for (i in 0 until n){
            name.add(i.toString())
        }
        return name
    }
    private fun fetchData2():ArrayList<Int>{
        val photo = ArrayList<Int>()
        for (i in 0 until n){
            photo.add(R.drawable.baseline_coming_soon_24)
        }
        return photo
    }
    private fun fetchData3():ArrayList<Int>{
        val photo = ArrayList<Int>()
        for (i in 0 until n){
            photo.add(R.drawable.baseline_favorite_border_24)
        }
        return photo
    }

}