package com.ktyoung0507.controlflowwhile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        var current = 1
        val until = 12
        while( current < until) {
            Log.d("while", "현재값은 ${current} 입니다.")
            current += 1;
        }
        */

        /*
        var game = 1
        val match = 6
        do {
            Log.d("while", "${game}게임 이겼습니다. 우승까지 ${match - game}게임 남았습니다.")
            game += 1
        } while (game < match)
        */

        /*
        var game = 6
        val match = 6
        while (game < match) {
            Log.d("while", "while 테스트입니다.")
            game += 1
        }
        */

        /*
        var game = 6
        val match = 6
        do {
            Log.d("while", "do - while 테스트입니다.")
            game += 1
        } while (game < match)
        */

        /*
        for(index in 1 .. 10) {
            Log.d("while", "break > 현재 index는 ${index} 입니다.")
            if(index > 5) {
                break
            }
        }
        */

        /*
        for(except in 1 .. 10) {
            if(except > 3 && except < 8) {
                continue
            }
            Log.d("while", "continue > 현재 index는 ${except}입니다.")
        }
        */

        var a = 1
        while (a == 1) {
            Log.d("while", "조건을 만족하면 여기를 출력하세요.")
        }
    }
}