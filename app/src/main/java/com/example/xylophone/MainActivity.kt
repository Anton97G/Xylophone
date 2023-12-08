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

        val noteDo = binding.root.findViewById<Button>(R.id.note_do)
        val noteRe = binding.root.findViewById<Button>(R.id.note_re)
        val noteMi = binding.root.findViewById<Button>(R.id.note_mi)
        val noteFa = binding.root.findViewById<Button>(R.id.note_fa)
        val noteSol = binding.root.findViewById<Button>(R.id.note_sol)
        val noteLya = binding.root.findViewById<Button>(R.id.note_lya)
        val noteSi = binding.root.findViewById<Button>(R.id.note_si)
        val noteDo2 = binding.root.findViewById<Button>(R.id.note_do2)



        noteDo.setOnClickListener {
            playSound(R.raw.note_do)
        }

        noteRe.setOnClickListener {
            playSound(R.raw.note_re)
        }

        noteMi.setOnClickListener {
            playSound(R.raw.note_mi)
        }

        noteFa.setOnClickListener {
            playSound(R.raw.note_fa)
        }

        noteSol.setOnClickListener {
            playSound(R.raw.note_sol)
        }

        noteLya.setOnClickListener {
            playSound(R.raw.note_lya)
        }

        noteSi.setOnClickListener {
            playSound(R.raw.note_si)
        }

        noteDo2.setOnClickListener {
            playSound(R.raw.note_do2)
        }


    }

    private fun playSound(soundResId: Int) {
        mediaPlayer.release()
        mediaPlayer = MediaPlayer.create(this, soundResId)
        mediaPlayer.start()
    }
}