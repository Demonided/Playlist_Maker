package com.katoklizm.playlistmaker.settings

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.katoklizm.playlistmaker.MainActivity
import com.katoklizm.playlistmaker.R

class SettingsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_playlist_maker)

        val backActivity = findViewById<ImageView>(R.id.text_back)

        backActivity.setOnClickListener {
            finish()
        }
    }
}