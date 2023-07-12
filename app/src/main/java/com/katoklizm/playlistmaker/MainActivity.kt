package com.katoklizm.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.katoklizm.playlistmaker.medialibrary.MediaLibraryActivity
import com.katoklizm.playlistmaker.search.SearchActivity
import com.katoklizm.playlistmaker.settings.SettingsActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchPlaylistMaker = findViewById<Button>(R.id.search_playlist_maker)
        val mediaLibraryPlaylistMaker = findViewById<Button>(R.id.media_library_playlist_maker)
        val settingPlaylistMaker = findViewById<Button>(R.id.setting_playlist_maker)

        searchPlaylistMaker.setOnClickListener (this@MainActivity)
        mediaLibraryPlaylistMaker.setOnClickListener (this@MainActivity)
        settingPlaylistMaker.setOnClickListener (this@MainActivity)
    }

    override fun onClick(p0: View?) {
        when(p0?.id) {
            R.id.search_playlist_maker -> {
                val intent = Intent(this, SearchActivity::class.java)
                startActivity(intent)
            }
            R.id.media_library_playlist_maker -> {
                val intent = Intent(this, MediaLibraryActivity::class.java)
                startActivity(intent)
            }
            R.id.setting_playlist_maker -> {
                val intent = Intent(this, SettingsActivity::class.java)
                startActivity(intent)
            }
        }
    }
}