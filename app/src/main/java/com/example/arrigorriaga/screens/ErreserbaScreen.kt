package com.example.arrigorriaga.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.foundation.Image
import com.example.arrigorriaga.R

@Composable
fun ErreserbaScreen() {

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
                    modifier = Modifier.size(50.dp)
                )
            }

            Spacer(Modifier.height(30.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1.8f),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_bungalow1),
                    contentDescription = "Bungalow",
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .background(Color.White, RoundedCornerShape(16.dp)),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(Modifier.height(30.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, RoundedCornerShape(16.dp))
                    .padding(18.dp)
            ) {
                Column {
                    Text(
                        text = "Bungalow eroso eta osorik hornitua. Ingurune natural paregabean atseden hartzeko aukera bikaina.",
                        color = Color.Black
                    )
                    Spacer(Modifier.height(12.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text("Bungalow Familiar", fontWeight = FontWeight.Bold, color = Color.Black)
                        Text("75€/gau", fontWeight = FontWeight.Bold, color = Color.Black)
                    }
                }
            }

            Spacer(Modifier.height(30.dp))

            var entryOpen by remember { mutableStateOf(false) }
            var exitOpen by remember { mutableStateOf(false) }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Column(modifier = Modifier.weight(1f)) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, RoundedCornerShape(12.dp))
                            .clickable { entryOpen = !entryOpen }
                            .padding(16.dp)
                    ) {
                        Text("Sarrera: Aukeratu data eta ordua", color = Color.Black)
                    }

                    if (entryOpen) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFEAEAEA), RoundedCornerShape(12.dp))
                                .padding(16.dp)
                        ) {
                            Text("➡ Data: 2025/02/10", color = Color.Black)
                            Text("➡ Ordua: 14:00", color = Color.Black)
                        }
                    }
                }

                Spacer(Modifier.width(14.dp))

                Column(modifier = Modifier.weight(1f)) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, RoundedCornerShape(12.dp))
                            .clickable { exitOpen = !exitOpen }
                            .padding(16.dp)
                    ) {
                        Text("Irteera: Aukeratu data eta ordua", color = Color.Black)
                    }

                    if (exitOpen) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFEAEAEA), RoundedCornerShape(12.dp))
                                .padding(16.dp)
                        ) {
                            Text("➡ Data: 2025/02/12", color = Color.Black)
                            Text("➡ Ordua: 12:00", color = Color.Black)
                        }
                    }
                }
            }

            Spacer(Modifier.height(30.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, RoundedCornerShape(12.dp))
                    .clickable { }
                    .padding(vertical = 14.dp),
                contentAlignment = Alignment.Center
            ) {
                Text("Erreserbatu", color = Color.Black, fontWeight = FontWeight.Bold)
            }

            Spacer(Modifier.height(100.dp)) // Extra espacio para que no tape el menú
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
