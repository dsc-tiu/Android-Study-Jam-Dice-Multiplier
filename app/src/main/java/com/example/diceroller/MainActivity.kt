package com.example.diceroller

import android.graphics.Insets.subtract
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    var randomInt1: Int = 0
    var randomInt2: Int = 0
    var multiplier: Int = 0
    var addition: Int = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val root_layout=findViewById<View>(R.id.root_layout)

        val animDrawable = root_layout.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(2000)
        animDrawable.start()


        val button1: Button = findViewById(R.id.button1)



        button1.setOnClickListener {
            dice()
        }
        fun dice() {
            randomInt1 = Random().nextInt(6) + 1
            val drawableResource = when (randomInt1) {

                1 -> R.drawable.ic_dice_one
                2 -> R.drawable.ic_dice_two
                3 -> R.drawable.ic_dice_three
                4 -> R.drawable.ic_dice_four
                5 -> R.drawable.ic_dice_five
                6 -> R.drawable.ic_dice_six
                else -> R.drawable.ic_dice
            }
            val diceimage1: ImageView = findViewById(R.id.diceimage1)
            diceimage1.setImageResource(drawableResource)

        }

        val button2: Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            dice()
        }
        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            multiply()
        }
        val button4: Button = findViewById(R.id.button4)
        button4.setOnClickListener {
            addition()
        }

    }

    fun dice() {
        randomInt2 = Random().nextInt(6) + 1

        val drawableResource = when (randomInt2) {
            1 -> R.drawable.ic_dice_one
            2 -> R.drawable.ic_dice_two
            3 -> R.drawable.ic_dice_three
            4 -> R.drawable.ic_dice_four
            5 -> R.drawable.ic_dice_five
            6 -> R.drawable.ic_dice_six
            else -> R.drawable.ic_dice
        }
        val diceimage2: ImageView = findViewById(R.id.diceimage2)
        diceimage2.setImageResource(drawableResource)

    }


    fun multiply() {
        var multiplier:Int = randomInt1 * randomInt2
        var textView: TextView = findViewById(R.id.textView)
        textView.text = "Multiplied Value is = " + multiplier.toString();

    }

    fun addition() {
        var addition:Int = randomInt1 + randomInt2
        var textView: TextView = findViewById(R.id.textView)
        textView.text = "added Value is = " + addition.toString();

    }

}





