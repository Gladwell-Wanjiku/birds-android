package com.example.myapplication3

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication3.databinding.ActivityForthBirdBinding
import com.squareup.picasso.Picasso

class ForthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityForthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn6.setOnClickListener {
            finish()
        }

        binding.btn7.setOnClickListener {
            val intent = Intent(this, FifthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1480044965905-02098d419e96?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGJpcmRzfGVufDB8fDB8fHww")
            .into(binding.imageView7)
    }
}