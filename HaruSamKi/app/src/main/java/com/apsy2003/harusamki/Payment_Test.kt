package com.apsy2003.harusamki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import com.apsy2003.harusamki.databinding.ActivityPaymentTestBinding

class Payment_Test : AppCompatActivity() {
    val binding by lazy { ActivityPaymentTestBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 배송지 변경
        val ship = Intent(this, Activity_Shipping::class.java)
        binding.AdrressBtn.setOnClickListener { startActivity(ship) }
    }
}