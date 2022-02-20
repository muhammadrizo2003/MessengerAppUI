package com.example.messengerui.model

import java.io.Serializable

data class Message(val profile: Int, val fullName: String, val isOnline: Boolean = false):Serializable
