package com.example.queezy.ui.App


import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.queezy.ui.App.screens.MainScreen
import com.example.queezy.ui.App.screens.UserScreen
import com.example.queezy.utils.Screens
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
fun App(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        modifier = modifier,

    ) { paddingValues ->
        NavHost(
            modifier = modifier.padding(paddingValues = paddingValues),
            navController = navController,
            startDestination = Screens.MainScreen.name,
            exitTransition = { fadeOut(animationSpec = tween(25)) },
            enterTransition = { fadeIn(animationSpec = tween(25)) }
        ) {

            composable(route = Screens.MainScreen.name) {
                MainScreen(navController = navController)
            }
            composable(route = Screens.UserScreen.name) {
                UserScreen(navController = navController)
            }

        }

    }
}