package com.example.messengerui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.messengerui.R
import com.example.messengerui.model.Room
import com.google.android.material.imageview.ShapeableImageView

class RoomAdapter(private val context: Context, private val rooms: ArrayList<Room>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater =
            LayoutInflater.from(context).inflate(R.layout.item_room_view, parent, false)
        return RoomViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val room = rooms[position]

        if (holder is RoomViewHolder) {
            val imageView = (holder as RoomViewHolder).imageViewProfile
            val textView = (holder as RoomViewHolder).textViewFullName

            imageView.setImageResource(room.profile)
            textView.text = room.fullName
        }
    }

    override fun getItemCount(): Int {
        return rooms.size
    }

    private class RoomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageViewProfile: ShapeableImageView = itemView.findViewById(R.id.iv_profile_room)
        val textViewFullName: TextView = itemView.findViewById(R.id.tv_full_name_room)
    }
}

