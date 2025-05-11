package com.example.placementtrainee.utils


import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.os.Build
import androidx.annotation.RequiresApi


object SharedPref {
    fun storeData(
        name: String,email: String,
        phoneno: Long, address: String,password:String, imageUri: String, context: Context
    ){
        val sharedPreferences = context.getSharedPreferences("users", MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("name",name)
        editor.putString("email",email)
        editor.putLong("phoneno", phoneno)
        editor.putString("username",address)
        editor.putString("password",password)
        editor.putString("imageUri",imageUri)
        editor.apply()
    }

    fun getName(context: Context):String{
        val sharedPreferences = context.getSharedPreferences("users", MODE_PRIVATE)
        return sharedPreferences.getString("name","")!!
    }

    fun getPreferredDate(context: Context):String{
        val sharedPreferences = context.getSharedPreferences("appointment", MODE_PRIVATE)
        return sharedPreferences.getString("preferreddate","")!!
    }
    fun getPassword(context: Context):String{
        val sharedPreferences = context.getSharedPreferences("users", MODE_PRIVATE)
        return sharedPreferences.getString("password","")!!
    }
    fun getAddress(context: Context):String{
        val sharedPreferences = context.getSharedPreferences("users", MODE_PRIVATE)
        return sharedPreferences.getString("Address","")!!
    }
    fun getPhoneno(context: Context):String{
        val sharedPreferences = context.getSharedPreferences("users", MODE_PRIVATE)
        return sharedPreferences.getString("Phone no","")!!
    }

    fun getEmail(context: Context):String{
        val sharedPreferences = context.getSharedPreferences("users", MODE_PRIVATE)
        return sharedPreferences.getString("email","")!!
    }
    fun getImage(context: Context):String{
        val sharedPreferences = context.getSharedPreferences("users", MODE_PRIVATE)
        return sharedPreferences.getString("imageUri","")!!
    }


}