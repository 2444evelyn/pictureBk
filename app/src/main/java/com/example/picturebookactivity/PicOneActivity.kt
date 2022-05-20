package com.example.picturebookactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PicOneActivity : AppCompatActivity() {
    lateinit var btnNext:Button
    lateinit var btnprevious:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic_one)
        btnprevious=findViewById(R.id.btnprevious)
        btnprevious.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        btnNext=findViewById(R.id.btnNext)
        btnNext.setOnClickListener{
            var intent = Intent(this,PicTwoActivity::class.java)
            startActivity(intent)
        }


}
}