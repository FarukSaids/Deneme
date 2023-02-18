package com.example.kullanicigirisi

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kullanicigirisi.databinding.ActivityMainkayitOlBinding

class MainkayitOl : AppCompatActivity() {
    lateinit var binding: ActivityMainkayitOlBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainkayitOlBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.butongirisedon.setOnClickListener {
           intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent) }






    }
}