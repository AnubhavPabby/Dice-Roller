package com.anubhavpabby.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var whiteDiceImage:ImageView? = null
    var redDiceImage:ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        whiteDiceImage = findViewById(R.id.dice_img_white)
        redDiceImage = findViewById(R.id.dice_img_red)
        val rollButton:Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollWhiteDice()
            rollRedDice()
        }
    }

    private fun rollWhiteDice(){
        val randomInt = Random.nextInt(6) + 1
        val drawableImageRandomId:Int = when(randomInt){
            1 -> R.drawable.white_dice_1
            2 -> R.drawable.white_dice_2
            3 -> R.drawable.white_dice_3
            4 -> R.drawable.white_dice_4
            5 -> R.drawable.white_dice_5
            6 -> R.drawable.white_dice_6
            else -> R.drawable.empty_dice
        }

        whiteDiceImage!!.setImageResource(drawableImageRandomId)
    }

    private fun rollRedDice(){
        val randomInt = Random.nextInt(6) + 1
        val drawableImageRandomId = when(randomInt){
            1 -> R.drawable.red_dice_1
            2 -> R.drawable.red_dice_2
            3 -> R.drawable.red_dice_3
            4 -> R.drawable.red_dice_4
            5 -> R.drawable.red_dice_5
            6 -> R.drawable.red_dice_6
            else -> R.drawable.empty_dice
        }

        redDiceImage!!.setImageResource(drawableImageRandomId)
    }
}