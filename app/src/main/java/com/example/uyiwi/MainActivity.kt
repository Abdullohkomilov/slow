package com.example.uyiwi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uyiwi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (MainActivity.(this) == null){
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
        setContentView(binding.root)
        binding.display.text = MainActivity.getUsername(this)
    }

}