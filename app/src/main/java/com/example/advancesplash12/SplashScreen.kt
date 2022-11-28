package com.example.advancesplash12

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this@SplashScreen.installSplashScreen()

        try {
            runBlocking { // this: CoroutineScope
                launch { doWork() }
            }
        } catch (ex: java.lang.Exception) {
            ex.printStackTrace()
        }

        startActivity(Intent(this, MainActivity::class.java))
        finish()

    }

    // this is your first suspending function
    private suspend fun doWork() {
        delay(1000L)
    }

}