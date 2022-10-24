package com.ktyoung0507.pillgood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.pillgood.databinding.ActivityHomeBinding

class home : AppCompatActivity() {
    val binding by lazy { ActivityHomeBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 영양소 정보 메뉴로 이동
        // === 1. 화면에 보이는 영양소 정보 보기 버튼 클릭 시 === //
        val intentInfo = Intent(this, info::class.java)
        binding.homeFooterInfoBox.setOnClickListener { startActivity(intentInfo) }
        // === 2. 하단 메뉴바에서 영양소 정보 버튼 클릭 시 === //
        binding.homeInfoBtn.setOnClickListener { startActivity(intentInfo) }
    }
}