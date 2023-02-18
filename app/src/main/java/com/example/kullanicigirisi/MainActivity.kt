package com.example.kullanicigirisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kullanicigirisi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.butongirisyap.setOnClickListener {
            intent = Intent(applicationContext,MainHosgeldiniz::class.java)
            startActivity(intent)
        }

        binding.butonkayitol.setOnClickListener {
            intent = Intent(applicationContext,MainkayitOl::class.java)
            startActivity(intent)

        }

    }




}