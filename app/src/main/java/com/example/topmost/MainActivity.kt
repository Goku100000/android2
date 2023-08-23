package com.example.topmost

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.topmost.ui.theme.TopmostTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            demo()

        }
    }
}

@Composable
fun demo(){
   Column (modifier = Modifier
       .fillMaxSize()
       .padding(20.dp)){
       Text(text = "Hello Glory",
           color = Color.Green,
           fontSize = 30.sp,
           fontStyle = FontStyle.Italic,
           textDecoration = TextDecoration.Underline)
       Spacer(modifier = Modifier.height(50.dp))

       Text(text = "Welcome to Android",
           color = Color.Yellow,
           fontFamily = FontFamily.Cursive,
           fontSize = 40.sp)
       Text(text = "Kotlin")
       Spacer(modifier = Modifier.height(50.dp))
       Text(text = "Jetpack Compose",
           color = Color.LightGray,
           fontSize = 40.sp,
           fontFamily = FontFamily.Serif)

       Divider()
       Spacer(modifier = Modifier.height(30.dp))

       Row {
           Text(text = "Text2",fontSize = 30.sp)
           Spacer(modifier = Modifier.width(40.dp))
           Text(text = "tEXT1",fontSize = 30.sp)
       }
       Row {
           Text(text = "eMobilis", fontSize = 30.sp)
           Spacer(modifier = Modifier.width(40.dp))
           Text(text = "Technology",
               fontSize = 30.sp)
       }
       Button(onClick = { /*TODO*/ },
           shape = RectangleShape,
           colors = ButtonDefaults.buttonColors(Color.Green)) {
           Text(text = "Click me")

       }
       Button(onClick = { /*TODO*/ },
           shape = CutCornerShape(5.dp),
           colors = ButtonDefaults.buttonColors(Color.Yellow)) {
           Image(painter = painterResource(id = R.drawable.img_2), contentDescription = "")
           Text(text = "Add To Cart",
               modifier = Modifier.padding(start = 10.dp))
           
       }
       //Bordered button
       Button(onClick = { /*TODO*/ },
           shape = CutCornerShape(5.dp),
           border = BorderStroke(3.dp, Color.DarkGray),
           colors = ButtonDefaults.outlinedButtonColors()
       ) {
           Text(text = "Bordered button")
           
       }


   }
    
        

}


@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    demo()
}
