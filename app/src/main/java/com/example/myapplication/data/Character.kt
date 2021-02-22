package com.example.myapplication.data

class Character(
    val name: String,
    val surname: String,
    val age: Int,
    var job: String=""
){
    lateinit var humeur : String

    fun getHumeurSmiley(): String{
       humeur = "happy"
        return if(humeur == "happy"){
            "😀"
        }else{
            "😭"
        }
    }
}

