package com.example.footballapps.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.footballapps.R
import com.example.footballapps.model.Club

class ListClubAdapter(private val listClub: ArrayList<Club>) :
    RecyclerView.Adapter<ListClubAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_club, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listClub.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val club = listClub[position]

        Glide.with(holder.itemView.context).load(club.photo)
            .apply(RequestOptions().override(55, 55)).into(holder.imgPhoto)

        holder.tvName.text = club.name
        holder.tvDetail.text = club.detail

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Kamu Memilih " + listClub[position].name, Toast.LENGTH_LONG).show() }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

}
