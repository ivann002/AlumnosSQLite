package com.example.alumnossqlite

data class Usuarios(
    var id:Int?,
    var nombre:String,
    var asig:String,
    var imagen: ByteArray,
    var email:String
):java.io.Serializable