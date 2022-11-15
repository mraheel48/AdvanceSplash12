package com.example.advancesplash12

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this@SplashScreen.installSplashScreen()

       /* try {
            runBlocking { // this: CoroutineScope
                launch { doWorld() }
            }
        } catch (ex: InterruptedException) {
            ex.printStackTrace()
        }*/

//        this@SplashScreen.installSplashScreen()

        startActivity(Intent(this, MainActivity::class.java))
        finish()

    }

    // this is your first suspending function
    // this method add delay in Splash Screen
    /*private suspend fun doWorld() {
        delay(1000L)
    }*/

}