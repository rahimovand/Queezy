package com.example.queezy.ui.App


import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.shrinkOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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

    Scaffold(
        modifier = modifier,
        ) { paddingValues ->
        NavHost(
            modifier = modifier
                .padding(paddingValues = paddingValues)
                .padding(1.dp)
            ,
            navController = navController,
            startDestination = Screens.MainScreen.name ,
            enterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Up,
                    animationSpec = tween(700)
                )},
            exitTransition =  {
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Down,
                    animationSpec = tween(700)
                )}
        ) {

            composable(
                route = Screens.MainScreen.name
            ) {
                MainScreen(
                    modifier = modifier,
                    navController = navController
                )
            }
            composable(
                route = Screens.UserScreen.name
            ) {
                UserScreen(
                    modifier = modifier,
                    navController = navController
                )
            }

        }

    }
}