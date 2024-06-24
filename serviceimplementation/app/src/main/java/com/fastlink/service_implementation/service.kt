package com.fastlink.service_implementation

import android.app.Service
import android.content.Intent
import android.os.IBinder

class service : Service(){
    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
        println("onBind() Command method Running ................... ")

    }

    override fun onDestroy() {
        println("onDestroy() Command method Running ................... ")

        super.onDestroy()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        println("onStartCommand() Command method Running ................... ")
        return super.onStartCommand(intent, flags, startId)

    }
}