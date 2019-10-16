package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.practical1.R.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button1)
        rollButton.setOnClickListener{rollDice()}



    }

    private fun rollDice(){
        val randomInt = Random.nextInt(6)+1;

        val resultText: TextView = findViewById(R.id.text1)
        resultText.text = randomInt.toString();

    }
}
