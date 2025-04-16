package com.example.queezy.utils

import androidx.navigation.NavController

sealed class Screens(val name:String){
    data object MainScreen:Screens("main")
    data object UserScreen:Screens("user")
}

fun NavController.navigateOnce(name:String){
    if (this.currentDestination?.route != name){
        this.navigate(name)
    }
}
fun NavController.popBackStackOnce(){
    if (this.previousBackStackEntry != null){
        this.popBackStack()
    }
}