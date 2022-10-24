package com.ktyoung0507.pillgood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.pillgood.databinding.ActivityInfoBinding

class info : AppCompatActivity() {
    val binding by lazy { ActivityInfoBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 상단 바 뒤로가기 버튼 클릭 시
        val intentBack = Intent(this, home::class.java)
        binding.layoutHeaderBackBtn.setOnClickListener { startActivity(intentBack) }

        // 영양소 클릭 시
        val intentDetail = Intent(this, infoDetail::class.java)
        binding.infoCat2Content1.setOnClickListener { startActivity(intentDetail) }

        // 하단 바 HOME 버튼 클릭 시
        val intentHome = Intent(this, home::class.java)
        binding.homeFooterHomeBox.setOnClickListener { intentHome }
    }
}