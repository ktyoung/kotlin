package com.ktyoung0507.pillgood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.pillgood.databinding.ActivityMediboxSetDetailsBinding
import com.ktyoung0507.pillgood.memo.MainActivity

class mediboxSetDetails : AppCompatActivity() {
    val binding by lazy { ActivityMediboxSetDetailsBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // ***** intent 경로 설정 ***** //
        // === 1. 나만의 약통 영양소 선택 페이지 === //
        val intentBack = Intent(this, mediboxSelectMedi::class.java)
        // === 2. 나만의 약통 초기 페이지 === // → ~값을 받아 넘기는 기능 구현해야함~ ←
        val intentMedi = Intent(this, medibox::class.java)
        // === 3. 영양소명 편집 페이지 === //
        val intentSetName = Intent(this, mediboxSetName::class.java)
        // === 4. 섭취량 편집 페이지 === //
        val intentSetAmount = Intent(this, mediboxSetAmount::class.java)
        // === 5. 반복 편집 페이지 === //
        val intentSetRepeat = Intent(this, mediboxSetRepeat::class.java)
        // === 6. 메모 입력 페이지 === //
        val intentMemo = Intent(this, MainActivity::class.java)


        // ***** 버튼 및 텍스트 클릭 시 링크 설정 ***** //
        // === 1. 상단 바 뒤로가기 버튼 클릭 시 나만의 약통 영양소 선택 페이지로 이동 === //
        binding.layoutHeaderBackBtn.setOnClickListener { startActivity(intentBack) }
        // === 2. 설정 저장 텍스트 클릭 시 나만의 약통 초기페이지로 이동 === // → ~값을 받아 넘기는 기능 구현해야함~ ←
        binding.layoutApplyText.setOnClickListener { startActivity(intentMedi) }
        // === 3. 영양소명 수정하기 클릭 시 영양소명 편집 페이지로 이동 === //
        binding.mediboxSetName.setOnClickListener { startActivity(intentSetName) }
        // === 4. 섭취량 수정하기 클릭 시 섭취량 편집 페이지로 이동 === //
        binding.mediboxSetAmount.setOnClickListener { startActivity(intentSetAmount) }
        // === 5. 반복 수정하기 클릭 시 반복 편집 페이지로 이동 === //
        binding.mediboxSetRepeat.setOnClickListener { startActivity(intentSetRepeat) }
        // === 6. 메모 입력하기 클릭 시 메모 입력 페이지로 이동 === //
        binding.mediboxSetMemo.setOnClickListener { startActivity(intentMemo) }
    }
}