package com.example.iqbaalrafi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.iqbaalrafi.databinding.ActivityFormLandingBinding
import com.example.iqbaalrafi.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.textRegister.setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))
        }

    }
}