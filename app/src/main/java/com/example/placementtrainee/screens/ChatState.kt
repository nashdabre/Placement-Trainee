package com.example.placementtrainee.screens

import android.graphics.Bitmap
import com.example.placementtrainee.data.Chat


data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)