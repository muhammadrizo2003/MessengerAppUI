package com.example.messengerui.activity

import android.content.Context
import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.messengerui.R
import com.example.messengerui.adapter.ChatAdapter
import com.example.messengerui.model.Chat
import com.example.messengerui.model.Message
import com.example.messengerui.model.Room

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        context = this
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(context, 1)

        refreshAdapter(getAllChats())

      //  Canvas.VertexMode.TRIANGLES
    }

    private fun getAllChats(): ArrayList<Chat> {

        val stories = ArrayList<Room>()
        for (i in 1..5){
            stories.add(Room(R.drawable.img, "Xurshidbek Kurbanov"))
            stories.add(Room(R.drawable.img, "Sherzodbek Kurbanov"))
            stories.add(Room(R.drawable.img, "Begzodbek Kurbanov"))
        }

        val chats = ArrayList<Chat>()
        chats.add(Chat(rooms = stories))

        for (i in 1..10) {
            chats.add(Chat(Message(R.drawable.img, "Begzodbek", true)))
            chats.add(Chat(Message(R.drawable.img, "Xurshidbek", true)))
            chats.add(Chat(Message(R.drawable.img, "Sherzodbek")))
            chats.add(Chat(Message(R.drawable.img, "Muhammadrizo Nurullaxo'jayev", true)))
            chats.add(Chat(Message(R.drawable.img, "Muhammadziyo Nurullaxo'jayev")))
            chats.add(Chat(Message(R.drawable.img, "Muhammadmirzo Nurullaxo'jayev", true)))
        }

        return chats
    }

    private fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(context, chats)
        recyclerView.adapter = adapter
    }
}



