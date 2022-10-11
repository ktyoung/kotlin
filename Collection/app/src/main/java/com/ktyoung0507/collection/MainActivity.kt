package com.ktyoung0507.collection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mutableList = mutableListOf<Any>("MON", "TUE", "WED")
        mutableList.add("THU")

        Log.d("Collection","mutableList의 첫 번째 값은 ${mutableList.get(0)}")
        Log.d("Collection","mutableList의 두 번째 값은 ${mutableList.get(1)}")

        var stringList = mutableListOf<String>()
        stringList.add("월")
        stringList.add("화")
        stringList.add("수")

        stringList.set(1,"요일 변경")
        Log.d("Collection","stringList에 입력된 두 번째 값은 ${stringList.get(1)}입니다.")

        stringList.removeAt(1)
        Log.d("Collection","stringList에 입력된 두 번째 값은 ${stringList.get(1)}입니다.")
        Log.d("Collection","stringList에는 ${stringList.size}개의 값이 있습니다.")
    }
}