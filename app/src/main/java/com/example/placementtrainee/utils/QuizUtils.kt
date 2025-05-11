package com.example.placementtrainee.utils

import android.content.Context
import com.example.placementtrainee.data.Quiz
import com.google.gson.Gson


fun loadQuizFromJson(context: Context, fileName: String): Quiz {
    val jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
    return Gson().fromJson(jsonString, Quiz::class.java)
}
