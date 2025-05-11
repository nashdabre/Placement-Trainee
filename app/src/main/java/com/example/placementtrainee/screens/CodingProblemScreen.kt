package com.example.placementtrainee.screens


import com.example.placementtrainee.utils.GeminiService
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material.Button
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


@Composable
fun CodeGeneratorScreen(navController: NavHostController) {
    var question by remember { mutableStateOf("Press to generate a coding question.") }
    var isLoading by remember { mutableStateOf(false) }

    Column(
        Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color(android.graphics.Color.parseColor("#eeeeee")))
            .padding(top = 10.dp, start = 16.dp, end = 16.dp),
        //  horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .height(45.dp)
                .width(60.dp)
                .background(
                    color = Color(android.graphics.Color.parseColor("#ffffff")),
                    shape = RoundedCornerShape(20.dp)
                )

        ) {
            Image(
                painter = painterResource(id = R.drawable.back),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable {
                        navController.navigate(Routes.BottomNav.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }

                    }
            )


        }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(top = 13.dp, bottom = 10.dp)
            .background(
                color = Color(android.graphics.Color.parseColor("#fdfdfd")),
                shape = RoundedCornerShape(20.dp)
            )
            .padding(14.dp)) {
            item {
                Text(text = question, modifier = Modifier.weight(1f))
            }

            item {
                Button(modifier = Modifier.padding(top = 10.dp),
                    onClick = {
                        isLoading = true
                        CoroutineScope(Dispatchers.IO).launch {
                            val result = GeminiService.generateCodingQuestion()
                            question = result
                            isLoading = false
                        }
                    },
                    colors =  ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color(android.graphics.Color.parseColor("#1b5e20")))//
                    , shape = RoundedCornerShape(20.dp),
                    enabled = !isLoading
                ) {
                    Text(if (isLoading) "Generating..." else "Generate Coding Question",modifier = Modifier.padding(vertical = 6.dp),color = Color.White)
                }
            }
        }

    }
    }
}
