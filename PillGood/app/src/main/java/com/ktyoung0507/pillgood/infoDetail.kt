package com.ktyoung0507.pillgood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.pillgood.databinding.ActivityInfoDetailBinding

class infoDetail : AppCompatActivity() {
    val binding by lazy { ActivityInfoDetailBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}