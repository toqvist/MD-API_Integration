package com.toqvist.api_integration

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class BearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat)

        val newImageButton = findViewById<Button>(R.id.buttonNewImage)
        val imageView = findViewById<ImageView>(R.id.imageView)

        val url = "https://placebear.com/500/500.jpg"
        val imgHelper = ImageHelper()

        imgHelper.getImage(url, imageView)

        newImageButton.setOnClickListener {
            imgHelper.getImage(url,imageView)
        }


    }


}