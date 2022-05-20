package com.example.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pic4Activity : AppCompatActivity() {
    lateinit var btnPrev:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic4)

        btnPrev=findViewById(R.id.btnPrev2)
        btnPrev.setOnClickListener{
            var intent = Intent(this,pic3Activity::class.java)
            startActivity(intent)
        }
    }
}