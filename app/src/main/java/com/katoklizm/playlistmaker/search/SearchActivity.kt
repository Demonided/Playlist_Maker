package com.katoklizm.playlistmaker.search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import com.katoklizm.playlistmaker.R

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
    }
}

//        val clearInputField = findViewById<ImageView>(R.id.clear_text_search)
//        val editTextSearch = findViewById<EditText>(R.id.edit_text_search)
//
//
//        clearInputField.setOnClickListener {
//            editTextSearch.setText("")
//        }

//        val simpleTextWatcher = object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
//                // empty
//            }
//
//            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
//                clearInputField.visibility = clearButtonVisibility(s)
//            }
//
//            override fun afterTextChanged(s: Editable?) {
//                // empty
//            }
//        }

//    }

//    private fun clearButtonVisibility(s: CharSequence?): Int {
//        return if (s.isNullOrEmpty()) {
//            View.GONE
//        } else {
//            View.VISIBLE
//        }
//    }
//}

