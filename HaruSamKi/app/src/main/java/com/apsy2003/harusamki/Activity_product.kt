package com.apsy2003.harusamki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apsy2003.harusamki.databinding.ActivityProductBinding

class Activity_product : AppCompatActivity() {

    val binding by lazy{ ActivityProductBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //되돌아가기 버튼
        val Back = Intent(this, Activity_indexmain::class.java)
        binding.iconBox.setOnClickListener{ startActivity(Back)}

        //햄버거 메뉴 링크 연결
        val hamMenu = Intent(this, Activity_hambuger::class.java)
        binding.head4.setOnClickListener{ startActivity(hamMenu)}

        //음식 메뉴들 선택시, 구매 링크로 연결
        val purchase = Intent(this, Activity_purchase::class.java)
        binding.productsection1.setOnClickListener{ startActivity(purchase)}
        binding.productsection2.setOnClickListener{ startActivity(purchase)}
        binding.productsection3.setOnClickListener{ startActivity(purchase)}
        binding.productsection4.setOnClickListener{ startActivity(purchase)}

        //하단 footer메뉴 링크 연결
        val Footmenu1 = Intent(this, Activity_review::class.java)
        binding.fmenu1.setOnClickListener{ startActivity(Footmenu1)}

        val Footmenu2 = Intent(this, Activity_Community::class.java)
        binding.fmenu2.setOnClickListener{ startActivity(Footmenu2)}

        val Footmenu3 = Intent(this, Activity_indexmain::class.java)
        binding.fmenu3.setOnClickListener{ startActivity(Footmenu3)}

        val Footmenu4 = Intent(this, Activity_mypage::class.java)
        binding.fmenu4.setOnClickListener{ startActivity(Footmenu4)}

        val Footmenu5 = Intent(this, Activity_setting::class.java)
        binding.fmenu5.setOnClickListener{ startActivity(Footmenu5)}
    }


}