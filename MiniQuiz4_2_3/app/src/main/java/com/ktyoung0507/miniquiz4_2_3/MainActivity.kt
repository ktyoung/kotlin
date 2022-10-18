package com.ktyoung0507.miniquiz4_2_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.miniquiz4_2_3.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        thread(start = true) {
            for (i in 0 .. 99) {
                Thread.sleep(1000)
                runOnUiThread {
                    binding.textView.text = "${i+1}"
                }
            }
        }
    }
}