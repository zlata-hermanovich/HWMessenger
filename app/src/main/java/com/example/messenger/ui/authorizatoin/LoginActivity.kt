package com.example.messenger.ui.authorizatoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.messenger.R

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.login, AuthorizationFragment())
            .commit()
    }
}






