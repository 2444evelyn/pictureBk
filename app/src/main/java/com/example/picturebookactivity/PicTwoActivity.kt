package com.example.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PicTwoActivity : AppCompatActivity() {
    lateinit var btnprev:Button
    lateinit var btnNxt:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic_two)

        btnprev=findViewById(R.id.btnprev)
        btnprev.setOnClickListener{
            var intent = Intent(this,PicOneActivity::class.java)
            startActivity(intent)
        }
        btnNxt=findViewById(R.id.btnNxt)
        btnNxt.setOnClickListener {
            var intent = Intent(this,pic3Activity::class.java)
            startActivity(intent)
        }

    }
}