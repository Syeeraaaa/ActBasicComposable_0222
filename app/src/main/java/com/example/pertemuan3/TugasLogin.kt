package com.example.pertemuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.Font

@Composable
fun TugasLogin(modifier: Modifier){
    val logo = painterResource(id = R.drawable.logo)
    val kartunCewe = painterResource(id = R.drawable.kartuncewe)

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {

    }
    Text(
        text = "Login",
        fontSize = 40.sp,
        color = Color.DarkGray,
        fontWeight = FontWeight.Bold
    )
    Text(
        text = "Ini adalah halaman login,",
        fontSize = 16.sp,
        color = Color.Black
    )
    Spacer(modifier = Modifier.height(20.dp))
    Image(
        painter = logo,
        contentDescription = "Logo UMY",
        modifier = Modifier.size(200.dp)
    )
    Spacer(modifier = Modifier.height(20.dp))

    Text(
        text = "Nama",
        fontSize = 20.sp,
        color = Color.Red,
        fontWeight = FontWeight.Bold
    )
    Text(
        text = "Syeera Silvia Erby",
        fontSize = 20.sp,
        color = Color.Yellow,
        fontWeight = FontWeight.Bold
    )

    Spacer(modifier = Modifier.height(8.dp))

    Text(
        text = "202401402222",
        fontSize = 24.sp,
        color = Color.Green,
        fontWeight = FontWeight.Bold
    )

    Spacer(modifier = Modifier.height(30.dp))

    Box(
        modifier = Modifier
            .size(200.dp)
            .clip(CircleShape)
            .background(Color.LightGray),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = kartunCewe,
            contentDescription = "kartunCewe",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}