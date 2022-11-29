package com.example.advancesplash12

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@SuppressLint("CustomSplashScreen")
class NewSplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        runBlocking { // this: CoroutineScope
            launch { doWork() }
        }

        startActivity(Intent(this@NewSplashScreen, MainActivity::class.java))
        finish()
    }

    // this is your first suspending function
    private suspend fun doWork() {
        delay(1000L)
    }
}