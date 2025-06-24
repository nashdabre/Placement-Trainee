
package com.example.placementtrainee.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.*
import androidx.compose.material.Button

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.placementtrainee.R
import com.example.placementtrainee.data.WeeklyPlan
import com.example.placementtrainee.navigation.Routes
import com.example.placementtrainee.utils.CareerPlanService
import kotlinx.coroutines.launch

@Composable
fun CareerPlanScreen(navController: NavController) {
    var goal by remember { mutableStateOf("") }
    var months by remember { mutableStateOf("") }
    var roadmap by remember { mutableStateOf(emptyList<WeeklyPlan>()) }

    var expandedItems = remember { mutableStateMapOf<Int, Boolean>() }
    var isLoading by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()

    Column(
        modifier = Modifier
            .fillMaxSize()

            .background(color = Color(android.graphics.Color.parseColor("#eeeeee")))
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .height(45.dp)
                .width(60.dp)
               // .padding(end = 10.dp)
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

        Text(
            text = "Career Planner",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp, start =80.dp)
        )

        OutlinedTextField(
            value = goal,
            onValueChange = { goal = it },
            label = { Text("Your Career Goal (e.g. Java Developer)") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = months,
            onValueChange = { months = it },
            label = { Text("Duration in months (e.g. 2)") },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = {
                isLoading = true
                roadmap = emptyList()
                expandedItems.clear()

                scope.launch {
                    val result = CareerPlanService.generateCareerPlan(goal, months)
                    roadmap = result
                    isLoading = false
                }
            },
            modifier = Modifier.align(Alignment.End),
            colors =  ButtonDefaults.outlinedButtonColors(
                backgroundColor = Color(android.graphics.Color.parseColor("#1b5e20")))//
            , shape = RoundedCornerShape(20.dp)
        ) {

            Spacer(modifier = Modifier.width(6.dp))
            Text("Generate Plan",modifier = Modifier.padding(vertical = 6.dp),color = Color.White)
        }

        Spacer(modifier = Modifier.height(20.dp))

        if (isLoading) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.CenterHorizontally))
        }

        roadmap.forEachIndexed { index, item ->
            val isExpanded = expandedItems[index] ?: false

            Card(
                shape = RoundedCornerShape(16.dp),
                elevation = 8.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .clickable {
                        expandedItems[index] = !isExpanded
                    }
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = item.weekTitle,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color(0xFF1A237E)
                    )

                    AnimatedVisibility(
                        visible = isExpanded,
                        enter = fadeIn(tween(300)),
                        exit = fadeOut(tween(300))
                    ) {
                        val taskLines = item.content.split(". ").filter { it.isNotBlank() }

                        Column {
                            taskLines.forEach { line ->
                                Row(
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier.padding(bottom = 4.dp)
                                ) {
                                    Text("• ", fontSize = 15.sp)
                                    Text(
                                        text = line.trim().removeSuffix("."),
                                        fontSize = 15.sp,
                                        color = Color.DarkGray
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}

