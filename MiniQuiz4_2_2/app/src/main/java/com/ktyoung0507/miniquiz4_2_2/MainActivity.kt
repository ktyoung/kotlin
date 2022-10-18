package com.ktyoung0507.miniquiz4_2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.miniquiz4_2_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}