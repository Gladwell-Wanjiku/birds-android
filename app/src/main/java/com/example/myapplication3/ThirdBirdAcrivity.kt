package com.example.myapplication3

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication3.databinding.ActivitySecondBirdBinding
import com.example.myapplication3.databinding.ActivityThirdBirdAcrivityBinding
import com.squareup.picasso.Picasso

class ThirdBirdAcrivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdAcrivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBirdAcrivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn4.setOnClickListener {
            finish()
        }

        binding.btn5.setOnClickListener {
             val intent = Intent(this, ForthBirdActivity:: class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1452570053594-1b985d6ea890?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8YmlyZHN8ZW58MHx8MHx8fDA%3D")
            .into(binding.imageView4)
        }
    }
