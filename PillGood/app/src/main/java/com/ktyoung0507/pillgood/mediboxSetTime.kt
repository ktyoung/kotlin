package com.ktyoung0507.pillgood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.pillgood.databinding.ActivityMediboxSetTimeBinding

class mediboxSetTime : AppCompatActivity() {
    val binding by lazy { ActivityMediboxSetTimeBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // ***** intent 경로 설정 ***** //
        // === 1. 나만의 약통 편집 페이지 === //
        val intentMediEdit = Intent(this, mediboxEdit::class.java)
        // === 2. 나만의 약통 영양소 선택 페이지 === //
        val intentSelect = Intent(this, mediboxSelectMedi::class.java)


        // ***** 버튼 및 텍스트 클릭 시 링크 설정 ***** //
        // === 1. 상단 바 뒤로가기 버튼 클릭 시 나만의 약통 편집 페이지로 이동 === //
        binding.layoutHeaderBackBtn.setOnClickListener { startActivity(intentMediEdit) }
        // === 2. 시간 설정 후 설정 저장 텍스트 클릭 시 영양소 선택 페이지로 이동 === //
        binding.layoutApplyText.setOnClickListener { startActivity(intentSelect) }
    }
}