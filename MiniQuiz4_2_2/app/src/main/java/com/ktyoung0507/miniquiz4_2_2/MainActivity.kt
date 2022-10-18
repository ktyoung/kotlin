package com.ktyoung0507.miniquiz4_2_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import com.ktyoung0507.miniquiz4_2_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    var apple = false
    var banana = false
    var orange = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.checkApple.setOnCheckedChangeListener { buttonView, isChecked ->
            apple = isChecked
            printFruits()
        }
        binding.checkBanana.setOnCheckedChangeListener { buttonView, isChecked ->
            banana = isChecked
            printFruits()
        }
        binding.checkOrange.setOnCheckedChangeListener { buttonView, isChecked ->
            orange = isChecked
            printFruits()
        }
    }

    fun printFruits() {
        var str = ""

        if (apple) str = " 사과"

        if (banana) {
            if (str.isNotEmpty()) str += "와"
            str += " 바나나"
        }
        if (orange) {
            if (str.isNotEmpty()) str += "와"
            str += " 오렌지"
        }
        binding.textView.text = "${str}가 선택되었습니다."
    }
}