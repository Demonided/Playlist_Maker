package com.katoklizm.playlistmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchPlaylistMaker = findViewById<Button>(R.id.search_playlist_maker)
        val mediaLibraryPlaylistMaker = findViewById<Button>(R.id.media_library_playlist_maker)
        val settingPlaylistMaker = findViewById<Button>(R.id.setting_playlist_maker)

//        val imageClickListener: View.OnClickListener = object : View.OnClickListener {
//            override fun onClick(v: View?) {
//                Toast.makeText(this@MainActivity, "Нажали на картинку!", Toast.LENGTH_SHORT).show()
//            }
//        }

//        searchPlaylistMaker.setOnClickListener (imageClickListener)

//        searchPlaylistMaker.setOnClickListener (this@MainActivity)
//        mediaLibraryPlaylistMaker.setOnClickListener (this@MainActivity)
//        settingPlaylistMaker.setOnClickListener (this@MainActivity)
    }

    override fun onClick(p0: View?) {
        when(p0?.id) {
            R.id.search_playlist_maker -> {
                Toast.makeText(this@MainActivity, "Нажали на картинку!", Toast.LENGTH_SHORT).show()
            }
            R.id.media_library_playlist_maker -> {

            }
            R.id.setting_playlist_maker -> {

            }
        }
    }
}