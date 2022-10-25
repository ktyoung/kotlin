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
        val intentInfo = Intent(this, info::class.java)
        // === 1. 화면에 보이는 영양소 정보 보기 버튼 클릭 시 === //
        binding.homeInfoBtn.setOnClickListener { startActivity(intentInfo) }
        // === 2. 하단 메뉴바에서 영양소 정보 버튼 클릭 시 === //
        binding.homeFooterInfoBox.setOnClickListener { startActivity(intentInfo) }

        // 나만의 약통 메뉴로 이동
        val intentMedi = Intent(this, medibox::class.java)
        // === 1. 화면에 보이는 약통 채우러 가기 버튼 클릭 시
        binding.homeMyMediBtn.setOnClickListener { startActivity(intentMedi) }
        // === 2. 하단 메뉴바에서 나만의 약통 버튼 클릭 시 === //
        binding.homeFooterMediboxBox.setOnClickListener { startActivity(intentMedi) }

        // 내 정보 메뉴로 이동
        // === 1. 하단 메뉴바에서 나만의 약통 버튼 클릭 시 === //
    }
}