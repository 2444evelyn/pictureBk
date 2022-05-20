package com.example.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pic3Activity : AppCompatActivity() {
    lateinit var btnback:Button
    lateinit var btnnxt:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic3)
        btnback=findViewById(R.id.btnback)
        btnback.setOnClickListener{
            var intent = Intent(this,PicTwoActivity::class.java)
            startActivity(intent)
        }
        btnnxt=findViewById(R.id.btnnxt)
        btnnxt.setOnClickListener {
            var intent = Intent(this,pic4Activity::class.java)
            startActivity(intent)
        }

    }
}

