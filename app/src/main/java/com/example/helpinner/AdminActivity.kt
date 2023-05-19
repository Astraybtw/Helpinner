package com.example.helpinner

import android.content.Intent
import android.view.View;
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AdminActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)
    }

    fun openExit(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}