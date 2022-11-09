package com.ktyoung0507.firebasestorage

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage

class MainActivity : AppCompatActivity() {
    val storage = Firebase.storage("gs://groovy-form-367500.appspot.com")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun upload(uri: Uri) {
        val fullPath = makeFilePath("images", "temp", uri)
        val imageRef = storage.getReference(fullPath)
        val uploadTask = imageRef.putFile(uri)

        uploadTask.addOnFailureListener {
            Log.d("스토리지", "실패=>${it.message}")
        }.addOnSuccessListener { taskSnapshot ->
            Log.d("스토리지", "성공 주소=>${fullPath}")
        }
    }

    fun makeFilePath(path:String, userId:String, uri:Uri): String {
        val mimeType = contentResolver.getType(uri)?: "/none"
        val ext = mimeType.split("/")[1]
        val timeSuffix = System.currentTimeMillis()
        val filename = "${path}/${userId}_${timeSuffix}.${ext}"

        return filename
    }
}