package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.compose.material3.Snackbar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun one(view: View) {
        com.google.android.material.snackbar.Snackbar.make(view,
            getString(R.string.chipichipichapachapa),com.google.android.material.snackbar.Snackbar.LENGTH_LONG).show()
    }
    fun two(view: View) {
        val snackbar = com.google.android.material.snackbar.Snackbar.make(view,"click me",com.google.android.material.snackbar.Snackbar.LENGTH_LONG)
        snackbar.setAction("clickme", new View.OnClickListener() {
            
        })
    }
    fun three(view: View) {}
}