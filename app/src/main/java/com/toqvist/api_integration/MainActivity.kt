package com.toqvist.api_integration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val catButton = findViewById<Button>(R.id.buttonCat)
        val dogButton = findViewById<Button>(R.id.buttonDog)
        val bearButton = findViewById<Button>(R.id.buttonBear)

        catButton.setOnClickListener {
            val goToCat = Intent(this, CatActivity::class.java)
            startActivity(goToCat)
        }

        dogButton.setOnClickListener {
            val goToDog = Intent(this, DogActivity::class.java)
            startActivity(goToDog)
        }

        bearButton.setOnClickListener {
            val goToBear = Intent(this, BearActivity::class.java)
            startActivity(goToBear)
        }
    }
}