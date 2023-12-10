package com.example.xylophone

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.xylophone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mediaPlayer = MediaPlayer.create(this, R.raw.note_do)




        binding.noteDo.setOnClickListener {
            playSound(R.raw.note_do)
        }

        binding.noteRe.setOnClickListener {
            playSound(R.raw.note_re)
        }

        binding.noteMi.setOnClickListener {
            playSound(R.raw.note_mi)
        }

        binding.noteFa.setOnClickListener {
            playSound(R.raw.note_fa)
        }

        binding.noteSol.setOnClickListener {
            playSound(R.raw.note_sol)
        }

        binding.noteLya.setOnClickListener {
            playSound(R.raw.note_lya)
        }

        binding.noteSi.setOnClickListener {
            playSound(R.raw.note_si)
        }

        binding.noteDo2.setOnClickListener {
            playSound(R.raw.note_do2)
        }


    }

    private fun playSound(soundResId: Int) {
        mediaPlayer.release()
        mediaPlayer = MediaPlayer.create(this, soundResId)
        mediaPlayer.start()
    }
}