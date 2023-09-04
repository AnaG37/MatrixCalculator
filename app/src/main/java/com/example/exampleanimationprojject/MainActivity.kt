package com.example.exampleanimationprojject

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*
        val videoView = findViewById<VideoView>(R.id.videoView)
        val videoPath = "android.resource://${packageName}/${R.raw.animation}"
        val videoUri = Uri.parse(videoPath)

        videoView.setVideoURI(videoUri)
        videoView.setOnPreparedListener { mediaPlayer ->
            mediaPlayer.isLooping = false
            mediaPlayer.start()
        }

        videoView.setOnCompletionListener {
            val fragment = MainFragment()
            val transaction = supportFragmentManager.beginTransaction()

            transaction.replace(R.id., fragment) // Zamijenite "R.id.fragmentContainer" sa stvarnim ID-em kontejnera za fragmente
            transaction.addToBackStack(null)
            transaction.commit()
        }
         */
    }
}