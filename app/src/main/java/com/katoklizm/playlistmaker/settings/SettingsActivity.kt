package com.katoklizm.playlistmaker.settings

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.katoklizm.playlistmaker.R

class SettingsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val backActivity = findViewById<ImageView>(R.id.text_back_setting)
        val settingsShareApp = findViewById<LinearLayout>(R.id.settings_share_app)
        val settingsWriteToSupport = findViewById<LinearLayout>(R.id.settings_write_to_support)
        val settingsTermOfUse = findViewById<LinearLayout>(R.id.settings_term_of_use)

        backActivity.setOnClickListener {
            finish()
        }

        settingsShareApp.setOnClickListener {
            val url = Uri.parse("https://practicum.yandex.ru/profile/android-developer/")
            val intent = Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_TEXT, url)
            startActivity(intent)
        }

        settingsWriteToSupport.setOnClickListener {
            val message = "Спасибо разработчикам и разработчицам за крутое приложение!"
            val subject = "Сообщение разработчикам и разработчицам приложения Playlist Maker"
            val shareIntent = Intent(Intent.ACTION_SENDTO)
            shareIntent.data = Uri.parse("mailto:")
            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("Makss.impeks@gmail.com"))
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, subject)
            shareIntent.putExtra(Intent.EXTRA_TEXT, message)
            startActivity(shareIntent)
        }

        settingsTermOfUse.setOnClickListener {
            val url = Uri.parse("https://yandex.ru/legal/practicum_offer/")
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        }
    }
}