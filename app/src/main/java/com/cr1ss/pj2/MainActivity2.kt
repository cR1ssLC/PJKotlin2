package com.cr1ss.pj2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cr1ss.pj2.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGuardar.setOnClickListener {
            val nombres = binding.nombres.text.toString()
            val paterno = binding.paterno.text.toString()
            val materno = binding.materno.text.toString()
            finish()
        }
    }
}