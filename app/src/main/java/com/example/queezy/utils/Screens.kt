package com.example.queezy.utils

sealed class Screens(val name:String){
    object MainScreen:Screens("main")
    object UserScreen:Screens("user")
}