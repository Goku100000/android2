package com.example.topmost

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.topmost.ui.theme.TopmostTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


        }
    }
}

@Composable
fun myimage(){
    Column(modifier = Modifier.fillMaxSize().padding(10.dp)) {
        Text(
            text = "BREEDS OF DOGS",
            fontSize = 30.sp,
            color = Color.Black,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(start = 50.dp),
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row {
            androidx.compose.foundation.Image(
                painter = painterResource(id = R.drawable.img_1),
                contentDescription = "Bulldog",
                modifier = Modifier.size(width = 200.dp, height = 200.dp)
            )

            Column {
                Text(
                    text = "BULLDOG",
                    fontSize = 20.sp
                )
                Text(text = "The Bulldog is a British breed of dog of mastiff type. It may also be known as the English Bulldog or British Bulldog.")

            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Row {
            androidx.compose.foundation.Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "Bulldog",
                modifier = Modifier.size(width = 200.dp, height = 200.dp)
            )

            Column {
                Text(
                    text = "GERMAN SHEPHERD",
                    fontSize = 20.sp
                )
                Text(text = "Generally considered dogkind's finest all-purpose worker, the German Shepherd Dog is a large, agile, muscular dog of noble character and high intelligence.")
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Row {
            androidx.compose.foundation.Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "Bulldog",
                modifier = Modifier.size(width = 200.dp, height = 200.dp)
            )

            Column {
                Text(
                    text = "BULLDOG",
                    fontSize = 20.sp
                )
                Text(text = "The Bulldog is a British breed of dog of mastiff type. It may also be known as the English Bulldog or British Bulldog.")
            }
        }
        androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.img),
            contentDescription = "image",
            modifier = Modifier.size(width = 128.dp, height = 128.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
            )

    }

    

}

@Preview(showBackground = true)
@Composable
fun myimagePreview(){
    myimage()
}