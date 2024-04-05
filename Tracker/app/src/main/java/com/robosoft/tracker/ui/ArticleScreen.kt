package com.robosoft.tracker.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.robosoft.tracker.R

@Composable
fun ArticlesScreen(drawerState: DrawerState) {
    Scaffold(
        topBar = {
            CustomAppBar(
                drawerState = drawerState,
                title = stringResource(id = R.string.article_screen)
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = Modifier,
                text = "Articles Screen"
            )
        }
    }
}