package com.ktyoung0507.function

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun square(x: Int): Int {
            return x * x
        }

        fun printSum(x: Int, y: Int) {
            Log.d("fun","x + y = ${x+y}")
        }

        fun getPI(): Double {
            return 3.14
        }

        fun newFunction(name: String, age: Int=29, weight: Double=65.5) {
            Log.d("fun","name의 값은 ${name}입니다.")
            Log.d("fun","age의 값은 ${age}입니다")
            Log.d("fun","weight의 값은 ${weight}입니다")
        }

        fun plus(x: Int, y: Int) : Int {
            return x + y
        }

        fun sum(x: Int) : Int {
            var result = 0
            for(num in 0 .. x) {
                result += num
            }
            return result
        }

        fun printString(str : String) {
            System.out.println(str)
        }

        //-- 함수 선언 끝

        var squareResult = square(30)
        Log.d("fun", "30의 제곱근은 ${squareResult}입니다.")

        printSum(3, 5)

        val PI = getPI()
        Log.d("fun", "지름이 10인 원의 둘레는 ${10 * PI}입니다.")

        newFunction("Hello")

        newFunction("Michael", weight = 67.5)
        Log.d("fun","5와 7을 더한 결과값은 ${plus(5, 7)}입니다.")
        Log.d("fun","0부터 100을 모두 더한 결과값은 ${sum(100)}입니다.")
        printString("문자열")


    }
}