package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val signup = findViewById<TextView>(R.id.signup)
        val signin = findViewById<TextView>(R.id.signin)

        findViewById<com.google.android.material.button.MaterialButton>(R.id.signin).setOnClickListener{
            var username = username.text.toString()
           var password = password.text.toString()
           if(username==null) {
               Toast.makeText(this, "please, enter your username", Toast.LENGTH_SHORT).show()
           }
           else if(password==null){
               Toast.makeText(this),"please, enter your password", Toast.LENGTH_SHORT).show()
           }
            else{
                signin.setTextColor(getColor(R.color.black))
           }
        }
    }
}