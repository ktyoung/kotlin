package com.apsy2003.harusamki.model

class User {

    var id: String = "" //사용자 아이디
    var password: String = "" // 비밀번호
    var name: String = "" //닉네임

    constructor()

    constructor(id:String, password:String, name:String){
        this.id = id
        this.password = password
        this.name = name
    }
}