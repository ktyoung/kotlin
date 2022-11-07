package com.ktyoung0507.firebasechat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.ktyoung0507.firebasechat.databinding.ActivityChatListBinding
import com.ktyoung0507.firebasechat.model.Room

class ChatListActivity : AppCompatActivity() {
    val binding by lazy { ActivityChatListBinding.inflate(layoutInflater) }
    val database = Firebase.database("https://groovy-form-367500-default-rtdb.asia-southeast1.firebasedatabase.app/")
    val roomsRef = database.getReference("rooms")

    companion object {
        var userId: String = ""
        var userName: String = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        userId = intent.getStringExtra("userId") ?: "none"
        userName = intent.getStringExtra("userName") ?: "Anonymous"

        with(binding) {
            btnCreate.setOnClickListener { openCreateRoom() }
        }
    }

    fun openCreateRoom() {
        val editTitle = EditText(this)
        val dialog = AlertDialog.Builder(this).setTitle("방 이름").setView(editTitle).setPositiveButton("만들기") { dlg, id ->
            createRoom(editTitle.text.toString())
        }
        dialog.show()
    }

    fun createRoom(title:String) {
        val room = Room(title, userName)
        val roomId = roomsRef.push().key!!
        room.id = roomId
        roomsRef.child(roomId).setValue(room)
    }
}