package com.ktyoung0507.customtext

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import org.w3c.dom.Attr

class CustomText: AppCompatTextView {
    fun process(delimeter: String) {
        var one = text.substring(0,4)
        var two = text.substring(4,6)
        var three = text.substring(6)

        setText("$one $delimeter $two $delimeter $three")
    }

    constructor(context: Context): super(context) {

    }
    constructor(context: Context, attr: AttributeSet): super(context, attr) {
        val typed = context.obtainStyledAttributes(attr, R.styleable.CustomText)
        val size = typed.indexCount

        for (i in 0 until size) {
            when (typed.getIndex(i)) {
                R.styleable.CustomText_delimeter -> {
                    val delimeter = typed.getString(typed.getIndex(i)) ?: "-"
                    process(delimeter)
                }
            }
        }
    }
    constructor(context: Context, attr: AttributeSet, defStyleAttr: Int): super(context, attr, defStyleAttr) {

    }
}