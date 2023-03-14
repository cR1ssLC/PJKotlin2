package com.cr1ss.pj2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.cr1ss.pj2.Models.AdapterEst
import com.cr1ss.pj2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val adapter = AdapterEst()
        val linearLayoutManager = LinearLayoutManager(this)
        binding.rvEstudiantes.adapter=adapter
        binding.rvEstudiantes.layoutManager=linearLayoutManager
    }
}