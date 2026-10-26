package com.example.mobile

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var likeCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLike = findViewById<Button>(R.id.btnLike)
        val btnDelete = findViewById<Button>(R.id.btnDelete)
        val btnSave = findViewById<Button>(R.id.btnSave)
        val tvLikesCount = findViewById<TextView>(R.id.tvLikesCount)

        fun updateLikesDisplay() {
            tvLikesCount.text = "$likeCount polubień"
        }

        btnLike.setOnClickListener {
            likeCount++
            updateLikesDisplay()
        }


        btnDelete.setOnClickListener {
            if (likeCount > 0) {
                likeCount--
                updateLikesDisplay()
            }
        }
        btnSave.setOnClickListener {
        }
    }
}