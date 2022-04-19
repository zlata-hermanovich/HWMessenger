package com.example.messenger.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.messenger.R
import com.example.messenger.databinding.ActivityHomeBinding
import com.example.messenger.repository.ChatsSingleton

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.home, AdditionChatsFragment())
            .commit()

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1,
            ChatsSingleton.mapOfChats
        )
        binding.listChats.adapter = arrayAdapter
    }
}




