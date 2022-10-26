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

        // ***** intent 경로 설정 ***** //
        // === 1. 영양소 정보 초기 페이지 === //
        val intentInfo = Intent(this, info::class.java)
        // === 2. 나만의 약통 초기 페이지 === //
        val intentMedi = Intent(this, medibox::class.java)
        // === 3. 내 정보 초기 페이지 === //
        val intentMyPage = Intent(this, mypage::class.java)


        // ***** 버튼 및 텍스트 클릭 시 링크 설정 ***** //
        // === 1. 화면에 보이는 영양소 정보 보기 버튼 클릭 시 영양소 정보 메뉴로 이동 === //
        binding.homeInfoBtn.setOnClickListener { startActivity(intentInfo) }
        // === 2. 화면에 보이는 약통 채우러 가기 버튼 클릭 시 나만의 약통 메뉴로 이동 === //
        binding.homeMyMediBtn.setOnClickListener { startActivity(intentMedi) }


        // ***** 하단 메뉴바 링크 설정 ***** //
        // === 1. 영양소 정보로 이동 === //
        binding.homeFooterInfoBox.setOnClickListener { startActivity(intentInfo) }
        binding.homeFooterInfoImg.setOnClickListener { startActivity(intentInfo) }
        binding.homeFooterInfoText.setOnClickListener { startActivity(intentInfo) }
        // === 2. 나만의 약통으로 이동 === //
        binding.homeFooterMediboxBox.setOnClickListener { startActivity(intentMedi) }
        binding.homeFooterMediboxImg.setOnClickListener { startActivity(intentMedi) }
        binding.homeFooterMediboxText.setOnClickListener { startActivity(intentMedi) }
        // === 3. 내 정보로 이동 === //
        binding.homeFooterMyInfoBox.setOnClickListener { startActivity(intentMyPage) }
        binding.homeFooterMyInfoImg.setOnClickListener { startActivity(intentMyPage) }
        binding.homeFooterMyInfoText.setOnClickListener { startActivity(intentMyPage) }
    }
}