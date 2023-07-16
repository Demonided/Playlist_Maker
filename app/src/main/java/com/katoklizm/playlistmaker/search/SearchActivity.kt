package com.katoklizm.playlistmaker.search

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.katoklizm.playlistmaker.R
import kotlin.random.Random

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        val liner = findViewById<LinearLayout>(R.id.btn_hs)

        liner.setOnClickListener {
            val color = Color.argb(255, Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
            liner.display
        }
    }
}

