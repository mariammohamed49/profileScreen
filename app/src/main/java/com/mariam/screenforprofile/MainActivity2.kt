package com.mariam.screenforprofile

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.net.URI

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val imageView1: ImageView = findViewById(R.id.back)
        val imageView2: ImageView = findViewById(R.id.in1)
        val imageView3: ImageView = findViewById(R.id.github)
        val imageView4: ImageView = findViewById(R.id.facebook)

        imageView1.setOnClickListener {
            // Intent to go back to MainActivity1
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        imageView2.setOnClickListener {
            val link="https://www.linkedin.com/in/mariam-mohammed-7ba250272/".toUri()
            val intent=Intent(Intent.ACTION_VIEW,link)
            startActivity(intent)
        }

        imageView3.setOnClickListener {
            val link="https://github.com/mariammohamed49".toUri()
            val intent=Intent(Intent.ACTION_VIEW,link)
            startActivity(intent)
        }

        imageView4.setOnClickListener {
            val link="https://www.facebook.com".toUri()
            val intent=Intent(Intent.ACTION_VIEW,link)
            startActivity(intent)
        }
    }


}



