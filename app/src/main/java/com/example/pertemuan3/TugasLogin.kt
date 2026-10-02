package com.example.pertemuan3

import androidx.compose.foundation.Image
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
import androidx.compose.ui.text.font.Font

@Composable
fun TugasLogin(modifier: Modifier){
    val logo = painterResource(id = R.drawable. logo)
    val background = painterResource(id = R.drawable.background)

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
        text = "Ini adalah halam login,",
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
}