package com.example.mininetflix

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptorHome(private val name:ArrayList<String>, private val photo:ArrayList<Int>, private val favor:ArrayList<Int>): RecyclerView.Adapter<AdaptorHome.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val movieImage = itemView.findViewById<ImageButton>(R.id.movieImage)
        val favoriteImage = itemView.findViewById<ImageView>(R.id.favoriteImage)
        val movieName = itemView.findViewById<TextView>(R.id.movieName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false))
    }

    override fun getItemCount(): Int {
        return name.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.movieName.text = name[position]
        holder.movieImage.setImageResource(photo[position])
        holder.favoriteImage.setImageResource(favor[position])


        holder.favoriteImage.setOnClickListener {
            if (favor[position] == R.drawable.baseline_favorite_border_24) {
                favor[position] = R.drawable.baseline_favorite_24
                holder.favoriteImage.setImageResource(R.drawable.baseline_favorite_24)
            }else if (favor[position] == R.drawable.baseline_favorite_24){
                favor[position] = R.drawable.baseline_favorite_border_24
                holder.favoriteImage.setImageResource(R.drawable.baseline_favorite_border_24)
            }
        }

    }
}