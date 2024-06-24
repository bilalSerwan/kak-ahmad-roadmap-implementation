package com.fastlink.activityimplementation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

import com.fastlink.activityimplementation.ui.theme.ActivityImplementationTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        println("onCreate() method Running ................")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ActivityImplementationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding),
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        println("onStart() method Running ................")
    }

    override fun onResume() {
        super.onResume()
        println("onResume() method Running ................")
    }

    override fun onPause() {
        super.onPause()
        println("onPause() method Running ................")

    }
    override fun onStop() {
        super.onStop()
        println("onStop() method Running ................")
    }
    override fun onRestart() {
        super.onRestart()
        println("onRestart() method Running ................")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy() method Running ................")
    }
}

@Composable
fun Greeting( modifier: Modifier = Modifier, ) {
    Column(modifier=modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Hello world",
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp)
    }
}

