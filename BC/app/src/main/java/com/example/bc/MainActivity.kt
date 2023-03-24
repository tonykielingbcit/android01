package com.example.bc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bc.ui.theme.BCTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Container()
                }
            }
        }
    }
}

@Composable
fun Container() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.DarkGray),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Box1()
        Box2()
    }
}

@Composable
fun Box1() {
    val image = painterResource(R.drawable.tk)
    Box {
        Column(
//            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box (modifier = Modifier.padding(top = 50.dp, start = 60.dp, end = 60.dp, bottom = 30.dp)) {
                Image(
                    modifier = Modifier
                        .clip(CircleShape),
                    painter = image,
                    contentDescription = null,
                    contentScale = ContentScale.Fit
                )
            }
            Text(text = "Tony Kieling",
                fontSize = 48.sp,
                color = Color.Blue,
                fontWeight = FontWeight.Bold)
            Text(text = "Web Developer",
                color = Color.Gray,
                fontWeight = FontWeight.SemiBold,
                fontSize = 30.sp
            )
        }
    }
}

@Composable
fun Box2() {
    Box( modifier = Modifier.padding(bottom = 30.dp)
//        .background(color = Color.Red)
        .fillMaxWidth()
    ) {
//        Column ( modifier = Modifier.padding(30.dp)) {
        Column {
            Divider(modifier = Modifier
                        .fillMaxWidth(),
                color = Color.Gray)
            Row (modifier = Modifier
                    .padding(start = 50.dp, top = 12.dp, bottom = 12.dp)) {
                 Icon (
                     imageVector = Icons.Rounded.Phone,
                     contentDescription = "phone icon",
                     modifier = Modifier
                        .padding(end = 20.dp),
                    tint = Color.Green
                )
                Text(
                    color = Color.LightGray,
                    text = "(778) 938-9351"
                )
            }

            Divider(modifier = Modifier
                        .fillMaxWidth(),
                    color = Color.Gray)
            Row (modifier = Modifier
                    .padding(start = 50.dp, top = 12.dp, bottom = 12.dp)) {
                Icon(
                    imageVector = Icons.Rounded.Email,
                    contentDescription = "Email icon",
                    modifier = Modifier
                        .padding(end = 20.dp),
                    tint = Color.Green
                )
                Text(
                    color = Color.LightGray,
                    text = "tony.kieling@gmail.com"
                )
            }

            Divider(modifier = Modifier
                        .fillMaxWidth(),
                color = Color.Gray)
            Row (modifier = Modifier
                .padding(start = 50.dp, top = 12.dp, bottom = 12.dp)) {
                Icon(
                    imageVector = Icons.Rounded.Build,
                    contentDescription = "website icon",
                    modifier = Modifier
                        .padding(end = 20.dp),
                    tint = Color.Green
                )
                Text(
                    color = Color.LightGray,
                    text = "https://tkwebdev.ca"
                )
            }

            Divider(modifier = Modifier
                .fillMaxWidth(),
                color = Color.Gray)
            Row (modifier = Modifier
                .padding(start = 50.dp, top = 12.dp, bottom = 12.dp)) {
                Icon(
                    imageVector = Icons.Rounded.Share,
                    contentDescription ="github contact",
                    modifier = Modifier
                        .padding(end = 20.dp),
                    tint = Color.Green
                )
                Text(
                    color = Color.LightGray,
                    text = "https://github.com/tonykieling"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BCTheme {
        Container()
    }
}