package com.ktyoung0507.pillgood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.pillgood.databinding.ActivityMediboxSelectMediBinding

class mediboxSelectMedi : AppCompatActivity() {
    val binding by lazy { ActivityMediboxSelectMediBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // ***** intent 경로 설정 ***** //
        // === 1. 나만의 약통 시간 설정 페이지 === //
        val intentBack = Intent(this, mediboxSetTime::class.java)
        // === 2. 나만의 약통 세부 설정 페이지 === //
        val intentSetDetails = Intent(this, mediboxSetDetails::class.java)


        // ***** 버튼 및 텍스트 클릭 시 링크 설정 ***** //
        // === 1. 상단 바 뒤로가기 버튼 클릭 시 나만의 약통 시간 설정 페이지로 이동 === //
        binding.layoutHeaderBackBtn.setOnClickListener { startActivity(intentBack) }
        // === 2. 영양소 선택 시 나만의 약통 세부 설정 페이지로 이동=== //
        binding.mediboxSelectBox1.setOnClickListener { startActivity(intentSetDetails) }
    }
}