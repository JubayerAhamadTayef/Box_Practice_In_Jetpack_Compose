package com.jubayer_ahamad_tayef.box_in_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jubayer_ahamad_tayef.box_in_jetpack_compose.ui.theme.Box_In_Jetpack_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Box_In_Jetpack_ComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                }
            }
        }
    }
}

@Composable
fun MyBox(modifier: Modifier) {
    Box(modifier = modifier.fillMaxSize(), ) {
        Spacer(
            modifier = modifier
                .size(100.dp)
                .background(MaterialTheme.colorScheme.primary)
        )
        Spacer(
            modifier = modifier
                .size(100.dp)
                .background(MaterialTheme.colorScheme.primary)
                .align(alignment = Alignment.Center)
        )
        Spacer(
            modifier = modifier
                .size(100.dp)
                .background(MaterialTheme.colorScheme.primary)
                .align(Alignment.BottomEnd)
        )
        Spacer(
            modifier = modifier
                .size(100.dp)
                .background(MaterialTheme.colorScheme.primary)
                .align(Alignment.TopEnd)
        )
        Spacer(
            modifier = modifier
                .size(100.dp)
                .background(MaterialTheme.colorScheme.primary)
                .align(Alignment.BottomStart)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun MyBoxPreview() {
    MyBox(modifier = Modifier.padding(5.dp))
}