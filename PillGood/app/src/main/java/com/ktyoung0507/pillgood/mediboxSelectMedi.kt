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

        // 상단 바 뒤로가기 버튼 클릭 시
        val intentBack = Intent(this, mediboxSetTime::class.java)
        binding.layoutHeaderBackBtn.setOnClickListener { startActivity(intentBack) }

        // 영양소 선택 시
        val intentSetDetails = Intent(this, mediboxSetDetails::class.java)
        binding.mediboxSelectBox1.setOnClickListener { startActivity(intentSetDetails) }
    }
}