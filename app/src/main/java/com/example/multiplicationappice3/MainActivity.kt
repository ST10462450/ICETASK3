package com.example.multiplicationappice3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var appTextEdit : EditText
    private lateinit var MultiplyButton : Button
    private lateinit var AppText : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appTextEdit = findViewById(R.id.appTextEdit)
        MultiplyButton = findViewById(R.id.MultiplyButton)
        AppText = findViewById(R.id.AppText)

        MultiplyButton.setOnClickListener{
            CreateMultiplicationTable()
        }
    }
    private fun CreateMultiplicationTable(){
        val digit = appTextEdit.text.toString().toIntOrNull()
        if (digit != null){
            var tableInfo = ""
            for (i in 1..10){
                tableInfo +=  "$i x $digit =  ${digit*i}\n"
            }
            AppText.text = tableInfo
        } else {
            AppText.text = "enter a valid number"
        }
    }
}