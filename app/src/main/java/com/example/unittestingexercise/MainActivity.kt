package com.example.unittestingexercise

import android.content.*
import android.os.*
import androidx.appcompat.app.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        change_text_button.setOnClickListener {
            val textToBeDisplayed = edit_text.text.toString()
            text_view.text = textToBeDisplayed
        }

        navigate_button.setOnClickListener {
            val textTobeSent = edit_text.text.toString()
            val intent = Intent(applicationContext, SecondActivity::class.java)
            intent.putExtra("text", textTobeSent)
            startActivity(intent)
        }
    }
}