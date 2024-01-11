package com.example.andersen_road_to_lab_hw1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.andersen_road_to_lab_hw1.ui.theme.Andersen_Road_To_Lab_HW1Theme
import android.widget.ImageView
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.viewinterop.AndroidView
import com.squareup.picasso.Picasso

@Composable
fun PicassoImage(url: String) {
    AndroidView(
        modifier = Modifier.fillMaxWidth(),
        factory = { context ->
            ImageView(context).apply {
                // Configure your ImageView here if needed
            }
        },
        update = { imageView ->
            Picasso.get().load(url).into(imageView)
        }
    )
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Andersen_Road_To_Lab_HW1Theme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val imageUrl = "https://xsport.ua/upload/resize_cache/iblock/19d/916_537_2/19d7b456ece19606db94643e34357117.jpg"
                    PicassoImage(url = imageUrl)
                }
            }
        }
    }
}


