package com.ktyoung0507.pillgood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.pillgood.databinding.ActivityMediboxSetAmountBinding

class mediboxSetAmount : AppCompatActivity() {
    val binding by lazy { ActivityMediboxSetAmountBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // NumberPicker 설정
        binding.numberPicker.minValue = 1
        binding.numberPicker.maxValue = 3
        binding.numberPicker.value = 2
        val values: Array<String> = arrayOf("캡슐", "정", "개")
        binding.numberPicker.displayedValues = values

        // 상단 바 뒤로가기 버튼 클릭 시
        val intentBack = Intent(this, mediboxSetDetails::class.java)
        binding.layoutHeaderBackBtn.setOnClickListener { startActivity(intentBack) }

        // 설정 저장 텍스트 클릭 시
        val intentApply = Intent(this, mediboxSetDetails::class.java)
        binding.layoutApplyText.setOnClickListener { startActivity(intentApply) }
    }
}