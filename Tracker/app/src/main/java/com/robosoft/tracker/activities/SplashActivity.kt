package com.robosoft.tracker.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import com.robosoft.tracker.viewmodels.SplashViewModel
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.robosoft.tracker.R

@SuppressLint("CustomSplashScreen")
class SplashActivity : ComponentActivity() {

    private val viewmodel: SplashViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val hasLoaded = viewmodel.hasLoaded.collectAsState()
            if (hasLoaded.value) {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            }
            ShowScreen()
        }
    }
}

@Composable
private fun ShowScreen(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier.fillMaxSize(),
        painter = painterResource(R.drawable.robologo),
        contentDescription = "")
}