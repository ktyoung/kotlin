package com.apsy2003.harusamki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.apsy2003.harusamki.databinding.ActivityAppLoginBinding
import com.apsy2003.harusamki.model.User

class App_login : AppCompatActivity() {
    val binding by lazy { ActivityAppLoginBinding.inflate(layoutInflater) }
    val database = Firebase.database("https://harusamki-8f63d-default-rtdb.asia-southeast1.firebasedatabase.app/")
    val usersRef = database.getReference("users")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding) {
            binding.btnSignin.setOnClickListener { signin() }
            binding.btnSignup.setOnClickListener { signup() }
        }
    }

    fun signup() {
        with(binding) {
            val id = editId.text.toString()
            val password = editPassword.text.toString()
            val name = editName.text.toString()

            if (id.isNotEmpty() && password.isNotEmpty() && name.isNotEmpty()) {
                usersRef.child(id).get().addOnSuccessListener {
                    if (it.exists()) {
                        Toast.makeText(baseContext, "아이디가 존재합니다.", Toast.LENGTH_LONG).show()
                    } else {
                        val user = User(id, password, name)
                        usersRef.child(id).setValue(user)
                        signin()
                    }
                }
            } else {
                Toast.makeText(baseContext, "아이디, 비밀번호, 별명을 모두 입력해야 합니다.", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun signin() {
        with(binding) {
            val id = editId.text.toString()
            val password = editPassword.text.toString()

            if (id.isNotEmpty() && password.isNotEmpty()) {
                usersRef.child(id).get().addOnSuccessListener {
                    if (it.exists()) {
                        it.getValue(User::class.java)?.let { user ->
                            if (user.password == password) {
                                goChatroomList(user.id, user.name)
                            } else {
                                Toast.makeText(baseContext, "비밀번호가 다릅니다.", Toast.LENGTH_LONG).show()
                            }
                        }
                    } else {
                        Toast.makeText(baseContext, "아이디가 없습니다.", Toast.LENGTH_LONG).show()
                    }
                }
            } else {
                Toast.makeText(baseContext, "아이디, 비밀번호를 입력해야 합니다.", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun goChatroomList(userId: String, userName: String) {
        val intent = Intent(this, CustomerChatList::class.java)
        intent.putExtra("userId", userId)
        intent.putExtra("userName", userName)
        startActivity(intent)
    }
}