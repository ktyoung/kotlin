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

        // 상단 바 뒤로가기 버튼 클릭 시
        val intentBack = Intent(this, medibox::class.java)
        binding.layoutHeaderBackBtn.setOnClickListener { startActivity(intentBack) }

        // + 버튼 및 복용시간 설정 / 수정하기 텍스트 클릭 시
        val intentSetTime = Intent(this, mediboxSetTime::class.java)
        binding.mediboxEditBoxBtn1.setOnClickListener { startActivity(intentSetTime) }
        binding.mediboxEditBoxBtn2.setOnClickListener { startActivity(intentSetTime) }
        binding.mediboxEditBoxBtn3.setOnClickListener { startActivity(intentSetTime) }

    }
}