package com.example.uyiwi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uyiwi.databinding.ActivityMainBinding

class Main : AppCompatActivity(){
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (Main.(this) == null){
            startActivity(Intent(this,Main::class.java))
            finish()
        }
        setContentView(binding.root)
        binding.displayName.text = Main.getUsername(this)
    }

}