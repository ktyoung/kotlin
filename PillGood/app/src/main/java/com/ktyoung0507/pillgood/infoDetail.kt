package com.ktyoung0507.pillgood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.pillgood.databinding.ActivityInfoDetailBinding

class infoDetail : AppCompatActivity() {
    val binding by lazy { ActivityInfoDetailBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // ***** intent 경로 설정 ***** //
        // === 1. 상단 바 뒤로가기 버튼 클릭 시 === //
        val intentBack = Intent(this, info::class.java)
        // === 2. HOME 초기 페이지 === //
        val intentHome = Intent(this, home::class.java)
        // === 3. 영양소 정보 초기 페이지 === //
        val intentInfo = Intent(this, info::class.java)
        // === 4. 나만의 약통 초기 페이지 === //
        val intentMedi = Intent(this, medibox::class.java)
        // === 5. 내 정보 초기 페이지 === //
        val intentMyPage = Intent(this, mypage::class.java)

        // ***** 버튼 및 텍스트 클릭 시 링크 설정 ***** //
        // === 1. 상단 바 뒤로가기 버튼 클릭 시 영양소 정보 초기 페이지로 이동 === //
        binding.layoutHeaderBackBtn.setOnClickListener { startActivity(intentBack) }

        // ***** 하단 메뉴바 링크 설정 ***** //
        // === 1. HOME으로 이동 === //
        binding.homeFooterHomeBox.setOnClickListener { startActivity(intentHome) }
        binding.homeFooterHomeImg.setOnClickListener { startActivity(intentHome) }
        binding.homeFooterHomeText.setOnClickListener { startActivity(intentHome) }
        // === 2. 영양소 정보로 이동 === //
        binding.homeFooterInfoBox.setOnClickListener { startActivity(intentInfo) }
        binding.homeFooterInfoImg.setOnClickListener { startActivity(intentInfo) }
        binding.homeFooterInfoText.setOnClickListener { startActivity(intentInfo) }
        // === 3. 나만의 약통으로 이동 === //
        binding.homeFooterMediboxBox.setOnClickListener { startActivity(intentMedi) }
        binding.homeFooterMediboxImg.setOnClickListener { startActivity(intentMedi) }
        binding.homeFooterMediboxText.setOnClickListener { startActivity(intentMedi) }
        // === 4. 내 정보로 이동 === //
        binding.homeFooterMyInfoBox.setOnClickListener { startActivity(intentMyPage) }
        binding.homeFooterMyInfoImg.setOnClickListener { startActivity(intentMyPage) }
        binding.homeFooterMyInfoText.setOnClickListener { startActivity(intentMyPage) }
    }
}