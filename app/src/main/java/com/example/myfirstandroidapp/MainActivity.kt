package com.example.myfirstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener{
            text1.text=text1.text.toString()+"E"


        }
        val mylist=listOf("Marc","Nicolas","Hugo","Axel","Marie")
        val sortedlist=mylist.sortedBy { it.length }
        Log.d("sorted",sortedlist.toString())
        text2.setText(sortedlist.toString())
        button2.setOnClickListener{
            val rand=sortedlist.random()
            text2.setText(rand)
        }






    }
}

