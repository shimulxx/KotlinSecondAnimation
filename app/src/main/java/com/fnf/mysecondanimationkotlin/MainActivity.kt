package com.fnf.mysecondanimationkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val fadeButton = findViewById<Button>(R.id.buttonFade)
        val scaleButton = findViewById<Button>(R.id.buttonScale)

        scaleButton.setOnClickListener {
            var animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.scale)
            imageView.startAnimation(animation)
        }

        fadeButton.setOnClickListener {
            var animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.fade)
            imageView.startAnimation(animation)
        }

    }
}