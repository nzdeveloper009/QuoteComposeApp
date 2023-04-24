package com.nzdeveloper009.quotecomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nzdeveloper009.quotecomposeapp.screens.QuoteDetail
import com.nzdeveloper009.quotecomposeapp.screens.QuoteListScreen
import com.nzdeveloper009.quotecomposeapp.ui.theme.QuoteComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DataManager.loadAssetsFromFile(this)

        setContent {
//            QuoteDetail()
            App()
        }
    }
}

@Composable
fun App() {
    if(DataManager.isDataLoaded.value) {
        QuoteListScreen(data = DataManager.data) {
            
        }
    }
}
