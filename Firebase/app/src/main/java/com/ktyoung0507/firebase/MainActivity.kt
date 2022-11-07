package com.ktyoung0507.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = Firebase.database
        val myRef = database.getReference("bbs")

        myRef.child("name").get().addOnSuccessListener {
            Log.d("파이어베이스", "name=${it.value}")
        }.addOnFailureListener {
            Log.d("파이어베이스", "name=${it}")
        }
    }
}