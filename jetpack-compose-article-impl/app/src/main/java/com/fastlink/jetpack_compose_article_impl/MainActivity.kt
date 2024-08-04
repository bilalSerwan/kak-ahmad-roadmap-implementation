package com.fastlink.jetpack_compose_article_impl

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.fastlink.jetpack_compose_article_impl.ui.theme.JetpackcomposearticleimplTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackcomposearticleimplTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                  HomeScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@AppPreview
@Composable
fun HomeScreenPreview(){
    JetpackcomposearticleimplTheme {
        Surface {
            HomeScreen()
        }
    }
}



