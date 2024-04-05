package com.robosoft.tracker.ui

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.rememberCoroutineScope
import com.robosoft.tracker.R
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomAppBar(
    drawerState: DrawerState,
    title: String
) {
    TopAppBar(
        modifier = Modifier.fillMaxWidth(),
        title = { AppBarTitle(title = title) },
        navigationIcon = {
            NavIcon(
                drawerState = drawerState
            )
        }
    )
}

@Composable
fun NavIcon(
    modifier: Modifier = Modifier,
    drawerState: DrawerState
) {
    val coroutineScope = rememberCoroutineScope()
    Icon(
        modifier = modifier
            .size(64.dp)
            .padding(16.dp)
            .clickable(onClick = {
                coroutineScope.launch {
                    if (drawerState.isClosed) {
                        drawerState.open()
                    } else {
                        drawerState.close()
                    }
                }
            }
            ),
        imageVector = Icons.Outlined.Menu,
        contentDescription = "Menu Icon"
    )
}

@Composable
fun AppBarTitle(
    modifier: Modifier = Modifier,
    title: String
) {
    Text(
        modifier = modifier.fillMaxWidth(1f),
        text = title
    )
}

@Composable
@Preview
fun CustomAppBarPreview() {
//    CustomAppBar() {}
}