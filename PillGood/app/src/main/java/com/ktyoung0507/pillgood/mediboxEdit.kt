package com.ktyoung0507.pillgood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.pillgood.databinding.ActivityMediboxEditBinding

class mediboxEdit : AppCompatActivity() {
    val binding by lazy { ActivityMediboxEditBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // ***** intent 경로 설정 ***** //
        // === 1. HOME 초기 페이지 === //
        val intentHome = Intent(this, home::class.java)
        // === 2. 영양소 정보 초기 페이지 === //
        val intentInfo = Intent(this, info::class.java)
        // === 3. 나만의 약통 초기 페이지 === //
        val intentMedi = Intent(this, medibox::class.java)
        // === 4. 나만의 약통 초기 페이지 === // → ~값을 받아 넘기는 기능 구현해야함~ ←
        val intentApply = Intent(this, medibox::class.java)
        // === 5. 나만의 약통 복용 시간 설정 페이지 === //
        val intentSetTime = Intent(this, mediboxSetTime::class.java)
        // === 6. 내 정보 초기 페이지 === //
        val intentMyPage = Intent(this, mypage::class.java)


        // ***** 버튼 및 텍스트 클릭 시 링크 설정 ***** //
        // === 1. 상단 바 뒤로가기 버튼 클릭 시 나만의 약통 초기 페이지로 이동 === //
        binding.layoutHeaderBackBtn.setOnClickListener { startActivity(intentMedi) }
        // === 2. + 버튼 및 복용시간 설정 / 수정하기 텍스트 클릭 시 시간 설정 페이지로 이동 === //
        binding.mediboxEditTime.setOnClickListener { startActivity(intentSetTime) }
        binding.mediboxEditBoxBtn1.setOnClickListener { startActivity(intentSetTime) }
        binding.mediboxEditBoxBtn2.setOnClickListener { startActivity(intentSetTime) }
        binding.mediboxEditBoxBtn3.setOnClickListener { startActivity(intentSetTime) }
        // === 3. 설정 저장 텍스트 클릭 시 === // → ~값을 받아 넘기는 기능 구현해야함~ ←
        binding.layoutApplyText.setOnClickListener { startActivity(intentApply) }

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