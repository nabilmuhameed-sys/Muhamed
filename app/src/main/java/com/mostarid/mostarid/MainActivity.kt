package com.mostarid.mostarid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.LayoutDirection
import com.mostarid.coreui.MostaridTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Force RTL for Arabic
            MostaridTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // Ensure layout direction is RTL for Arabic locale in Compose
                        CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
                            HomeScreen()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "مستعرض الخرائط", style = MaterialTheme.typography.headlineMedium)
        Text(text = "تطبيق عربي RTL - Scaffold أولي", modifier = Modifier.padding(top = 8.dp, bottom = 16.dp))
        Button(onClick = {}) {
            Text(text = "افتح الخريطة")
        }
        Button(onClick = {}) {
            Text(text = "الإعدادات")
        }
        AboutCard()
    }
}

@Composable
fun AboutCard() {
    Column(modifier = Modifier.padding(top = 20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "تصميم وبرمجة م. محمد المطاع", style = MaterialTheme.typography.bodyLarge)
    }
}
