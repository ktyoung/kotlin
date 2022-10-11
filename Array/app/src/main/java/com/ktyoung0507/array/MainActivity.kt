package com.ktyoung0507.array

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var student = IntArray(10)
        var longArray = LongArray(10)
        var CharArray = CharArray(10)
        var FloatArray = FloatArray(10)
        var DoubleArray = DoubleArray(10)
        var intArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        var stringArray = Array(10, {item -> ""})
        var dayArray = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")

        student[0] = 90
        student[1] = 91
        student[2] = 92
        student[3] = 93
        student[4] = 94
        student.set(5, 95)
        student.set(6, 96)
        student.set(7, 97)
        student.set(8, 98)
        student.set(9, 99)

        intArray[6] = 137
        intArray.set(9, 200)

        var seventhValue = intArray[6]
        Log.d("Array","8번째 intArray의 값은 ${seventhValue}입니다.")
        var tenthValue = intArray.get(9)
        Log.d("Array","8번째 intArray의 값은 ${tenthValue}입니다.")

        Log.d("Array","첫 번째 dayArray의 값은 ${dayArray[0]}입니다.")
        Log.d("Array","여섯 번째 dayArray의 값은 ${dayArray.get(5)}입니다.")
    }
}