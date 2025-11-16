package com.example.arrigorriaga.screens

import com.example.arrigorriaga.R
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.Image
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = androidx.compose.ui.graphics.Brush.verticalGradient(
                    colors = listOf(Color(0xFFF8F8FF), Color(0xFF67A97B))
                )
            )
            .padding(24.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_camping_logo),
                contentDescription = "Logo Camping",
                modifier = Modifier.size(180.dp),
                contentScale = ContentScale.Fit
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var email by remember { mutableStateOf("") }
            var password by remember { mutableStateOf("") }

            Text(
                text = "Email",
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 4.dp)
            )
            BasicTextField(
                value = email,
                onValueChange = { email = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, shape = RoundedCornerShape(12.dp))
                    .padding(16.dp),
                textStyle = TextStyle(color = Color.Black)
            )

            Spacer(Modifier.height(16.dp))

            Text(
                text = "Pasahitza",
                color = Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 4.dp)
            )
            BasicTextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, shape = RoundedCornerShape(12.dp))
                    .padding(16.dp),
                textStyle = TextStyle(color = Color.Black)
            )

            Spacer(Modifier.height(8.dp))

            Text(
                text = "Pasahitza ahaztuta?",
                color = Color.Blue,
                modifier = Modifier.align(Alignment.End)
            )

            Spacer(Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .background(Color.White, shape = RoundedCornerShape(12.dp))
                        .clickable { /* acción login */ }
                        .padding(vertical = 14.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text("SAIOA HASI", color = Color.Black)
                }

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .background(Color.White, shape = RoundedCornerShape(12.dp))
                        .clickable { /* acción registro */ }
                        .padding(vertical = 14.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text("ERREGISTRATU", color = Color.Black)
                }
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_facebook),
                contentDescription = "Facebook",
                modifier = Modifier.size(40.dp)
            )
            Spacer(Modifier.width(20.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_instagram),
                contentDescription = "Instagram",
                modifier = Modifier.size(40.dp)
            )
            Spacer(Modifier.width(20.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_twitter),
                contentDescription = "Twitter",
                modifier = Modifier.size(40.dp)
            )
        }
    }
}
