package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.artspace.ui.theme.ArtSpaceTheme

data class Artwork(
    val imageResId: Int,
    val title: String,
    val artist: String,
    val year: String
)

val artworkList = listOf(
    Artwork(R.drawable.art1, "Chromatic Cascade", "Elena Marsh", "2023"),
    Artwork(R.drawable.art2, "Painted Gaze", "Marco Silva", "2022"),
    Artwork(R.drawable.art3, "Silent Pride", "Aria Nkosi", "2021"),
    Artwork(R.drawable.art4, "The Word Made Flesh", "Jonas Beck", "2020"),
    Artwork(R.drawable.art5, "Window to Wonder", "Lila Chandra", "2023"),
    Artwork(R.drawable.art6, "Colors Within", "Zara Okonkwo", "2024"),
    Artwork(R.drawable.art7, "Sunset Celebration", "Kofi Mensah", "2019")
)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArtSpaceTheme {
        Greeting("Android")
    }
}