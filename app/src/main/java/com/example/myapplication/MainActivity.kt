package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameBookEditText : EditText = findViewById(R.id.Name_book_edit_text)
        val saveButton : Button = findViewById(R.id.save_button)
        val infTextView : TextView = findViewById(R.id.info_text_view)

        saveButton.setOnClickListener {
            val nameBook : String = nameBookEditText.text.toString()
            infTextView.text = nameBook
        }
    }
}