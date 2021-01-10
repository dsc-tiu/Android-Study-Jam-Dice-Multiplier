package com.example.androidstudyjamsession3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {
    var randomInt1: Int = 0
    var randomInt2: Int = 0
    var multiplier: Int = 0
    var addition: Int = 0
    var deduct: Int = 0


    var diceImage: ImageView? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "WELCOME", Toast.LENGTH_LONG).show()

        fun dice() {
            randomInt1 = Random().nextInt(6) + 1
            Toast.makeText(this, "Left Dice Shows-:$randomInt1", Toast.LENGTH_SHORT).show()
            val drawableResource = when (randomInt1) {

                1 -> R.drawable.ic_dice_one
                2 -> R.drawable.ic_dice_two
                3 -> R.drawable.ic_dice_three
                4 -> R.drawable.ic_dice_four
                5 -> R.drawable.ic_dice_five
                6 -> R.drawable.ic_dice_six
                else -> R.drawable.ic_dice
            }
            val diceimage1: ImageView = findViewById(R.id.imgDice)
            diceimage1.setImageResource(drawableResource)
        }

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            dice()
        }

        fun dice1() {
            randomInt2 = Random().nextInt(6) + 1
            Toast.makeText(this, "Right Dice Shows- :$randomInt2", Toast.LENGTH_SHORT).show()
            val drawableResource = when (randomInt2) {

                1 -> R.drawable.ic_dice_one
                2 -> R.drawable.ic_dice_two
                3 -> R.drawable.ic_dice_three
                4 -> R.drawable.ic_dice_four
                5 -> R.drawable.ic_dice_five
                6 -> R.drawable.ic_dice_six
                else -> R.drawable.ic_dice
            }
            val diceimage2: ImageView = findViewById(R.id.imgDice2)
            diceimage2.setImageResource(drawableResource)
        }

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            dice1()
        }

        fun multiply() {

             multiplier = randomInt1 * randomInt2
            var textView: TextView = findViewById(R.id.textView)
            textView.text = "Multiplied Value is = " + multiplier.toString();
            Toast.makeText(this, "Multiplied Vlaue:$multiplier", Toast.LENGTH_SHORT).show()
        }
        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener{
            multiply()
        }
        fun add() {
             addition = randomInt1 + randomInt2
            var textView: TextView = findViewById(R.id.textView)
            textView.text = "Added Value is = " + addition.toString();
            Toast.makeText(this, "Added Vlaue:$addition", Toast.LENGTH_SHORT).show()
        }
        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener{
            add()
        }
        fun subtract() {
            if(randomInt1 > randomInt2){
                deduct = randomInt1 - randomInt2
            }
            else{
                 deduct = randomInt2 - randomInt1
            }
            var textView: TextView = findViewById(R.id.textView)
            textView.text = "Subtracted Value is = " + deduct.toString();
            Toast.makeText(this, "Subtracted Vlaue:$deduct", Toast.LENGTH_SHORT).show()
        }
        val button5: Button = findViewById(R.id.button5)
        button5.setOnClickListener{
            subtract()
        }
    }
}

