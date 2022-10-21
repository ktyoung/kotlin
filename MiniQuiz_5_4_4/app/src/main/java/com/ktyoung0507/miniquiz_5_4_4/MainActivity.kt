package com.ktyoung0507.miniquiz_5_4_4

import android.content.Context
import android.graphics.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ktyoung0507.miniquiz_5_4_4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val customView = CustomView(this)
        binding.frameLayout.addView(customView)
    }
}

class CustomView(context: Context) : View(context) {
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        drawFigure(canvas)
    }

    fun drawFigure(canvas: Canvas?) {
        val rectF = RectF(50f, 300f, 400f, 450f)
        val rectPaint = Paint()
        rectPaint.color = Color.BLUE
        rectPaint.style = Paint.Style.FILL
        canvas?.drawRoundRect(rectF, 50f, 50f, rectPaint)

        rectPaint.color = Color.RED
        rectPaint.style = Paint.Style.STROKE
        rectPaint.strokeWidth = 10f
        canvas?.drawRoundRect(rectF, 50f, 50f, rectPaint)

        val red = Paint()
        red.style = Paint.Style.FILL
        red.color = Color.RED
        canvas?.drawCircle(300f,300f, 200f, red)

        val white = Paint()
        white.style = Paint.Style.FILL
        white.color = Color.WHITE
        canvas?.drawCircle(300f,300f, 150f, white)
    }
}