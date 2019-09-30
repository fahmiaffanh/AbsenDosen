package com.example.absendosen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun loginonClick (view: View){
        if (edit_password.text.toString()=="admin" && edit_username.text.toString()=="admin"){
            val intn = Intent(this,dashboard::class.java)
            startActivity(intn)
        }

    }
}
