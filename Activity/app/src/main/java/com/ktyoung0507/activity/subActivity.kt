package com.ktyoung0507.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.activity.databinding.ActivitySubBinding

class subActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding by lazy { ActivitySubBinding.inflate(layoutInflater) }

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.to1.text = intent.getStringExtra("from1")
        binding.to2.text = "${intent.getIntExtra("from2", 0)}"
    }
}