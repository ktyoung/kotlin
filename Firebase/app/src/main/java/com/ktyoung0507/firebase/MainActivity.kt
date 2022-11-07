package com.ktyoung0507.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.ktyoung0507.firebase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        val database = Firebase.database("https://groovy-form-367500-default-rtdb.asia-southeast1.firebasedatabase.app/")
        val myRef = database.getReference("users")

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        fun addItem(user: User) {
            val id = myRef.push().key!!
            user.id = id
            myRef.child(id).setValue(user)
        }
        with(binding){
            btnPost.setOnClickListener {
                val name = editName.text.toString()
                val password = editPassword.text.toString()
                val user = User(name, password)
                addItem(user)
            }
        }

        myRef.addValueEventListener( object: ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                with(binding) {
                    textList.setText("")
                    for (item in snapshot.children) {
                        item.getValue(User::class.java)?.let { user ->
                            textList.append("${user.name} : ${user.password} \n")
                        }
                    }
                }

            }

            override fun onCancelled(error: DatabaseError) {
                print(error.message)
            }
        })
    }
}

class User {
    var id:String = ""
    var name: String = ""
    var password: String = ""
    constructor()

    constructor(name:String, password:String) {
        this.name = name
        this.password = password
    }
}