package com.example.arrigorriaga.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import com.example.arrigorriaga.R
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight

@Composable
fun HomeScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = androidx.compose.ui.graphics.Brush.verticalGradient(
                    colors = listOf(Color(0xFFF8F8FF), Color(0xFF67A97B))
                )
            )
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
                .verticalScroll(rememberScrollState())
        ) {

            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.ic_camping_logo_notext),
                    contentDescription = "Logo",
                    modifier = Modifier.size(60.dp),
                    contentScale = ContentScale.Fit
                )

                Spacer(Modifier.width(12.dp))

                Column {
                    Text(
                        text = "Kaixo,",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "User",
                        color = Color.Gray
                    )
                }
            }

            Spacer(Modifier.height(50.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFD9D9D9), shape = RoundedCornerShape(16.dp))
                    .padding(16.dp)
            ) {

                Column {

                    Text(
                        text = "Azken Erreserbak",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )

                    Spacer(Modifier.height(16.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, shape = RoundedCornerShape(12.dp))
                            .padding(14.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column {
                                Text("Bungalowa • 2 gau", color = Color.Black)
                                Text("2025/02/10", color = Color.Gray)
                            }
                            Text("120€", color = Color.Black, fontWeight = FontWeight.Bold)
                        }
                    }

                    Spacer(Modifier.height(12.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, shape = RoundedCornerShape(12.dp))
                            .padding(14.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column {
                                Text("Denda eremua • 1 gau", color = Color.Black)
                                Text("2025/02/07", color = Color.Gray)
                            }
                            Text("25€", color = Color.Black, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }

            Spacer(Modifier.height(30.dp))

            var search by remember { mutableStateOf("") }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, shape = RoundedCornerShape(50.dp))
                    .padding(vertical = 12.dp, horizontal = 20.dp)
            ) {
                BasicTextField(
                    value = search,
                    onValueChange = { search = it },
                    textStyle = TextStyle(color = Color.Black),
                    decorationBox = { inner ->
                        if (search.isEmpty()) {
                            Text("Bilatu...", color = Color.Gray)
                        }
                        inner()
                    }
                )
            }

            Spacer(Modifier.height(30.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFD9D9D9), shape = RoundedCornerShape(16.dp))
                    .padding(16.dp)
            ) {

                Column {

                    Text(
                        text = "Harrera gunea: Informazioa, erreserbak eta laguntza.",
                        color = Color.Black
                    )
                    Spacer(Modifier.height(8.dp))

                    Text(
                        text = "Ostalari zerbitzuak: Bungalowak, karabanak eta denda-eremuak.",
                        color = Color.Black
                    )
                    Spacer(Modifier.height(8.dp))

                    Text(
                        text = "Komunak eta dutxak: Ur beroa eta garbitasun zerbitzuak.",
                        color = Color.Black
                    )
                    Spacer(Modifier.height(8.dp))

                    Text(
                        text = "Garbigailuak eta lehorgailuak: Arropa garbitzeko gunea.",
                        color = Color.Black
                    )
                }
            }

            Spacer(Modifier.height(150.dp)) // espacio para que el menú inferior no tape contenido
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(bottom = 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_calendar),
                contentDescription = "Erreserbak",
                modifier = Modifier.size(40.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.ic_home),
                contentDescription = "Home",
                modifier = Modifier.size(40.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.ic_user),
                contentDescription = "User",
                modifier = Modifier.size(40.dp)
            )
        }
    }
}
