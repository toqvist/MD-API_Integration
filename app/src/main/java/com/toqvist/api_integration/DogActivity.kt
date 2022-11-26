package com.toqvist.api_integration

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat)

        val newImageButton = findViewById<Button>(R.id.buttonNewImage)
        val imageView = findViewById<ImageView>(R.id.imageView)

        val url = "https://place.dog/500/500"
        val imgHelper = ImageHelper()

        imgHelper.getImage(url, imageView)

        newImageButton.setOnClickListener {
            imgHelper.getImage(url,imageView)
        }


    }


}