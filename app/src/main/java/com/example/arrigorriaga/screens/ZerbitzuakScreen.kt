package com.example.arrigorriaga.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import com.example.arrigorriaga.R

@Composable
fun ZerbitzuakScreen() {

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
                    modifier = Modifier.size(60.dp)
                )
            }

            Spacer(Modifier.height(180.dp))

            var zerbitzuakOpen by remember { mutableStateOf(false) }
            var dayOpen by remember { mutableStateOf(false) }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, RoundedCornerShape(12.dp))
                            .clickable { zerbitzuakOpen = !zerbitzuakOpen }
                            .padding(16.dp)
                    ) {
                        Text("Zerbitzuak", fontWeight = FontWeight.Bold, color = Color.Black)
                    }

                    if (zerbitzuakOpen) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFEAEAEA), RoundedCornerShape(12.dp))
                                .padding(16.dp)
                        ) {
                            Text("➡ Zerbitzu 1", color = Color.Black)
                            Text("➡ Zerbitzu 2", color = Color.Black)
                        }
                    }
                }

                Column(modifier = Modifier.weight(1f)) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, RoundedCornerShape(12.dp))
                            .clickable { dayOpen = !dayOpen }
                            .padding(16.dp)
                    ) {
                        Text("Eguna", fontWeight = FontWeight.Bold, color = Color.Black)
                    }

                    if (dayOpen) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFEAEAEA), RoundedCornerShape(12.dp))
                                .padding(16.dp)
                        ) {
                            Text("➡ 2025/02/10", color = Color.Black)
                            Text("➡ 2025/02/11", color = Color.Black)
                        }
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, RoundedCornerShape(12.dp))
                    .clickable { /* Acción reservar */ }
                    .padding(vertical = 14.dp),
                contentAlignment = Alignment.Center
            ) {
                Text("ERRESERBA", fontWeight = FontWeight.Bold, color = Color.Black)
            }

            Spacer(Modifier.height(120.dp))

            var jarduerakOpen by remember { mutableStateOf(false) }
            var day2Open by remember { mutableStateOf(false) }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, RoundedCornerShape(12.dp))
                            .clickable { jarduerakOpen = !jarduerakOpen }
                            .padding(16.dp)
                    ) {
                        Text("Jarduerak", fontWeight = FontWeight.Bold, color = Color.Black)
                    }

                    if (jarduerakOpen) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFEAEAEA), RoundedCornerShape(12.dp))
                                .padding(16.dp)
                        ) {
                            Text("➡ Jarduera 1", color = Color.Black)
                            Text("➡ Jarduera 2", color = Color.Black)
                        }
                    }
                }

                Column(modifier = Modifier.weight(1f)) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, RoundedCornerShape(12.dp))
                            .clickable { day2Open = !day2Open }
                            .padding(16.dp)
                    ) {
                        Text("Eguna", fontWeight = FontWeight.Bold, color = Color.Black)
                    }

                    if (day2Open) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color(0xFFEAEAEA), RoundedCornerShape(12.dp))
                                .padding(16.dp)
                        ) {
                            Text("➡ 2025/02/10", color = Color.Black)
                            Text("➡ 2025/02/11", color = Color.Black)
                        }
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, RoundedCornerShape(12.dp))
                    .clickable { /* Acción reservar */ }
                    .padding(vertical = 14.dp),
                contentAlignment = Alignment.Center
            ) {
                Text("ERRESERBA", fontWeight = FontWeight.Bold, color = Color.Black)
            }

            Spacer(Modifier.height(100.dp)) // espacio para menú
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
