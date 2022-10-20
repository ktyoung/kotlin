package com.ktyoung0507.pillgood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.pillgood.databinding.ActivityOnboarding2Binding
import com.ktyoung0507.pillgood.databinding.ActivityOnboarding3Binding

class onboarding3 : AppCompatActivity() {
    val binding by lazy { ActivityOnboarding3Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = Intent(this, login::class.java)
        binding.onboard3StartBtn.setOnClickListener { startActivity(intent) }
    }
}