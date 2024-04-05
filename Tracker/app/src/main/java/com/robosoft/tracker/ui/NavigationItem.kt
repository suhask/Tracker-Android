package com.robosoft.tracker.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.robosoft.tracker.ui.uimodels.DrawerMenu
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

val menus = arrayOf(
    DrawerMenu(Icons.Filled.Home, "Home_screen", MainRoute.HomeScreen.name),
    DrawerMenu(Icons.Filled.Face, "Articles", MainRoute.Articles.name),
    DrawerMenu(Icons.Filled.Settings, "Settings", MainRoute.Settings.name),
    DrawerMenu(Icons.Filled.Info, "About Us", MainRoute.About.name)
)

@Composable
fun MainNavigation(
    navController: NavHostController = rememberNavController(),
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    drawerState: DrawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
) {
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                DrawerContent(menus) { route ->
                    coroutineScope.launch {
                        drawerState.close()
                    }
                    navController.navigate(route)
                }
            }
        }
    ) {
        NavHost(navController = navController, startDestination = MainRoute.HomeScreen.name) {
            composable(MainRoute.HomeScreen.name) {
                HomeScreen(drawerState = drawerState)
            }
            composable(MainRoute.Articles.name) {
                ArticlesScreen(drawerState)
            }
            composable(MainRoute.About.name) {
                AboutScreen(drawerState)
            }
            composable(MainRoute.Settings.name) {
                SettingsScreen(drawerState)
            }
        }
    }
}

enum class MainRoute(value: String) {
    HomeScreen("Home_screen"),
    Articles("articles"),
    About("about"),
    Settings("settings")
}