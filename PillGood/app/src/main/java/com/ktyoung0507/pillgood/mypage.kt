package com.ktyoung0507.pillgood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.pillgood.databinding.ActivityMypageBinding

class mypage : AppCompatActivity() {
    val binding by lazy { ActivityMypageBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // ***** intent 경로 설정 ***** //
        // === 1. 상단 바 뒤로가기 버튼 클릭 시 === //
        val intentBack = Intent(this, home::class.java)
        // === 2. HOME 초기 페이지 === //
        val intentHome = Intent(this, home::class.java)
        // === 3. 영양소 정보 초기 페이지 === //
        val intentInfo = Intent(this, info::class.java)
        // === 4. 나만의 약통 초기 페이지 === //
        val intentMedi = Intent(this, medibox::class.java)
        // === 5. 내 정보 초기 페이지 === //
        val intentMyPage = Intent(this, mypage::class.java)
        // === 6. 회원 정보 관리 페이지 === //
        val intentEditInfo = Intent(this, myInfoEdit::class.java)
        // === 7. 로그인 페이지 === //
        val intentLogOut = Intent(this, login::class.java)

        // ***** 버튼 및 텍스트 클릭 시 링크 설정 ***** //
        // === 1. 상단 바 뒤로가기 버튼 클릭 시 HOME 화면으로 이동 === //
        binding.layoutHeaderBackBtn.setOnClickListener { startActivity(intentBack) }
        // === 2. 회원 정보 관리 텍스트 클릭 시 회원 정보 관리 페이지로 이동 === //
        binding.myInfoEditInfoBox.setOnClickListener { startActivity(intentEditInfo) }
        // === 3. 로그아웃 텍스트 클릭 시 로그인 페이지로 이동 === //
        binding.myInfoLogout.setOnClickListener { startActivity(intentLogOut) }
        binding.myInfoLogoutText.setOnClickListener { startActivity(intentLogOut) }

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
    }
}