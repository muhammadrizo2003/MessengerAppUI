package com.example.messengerui.model

import java.io.Serializable

data class Chat(val message: Message? = null, val rooms: ArrayList<Room> = ArrayList()) :
    Serializable

