package com.ktyoung0507.pillgood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.pillgood.databinding.ActivityMediboxSetDetailsBinding

class mediboxSetDetails : AppCompatActivity() {
    val binding by lazy { ActivityMediboxSetDetailsBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 상단 바 뒤로가기 버튼 클릭 시
        val intentBack = Intent(this, mediboxSetTime::class.java)
        binding.layoutHeaderBackBtn.setOnClickListener { startActivity(intentBack) }

        // 설정 저장 텍스트 클릭 시
        val intentSelect = Intent(this, medibox::class.java)
        binding.layoutApplyText.setOnClickListener { startActivity(intentSelect) }

        // 영양소명 수정하기 클릭 시
        val intentSetName = Intent(this, mediboxSetName::class.java)
        binding.mediboxSetName.setOnClickListener { startActivity(intentSetName) }

        // 섭취량 수정하기 클릭 시
        val intentSetAmount = Intent(this, mediboxSetAmount::class.java)
        binding.mediboxSetAmount.setOnClickListener { startActivity(intentSetAmount) }

        // 반복 수정하기 클릭 시
        val intentSetRepeat = Intent(this, mediboxSetRepeat::class.java)
        binding.mediboxSetRepeat.setOnClickListener { startActivity(intentSetRepeat) }
    }
}