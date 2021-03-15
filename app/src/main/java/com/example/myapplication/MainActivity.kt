package com.example.myapplication

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        class zarClass() {
            val zarAt: TextView = findViewById(R.id.text1)
            val image1: ImageView = findViewById(R.id.imageView1)
            val image2: ImageView = findViewById(R.id.imageView2)
            val sallaButton: Button = findViewById(R.id.button1)
            val temizleButton: Button = findViewById(R.id.button2)


           fun zarAt() {



                sallaButton.setOnClickListener {
                    val randomSayi = (1..6).random()
                    val randomSayi2 = (1..6).random()
                    when (randomSayi) {
                        1 -> image1.setImageResource(R.drawable.dice_1)
                        2 -> image1.setImageResource(R.drawable.dice_2)
                        3 -> image1.setImageResource(R.drawable.dice_3)
                        4 -> image1.setImageResource(R.drawable.dice_4)
                        5 -> image1.setImageResource(R.drawable.dice_5)
                        6 -> image1.setImageResource(R.drawable.dice_6)

                    }


                    when (randomSayi2) {
                        1 -> image2.setImageResource(R.drawable.dice_1)
                        2 -> image2.setImageResource(R.drawable.dice_2)
                        3 -> image2.setImageResource(R.drawable.dice_3)
                        4 -> image2.setImageResource(R.drawable.dice_4)
                        5 -> image2.setImageResource(R.drawable.dice_5)
                        6 -> image2.setImageResource(R.drawable.dice_6)

                    }

                }



                temizleButton.setOnClickListener {
                    image1.setImageResource(R.drawable.empty_dice)
                    image2.setImageResource(R.drawable.empty_dice)
                }



            }



        }
        val zarObj = zarClass()
        zarObj.zarAt()


    }

}