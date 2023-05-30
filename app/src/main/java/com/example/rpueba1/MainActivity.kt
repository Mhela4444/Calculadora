package com.example.rpueba1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button
    lateinit var text1: TextView
    lateinit var text2: TextView
    lateinit var edit1: EditText
    lateinit var edit2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val num1 = Integer.parseInt(edit1.text.toString())
        val num2 = Integer.parseInt(edit2.text.toString())
        edit1 = findViewById(R.id.edit1)
        edit2 = findViewById(R.id.edit2)
        btn1 = findViewById(R.id.btn1)
        btn1.setOnClickListener(View.OnClickListener {
            text2.setText("El resultado es:   " + (num1 + num2))

            edit1 = findViewById(R.id.edit1)
            edit2 = findViewById(R.id.edit2)
            btn2 = findViewById(R.id.btn2)
            btn2.setOnClickListener(View.OnClickListener {
                text2.setText("El resultado es:   " + (num1 - num2))

                edit1 = findViewById(R.id.edit1)
                edit2 = findViewById(R.id.edit2)
                btn3 = findViewById(R.id.btn3)
                btn3.setOnClickListener(View.OnClickListener {
                    text2.setText("El resultado es:   " + (num1 * num2))

                    edit1 = findViewById(R.id.edit1)
                    edit2 = findViewById(R.id.edit2)
                    btn4 = findViewById(R.id.btn4)
                    btn4.setOnClickListener(View.OnClickListener {
                        text2.setText("El resultado es:   " + (num1 / num2))

                    })
                })
            })
        })
    }
}




