package com.example.placementtrainee.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes

@Composable
fun Aptitude(navController: NavHostController){

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
                        navController.navigate(Routes.Quiz.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }

                    }
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 2.dp)
        ) {
            Column(
                Modifier

                    .height(120.dp)
                    .width(108.dp)
                    .padding(end = 12.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#ffffff")),
                            shape = RoundedCornerShape(20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.quantitative),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                navController.navigate(Routes.Logical_Quiz.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }

                            }
                    )
                }

                Text(
                    text = "Quantitative", style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,

                        ), modifier = Modifier.padding(vertical = 6.dp),color = Color.Black
                )

            }
//---------------------------------------------------------------------------------------------------
            Column(
                Modifier

                    .height(120.dp)
                    .width(108.dp)
                    .padding(end = 12.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#ffffff")),
                            shape = RoundedCornerShape(20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logical),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                navController.navigate(Routes.Qaunti_Quiz.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }

                            }
                    )
                }

                Text(
                    text = "Logical", style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,

                        ), modifier = Modifier.padding(vertical = 6.dp),color = Color.Black
                )

            }

            //---------------------------------------------------------
            Column(
                Modifier

                    .height(120.dp)
                    .width(108.dp)
                    .padding(end = 12.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#ffffff")),
                            shape = RoundedCornerShape(20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.verbal_ability),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                navController.navigate(Routes.Youtube0.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }

                            }
                    )
                }

                Text(
                    text = "Verbal Ability", style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,

                        ), modifier = Modifier.padding(vertical = 6.dp),color = Color.Black
                )

            }
        }
        //--------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 2.dp)
        ) {
            Column(
                Modifier

                    .height(120.dp)
                    .width(108.dp)
                    .padding(end = 12.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#ffffff")),
                            shape = RoundedCornerShape(20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.data_interpretation),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                navController.navigate(Routes.Youtube0.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }

                            }
                    )
                }

                Text(
                    text = "Data Analysis", style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,

                        ), modifier = Modifier.padding(vertical = 6.dp),color = Color.Black
                )

            }
//---------------------------------------------------------------------------------------------------
            Column(
                Modifier

                    .height(120.dp)
                    .width(108.dp)
                    .padding(end = 12.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#ffffff")),
                            shape = RoundedCornerShape(20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.analytic),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                navController.navigate(Routes.Youtube0.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }

                            }
                    )
                }

                Text(
                    text = "Analysis", style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,

                        ), modifier = Modifier.padding(vertical = 6.dp),color = Color.Black
                )

            }

            //---------------------------------------------------------
            Column(
                Modifier

                    .height(120.dp)
                    .width(108.dp)
                    .padding(end = 12.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#ffffff")),
                            shape = RoundedCornerShape(20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.awareness),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                navController.navigate(Routes.Youtube0.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }

                            }
                    )
                }

                Text(
                    text = "General", style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,

                        ), modifier = Modifier.padding(vertical = 6.dp),color = Color.Black
                )

            }
        }
        //-----------------------------------------------
       /* Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 2.dp)
        ) {
            Column(
                Modifier

                    .height(120.dp)
                    .width(108.dp)
                    .padding(end = 12.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#ffffff")),
                            shape = RoundedCornerShape(20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.snake1),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                navController.navigate(Routes.Youtube0.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }

                            }
                    )
                }

                Text(
                    text = "Quantitative", style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,

                        ), modifier = Modifier.padding(vertical = 6.dp),color = Color.Black
                )

            }
//---------------------------------------------------------------------------------------------------
            Column(
                Modifier

                    .height(120.dp)
                    .width(108.dp)
                    .padding(end = 12.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#ffffff")),
                            shape = RoundedCornerShape(20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.snake1),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                navController.navigate(Routes.Youtube0.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }

                            }
                    )
                }

                Text(
                    text = "Quantitative", style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,

                        ), modifier = Modifier.padding(vertical = 6.dp),color = Color.Black
                )

            }

            //---------------------------------------------------------
            Column(
                Modifier

                    .height(120.dp)
                    .width(108.dp)
                    .padding(end = 12.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .height(60.dp)
                        .width(60.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#ffffff")),
                            shape = RoundedCornerShape(20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.snake1),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                navController.navigate(Routes.Youtube0.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }

                            }
                    )
                }

                Text(
                    text = "Quantitative", style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,

                        ), modifier = Modifier.padding(vertical = 6.dp),color = Color.Black
                )

            }
        }*/
    }
}
