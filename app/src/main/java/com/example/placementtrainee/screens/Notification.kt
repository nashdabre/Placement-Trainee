/*
package com.example.healthcare.screens

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationManagerCompat
import com.google.android.datatransport.runtime.Destination


class Notification : BroadcastReceiver(){

    override fun onReceive(context: Context?,intent: Intent?) {
         val notificationManager = NotificationManagerCompat.from(context)

        val i = Intent(context,DestinationActivity::class.java)

        val notification = NotificationCompat.Builder(context!!,"Appointment Booked")
            .setContentTitle("Appointment")
            .setContentText("Your appointment is successfully scheduled")
            .setPriority(NotificationManager.IMPORTANCE_HIGH)
            .setDefaults(NotificationCompat.DEFAULT_ALL)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)
            .build()
    }




        notificationChannel.description = "A notification channel for booking appointment"

        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(notificationChannel)
    }
}*/
