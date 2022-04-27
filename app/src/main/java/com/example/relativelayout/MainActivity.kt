package com.example.relativelayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var editName:EditText
    lateinit var editJn:EditText
    lateinit var editEmail:EditText
    lateinit var editDob:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button:Button = findViewById(R.id.button)
        editName = findViewById(R.id.etName)
        editJn = findViewById(R.id.etJntuno)
        editEmail = findViewById(R.id.etEmail)
        editDob = findViewById(R.id.etDob)
        title = "Login"
        button.setOnClickListener {
            var i = Intent(this,MainActivity2::class.java)
            i.putExtra("name1",editName.text.toString())
            i.putExtra("name2",editJn.text.toString())
            i.putExtra("name3",editEmail.text.toString())
            i.putExtra("name4",editDob.text.toString())
            startActivity(i)
        }
    }
}