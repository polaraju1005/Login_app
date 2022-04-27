package com.example.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var txt1: TextView
    lateinit var txt2: TextView
    lateinit var txt3: TextView
    lateinit var txt4: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        title = "Details"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        txt1 = findViewById(R.id.txtName1)
        txt2 = findViewById(R.id.txtName2)
        txt3 = findViewById(R.id.txtName3)
        txt4 = findViewById(R.id.txtName4)
        val x = intent.getStringExtra("name1")
        txt1.text = x
        val y = intent.getStringExtra("name2")
        txt2.text = y
        val z = intent.getStringExtra("name3")
        txt3.text = z
        val w = intent.getStringExtra("name4")
        txt4.text = w
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}