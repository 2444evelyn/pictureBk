package com.example.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnphotos:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnphotos=findViewById(R.id.btnphotos)
        btnphotos.setOnClickListener{
            var intent = Intent(this,PicOneActivity::class.java)
            startActivity(intent)
    }

}
}
