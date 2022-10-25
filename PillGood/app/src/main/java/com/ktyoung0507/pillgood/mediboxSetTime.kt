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

        // 상단 바 뒤로가기 버튼 클릭 시
        val intentBack = Intent(this, medibox::class.java)
        binding.layoutHeaderBackBtn.setOnClickListener { startActivity(intentBack) }

        // 시간 설정 후 설정 저장 텍스트 클릭 시
        val intentSelect = Intent(this, mediboxSelectMedi::class.java)
        binding.layoutApplyText.setOnClickListener { startActivity(intentSelect) }
    }
}