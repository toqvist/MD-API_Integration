package com.toqvist.api_integration

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat)

        val newImageButton = findViewById<Button>(R.id.buttonNewImage)
        val imageView = findViewById<ImageView>(R.id.imageView)

        val url = "https://placekitten.com/500/500"
        val imgHelper = ImageHelper()

        imgHelper.getImage(url, imageView)

        //Nu när jag är klar märker jag att placekitten och placebear endast
        // har en bild per resolution, så denna knapp hämtar alltid samma bild
        newImageButton.setOnClickListener {
            imgHelper.getImage(url,imageView)
        }


    }


}