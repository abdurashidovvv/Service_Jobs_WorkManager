package com.abdurashidov.service_jobs_workmanager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abdurashidov.service_jobs_workmanager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            val intent=Intent(this, MediaService::class.java)
            startService(intent)
        }
        binding.button1.setOnClickListener {
            val intent=Intent(this, MediaService::class.java)
            stopService(intent)
        }
    }
}