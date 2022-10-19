package com.ktyoung0507.pillgood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.pillgood.databinding.ActivityOnboarding2Binding

class onboarding2 : AppCompatActivity() {
    val binding by lazy { ActivityOnboarding2Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = Intent(this, MainActivity::class.java)
        binding.onboard2NextBtn.setOnClickListener { startActivity(intent) }
    }
}