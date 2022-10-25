package com.ktyoung0507.pillgood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.pillgood.databinding.ActivityMediboxSetNameBinding

class mediboxSetName : AppCompatActivity() {
    val binding by lazy { ActivityMediboxSetNameBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 상단 바 뒤로가기 버튼 클릭 시
        val intentBack = Intent(this, mediboxSetDetails::class.java)
        binding.layoutHeaderBackBtn.setOnClickListener { startActivity(intentBack) }

        // 설정 저장 텍스트 클릭 시
        val intentApply = Intent(this, mediboxSetDetails::class.java)
        binding.layoutApplyText.setOnClickListener { startActivity(intentApply) }
    }
}