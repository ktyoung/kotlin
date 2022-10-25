package com.ktyoung0507.pillgood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.pillgood.databinding.ActivityMediboxBinding

class medibox : AppCompatActivity() {
    val binding by lazy { ActivityMediboxBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 상단 바 뒤로가기 버튼 클릭 시
        val intentBack = Intent(this, home::class.java)
        binding.layoutHeaderBackBtn.setOnClickListener { startActivity(intentBack) }

        // 약통 이미지 및 약통 편집하기 텍스트 클릭 시
        val intentEditMedi = Intent(this, mediboxEdit::class.java)
        binding.mediboxModText.setOnClickListener { startActivity(intentEditMedi) }
        binding.mediboxAddMediImg1.setOnClickListener { startActivity(intentEditMedi) }
        binding.mediboxAddMediImg2.setOnClickListener { startActivity(intentEditMedi) }
        binding.mediboxAddMediImg3.setOnClickListener { startActivity(intentEditMedi) }
    }
}