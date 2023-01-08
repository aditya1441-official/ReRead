package com.gmail.jbs.reread

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val captureBtn = findViewById<Button>(R.id.idBtnCapture)
        captureBtn.setOnClickListener {
            val i = Intent(this@MainActivity, ScannerActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}