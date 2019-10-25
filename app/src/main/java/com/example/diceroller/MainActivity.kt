package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countUpButton: Button = findViewById(R.id.countup_button)
        countUpButton.setOnClickListener { countup() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }

    }
    private fun rollDice() {
        val randomInt1 = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        val randomInt3 = Random().nextInt(6) + 1
        val result1Text: TextView = findViewById(R.id.result1_text)
        val result2Text: TextView = findViewById(R.id.result2_text)
        val result3Text: TextView = findViewById(R.id.result3_text)

        result1Text.text = randomInt1.toString()
        result2Text.text = randomInt2.toString()
        result3Text.text = randomInt3.toString()
    }

    private fun countup() {
        val resultText1: TextView = findViewById(R.id.result1_text)
        val resultText2: TextView = findViewById(R.id.result2_text)
        val resultText3: TextView = findViewById(R.id.result3_text)
        // If text is the default "Hello World!" set that text to 1.


        if (resultText1.text == "Hello World!") {
            resultText1.text = "1"
        } else {
            // Otherwise, increment the number up to 6.
            // The text value in resultText.text is an instance of the CharSequence class;
            // it needs to be converted to a String object before it can be converted to an int.
            var resultInt1 = resultText1.text.toString().toInt()

            if (resultInt1 < 6) {
                resultInt1++
                resultText1.text = resultInt1.toString()
            }
        }

        if (resultText2.text == "Hello World!") {
            resultText2.text = "1"
        } else {
            // Otherwise, increment the number up to 6.
            // The text value in resultText.text is an instance of the CharSequence class;
            // it needs to be converted to a String object before it can be converted to an int.
            var resultInt2 = resultText2.text.toString().toInt()

            if (resultInt2 < 6) {
                resultInt2++
                resultText2.text = resultInt2.toString()
            }
        }

        if (resultText3.text == "Hello World!") {
            resultText3.text = "1"
        } else {
            // Otherwise, increment the number up to 6.
            // The text value in resultText.text is an instance of the CharSequence class;
            // it needs to be converted to a String object before it can be converted to an int.
            var resultInt3 = resultText3.text.toString().toInt()

            if (resultInt3 < 6) {
                resultInt3++
                resultText3.text = resultInt3.toString()
            }
        }
    }

    private fun reset(){
        val result1Text: TextView = findViewById(R.id.result1_text)
        val result2Text: TextView = findViewById(R.id.result2_text)
        val result3Text: TextView = findViewById(R.id.result3_text)

        result1Text.text = "Hello World"
        result2Text.text = "Hello World"
        result3Text.text = "Hello World"
    }
}
