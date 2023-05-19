package com.example.helpinner

import android.content.Intent
import android.view.View;
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun openReg(view: View) {
        val intent = Intent(this, RegActivity::class.java)
        startActivity(intent)
    }

    fun openAdmin(view: View) {
        val intent = Intent(this, AdminActivity::class.java)
        startActivity(intent)
    }
}
