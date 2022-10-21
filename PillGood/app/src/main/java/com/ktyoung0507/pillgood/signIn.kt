package com.ktyoung0507.pillgood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.pillgood.databinding.ActivitySignInBinding

class signIn : AppCompatActivity() {
    val binding by lazy { ActivitySignInBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 뒤로가기(회원가입 취소)
        val intentBack = Intent(this, login::class.java)
        binding.layoutHeaderBackBtn.setOnClickListener { startActivity(intentBack) }

        // 회원가입 완료 → 우선 페이지 이동만 되게 구현(1020)
        // *** 계정정보 DB 연동 구현하기 ***//
        val intentFin = Intent(this, login::class.java)
        binding.loginSignBtn.setOnClickListener { startActivity(intentFin) }
    }
}