package com.ktyoung0507.pillgood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ktyoung0507.pillgood.databinding.ActivityLoginBinding

class login : AppCompatActivity() {
    val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 홈화면으로 이동 (메인페이지)
        val intentLogin = Intent(this, home::class.java)
        binding.loginLoginBtn.setOnClickListener { startActivity(intentLogin) }

        // 회원가입 페이지 이동
        val intentSignIn = Intent(this, signIn::class.java)
        binding.loginSignBtn.setOnClickListener { startActivity(intentSignIn) }
    }
}