package com.metehanbolat.alarmmanagercompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.alarmmanagercompose.ui.theme.AlarmManagerComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlarmManagerComposeTheme {

            }
        }
    }
}
