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
import androidx.compose.foundation.Image
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.statusBarsPadding

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

@Composable
fun ArtworkDisplay(artwork: Artwork, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = artwork.imageResId),
            contentDescription = artwork.title,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .fillMaxWidth()
                .height(300.dp)
        )
        Text(
            text = artwork.title,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = "${artwork.artist} (${artwork.year})",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
fun ArtSpaceLayout(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .statusBarsPadding()
            .safeDrawingPadding()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ArtworkDisplay(artwork = artworkList[0])

        Spacer(modifier = Modifier.height(32.dp))
    }
}
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ArtSpaceLayout(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ArtSpaceLayoutPreview() {
    ArtSpaceTheme {
        ArtSpaceLayout()
    }
}