package com.example.car

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataAdapter(private val listdata:ArrayList<DataHome>) : RecyclerView.Adapter<DataAdapter
.ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        //TODO 6A...
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_type, parent, false)
        return ListViewHolder(view)
    }
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (judul, photos) = listdata [position]
        holder.imgPhoto.setImageResource(photos)
        holder.tvNama.text = judul

    }
    override fun getItemCount(): Int {
        return listdata.size
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.iv_card)
        var tvNama: TextView = itemView.findViewById(R.id.tv_card)
    }


}