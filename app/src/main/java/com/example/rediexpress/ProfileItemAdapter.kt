package com.example.rediexpress

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class ProfileItemAdapter(val con:Context, val list:List<ProfileItem>): RecyclerView.Adapter<ProfileItemAdapter.Vieew>() {

    var onItemClick:((ProfileItem)->Unit)?=null
    class Vieew(view: View):RecyclerView.ViewHolder(view) {
        val image:ImageView=view.findViewById(R.id.icon_profile)
        val title:TextView=view.findViewById(R.id.title_profile)
        val descrip:TextView=view.findViewById(R.id.item_desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vieew {
        val root=LayoutInflater.from(con).inflate(R.layout.profile_item, parent, false)
        return Vieew(root)
    }

    override fun onBindViewHolder(holder: Vieew, position: Int) {
        holder.image.setImageResource(list[position].image)
        holder.title.setText(list[position].title)
        holder.descrip.setText(list[position].description)

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(list[position])
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

}