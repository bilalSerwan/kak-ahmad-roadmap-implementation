package com.fastlink.service_implementation

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fastlink.service_implementation.ui.theme.ServiceimplementationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ServiceimplementationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

@Composable
fun Greeting( modifier: Modifier = Modifier) {
        val serviceIntent  = Intent(this@MainActivity, service::class.java)
    Column(modifier.fillMaxSize() , verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {
            startService(serviceIntent)
        }) {
            Text(text = "Start Service")
        }
        Spacer(modifier = Modifier.height(10.dp))
    Button(onClick = {
        stopService(serviceIntent)
    }) {
        Text(text ="Stop Service")
    }
    }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ServiceimplementationTheme {
    }
}