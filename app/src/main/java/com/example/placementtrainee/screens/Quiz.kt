package com.example.placementtrainee.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes

@Composable
fun Quiz(navController: NavHostController){

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
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(top = 16.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(15.dp)
                    )
            ) {
                Card (modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(15.dp)
                    )
                    .fillMaxWidth()
                    .shadow(
                        elevation = 20.dp,
                        ambientColor = Black,
                        spotColor = Black,
                        shape = RoundedCornerShape(15.dp)
                    )
                    .clickable {
                        navController.navigate(Routes.Aptitude.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }
                    },
                    shape = RoundedCornerShape(15.dp),
                    colors = CardDefaults.cardColors(containerColor = White),
                    elevation = CardDefaults.cardElevation(defaultElevation = 20.dp)
                    ){

                    Row {
                        LazyColumn(
                            modifier = Modifier
                                .padding(start = 4.dp)
                                .width(200.dp)

                                .background(
                                    color = Color(android.graphics.Color.parseColor("#ffffff")),
                                    shape = RoundedCornerShape(0.dp)
                                )

                        ) {

                            item {
                                Text(
                                    text = "Aptitude",
                                    fontSize = 19.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(start = 9.dp, top = 10.dp)
                                )
                            }

                            item {
                                Text(
                                    text = "Quantitative",
                                    fontSize = 17.sp,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(start = 15.dp)
                                )
                            }

                            item {
                                Text(
                                    text = "Logical Reasoning",
                                    fontSize = 17.sp,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(start = 15.dp)
                                )
                            }

                            item {
                                Text(
                                    text = "Verbal Ability",
                                    fontSize = 17.sp,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(start = 15.dp)
                                )
                            }

                            item {
                                Text(
                                    text = "Data Interpretation",
                                    fontSize = 17.sp,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(start = 15.dp)
                                )
                            }

                            item {
                                Text(
                                    text = "Analysis",
                                    fontSize = 17.sp,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(start = 15.dp)
                                )
                            }

                            item {
                                Text(
                                    text = "General Awareness",
                                    fontSize = 17.sp,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(start = 15.dp)
                                )
                            }

                            item {

                            }

                            item {

                            }
                        }

                        Column(modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color.White),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.End) {
                            Box(
                                modifier = Modifier
                                    .height(80.dp)
                                    .width(80.dp)
                                    .padding(end = 10.dp)
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#ffffff")),
                                        shape = CircleShape
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.creative),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(2.dp)
                                        .clickable {
                                            /*navController.navigate(Routes.Heartdoc.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )
                            }
                        }

                    }
                    }




            }
//---------------------------------------------------------------------------------------------------
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(top = 16.dp)
                .background(
                    color = androidx.compose.ui.graphics.Color.White,
                    shape = RoundedCornerShape(15.dp)
                )
        ) {
            Card (modifier = Modifier
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(15.dp)
                )
                .fillMaxWidth()
                .shadow(
                    elevation = 20.dp,
                    ambientColor = Black,
                    spotColor = Black,
                    shape = RoundedCornerShape(15.dp)
                )
                .clickable {
                    navController.navigate(Routes.Programming.routes) {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }
                },
                shape = RoundedCornerShape(15.dp),
                colors = CardDefaults.cardColors(containerColor = White),
                elevation = CardDefaults.cardElevation(defaultElevation = 20.dp)
            ){

                Row {
                    LazyColumn(
                        modifier = Modifier
                            .padding(start = 4.dp)
                            .width(200.dp)

                            .background(
                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                shape = RoundedCornerShape(0.dp)
                            )

                    ) {

                        item {
                            Text(
                                text = "Programming",
                                fontSize = 19.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(start = 9.dp, top = 10.dp)
                            )
                        }

                        item {
                            Text(
                                text = "C",
                                fontSize = 17.sp,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        }

                        item {
                            Text(
                                text = "C++",
                                fontSize = 17.sp,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        }

                        item {
                            Text(
                                text = "Java",
                                fontSize = 17.sp,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        }

                        item {
                            Text(
                                text = "SQL",
                                fontSize = 17.sp,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        }

                        item {
                            Text(
                                text = "OOPS",
                                fontSize = 17.sp,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        }

                        item {
                            Text(
                                text = "Algorithms",
                                fontSize = 17.sp,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        }

                        item {
                            Text(
                                text = "DataStructures",
                                fontSize = 17.sp,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        }

                        item {

                        }
                    }

                    Column(modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.White),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.End) {
                        Box(
                            modifier = Modifier
                                .height(80.dp)
                                .width(80.dp)
                                .padding(end = 10.dp)
                                .background(
                                    color = Color(android.graphics.Color.parseColor("#ffffff")),
                                    shape = CircleShape
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.programming),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(2.dp)
                                    .clickable {
                                        /*navController.navigate(Routes.Heartdoc.routes) {
                                            popUpTo(navController.graph.startDestinationId)
                                            launchSingleTop = true
                                        }*/

                                    }
                            )
                        }
                    }

                }
            }




        }
 //--------------------------------------------------------------------------------------
 //-------------------------------------------------------------------------------
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(top = 16.dp)
                .background(
                    color = androidx.compose.ui.graphics.Color.White,
                    shape = RoundedCornerShape(15.dp)
                )
        ) {
            Card (modifier = Modifier
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(15.dp)
                )
                .fillMaxWidth()
                .shadow(
                    elevation = 20.dp,
                    ambientColor = Black,
                    spotColor = Black,
                    shape = RoundedCornerShape(15.dp)
                )
                .clickable {
                navController.navigate(Routes.Fundamental.routes) {
                    popUpTo(navController.graph.startDestinationId)
                    launchSingleTop = true
                }
            },
                shape = RoundedCornerShape(15.dp),
                colors = CardDefaults.cardColors(containerColor = White),
                elevation = CardDefaults.cardElevation(defaultElevation = 20.dp)
            ){

                Row {
                    LazyColumn(
                        modifier = Modifier
                            .padding(start = 4.dp)
                            .width(230.dp)

                            .background(
                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                shape = RoundedCornerShape(0.dp)
                            )

                    ) {

                        item {
                            Text(
                                text = "Fundamentals",
                                fontSize = 19.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(start = 9.dp, top = 10.dp)
                            )
                        }

                        item {
                            Text(
                                text = "Database Management",
                                fontSize = 17.sp,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        }

                        item {
                            Text(
                                text = "Operating System",
                                fontSize = 17.sp,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        }

                        item {
                            Text(
                                text = "Computer Network",
                                fontSize = 17.sp,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        }

                        item {
                            Text(
                                text = "Microprocessor",
                                fontSize = 17.sp,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        }

                        item {
                            Text(
                                text = "Analysis",
                                fontSize = 17.sp,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        }

                        item {
                            Text(
                                text = "General Awareness",
                                fontSize = 17.sp,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        }

                        item {

                        }

                        item {

                        }
                    }

                    Column(modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.White),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.End) {
                        Box(
                            modifier = Modifier
                                .height(80.dp)
                                .width(80.dp)
                                .padding(end = 10.dp)
                                .background(
                                    color = Color(android.graphics.Color.parseColor("#ffffff")),
                                    shape = CircleShape
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.fundamentals),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(2.dp)
                                    .clickable {
                                        /*navController.navigate(Routes.Heartdoc.routes) {
                                            popUpTo(navController.graph.startDestinationId)
                                            launchSingleTop = true
                                        }*/

                                    }
                            )
                        }
                    }

                }
            }




        }

        }
    }
