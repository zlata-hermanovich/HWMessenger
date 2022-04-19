package com.example.messenger.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.messenger.ui.authorizatoin.Login
import com.example.messenger.R
import java.util.*
import kotlin.concurrent.schedule

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        fun goLog(){
            startActivity(Intent(this, Login::class.java))
            finish()
        }
        Timer().schedule(3000){
            goLog()
        }
    }

}