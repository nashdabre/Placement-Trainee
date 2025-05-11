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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes


@Composable
fun Interview(navController: NavHostController) {

    Column(
        Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color(android.graphics.Color.parseColor("#eeeeee")))
            .padding(top = 32.dp, start = 16.dp, end = 16.dp),
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
                .padding(top = 24.dp)
        ) {

            MyApp()
        }
//-----------------------------------------------------------------------------
//
        LazyColumn(modifier = Modifier.padding(top = 30.dp)) {
            item{
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 1.dp)
                ) {
                    Column(
                        Modifier
                            .weight(0.5f)
                            .height(100.dp)
                            .padding(end = 12.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                shape = RoundedCornerShape(10.dp)
                            )
                            .padding(top = 1.dp),
                        horizontalAlignment = Alignment.Start
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.wissen), contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier.fillMaxSize()
                                .clip(shape = RoundedCornerShape(10.dp))
                                .clickable {
                                    navController.navigate(Routes.Wissen.routes) {
                                        popUpTo(navController.graph.startDestinationId)
                                        launchSingleTop = true
                                    }
                                }
                        )


                    }


//---------------------------------------------------------------------------------------------------
                    Column(
                        Modifier
                            .weight(0.5f)
                            .height(100.dp)
                            .padding(end = 12.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                shape = RoundedCornerShape(10.dp)
                            )
                            .padding(top = 1.dp),
                        horizontalAlignment = Alignment.Start
                    ) {


                        Image(
                            painter = painterResource(id = R.drawable.dolatcapital),
                            contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier.fillMaxSize().clip(shape = RoundedCornerShape(10.dp))
                                .clickable {
                                    navController.navigate(Routes.DolatCapital.routes) {
                                        popUpTo(navController.graph.startDestinationId)
                                        launchSingleTop = true
                                    }
                                }
                        )
                    }
                }
            }
            item{
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp)
                ) {
                    Column(
                        Modifier
                            .weight(0.5f)
                            .height(100.dp)
                            .padding(end = 12.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                shape = RoundedCornerShape(10.dp)
                            )
                            .padding(top = 16.dp),
                        horizontalAlignment = Alignment.Start
                    ) {


                        Image(
                            painter = painterResource(id = R.drawable.quantiphi), contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier.fillMaxSize().clip(shape = RoundedCornerShape(10.dp)
                            )
                                .clickable {
                                    navController.navigate(Routes.Quantiphi.routes) {
                                        popUpTo(navController.graph.startDestinationId)
                                        launchSingleTop = true
                                    }
                                }
                        )

                    }
//---------------------------------------------------------------------------------------------------
                    Column(
                        Modifier
                            .weight(0.5f)
                            .height(100.dp)
                            .padding(end = 12.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                shape = RoundedCornerShape(10.dp)
                            )
                            .padding(top = 1.dp),
                        horizontalAlignment = Alignment.Start
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.arcon), contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier.fillMaxSize().clip(shape = RoundedCornerShape(10.dp))
                                .clickable {
                                    navController.navigate(Routes.Arcon.routes) {
                                        popUpTo(navController.graph.startDestinationId)
                                        launchSingleTop = true
                                    }
                                }
                        )
                    }
                }
            }
            item{
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp)
                ) {
                    Column(
                        Modifier
                            .weight(0.5f)
                            .height(100.dp)
                            .padding(end = 12.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                shape = RoundedCornerShape(10.dp)
                            )
                            .padding(top = 16.dp),
                        horizontalAlignment = Alignment.Start
                    ) {


                        Image(
                            painter = painterResource(id = R.drawable.browserstack), contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier.fillMaxSize().clip(shape = RoundedCornerShape(10.dp))
                        )

                    }
//---------------------------------------------------------------------------------------------------
                    Column(
                        Modifier
                            .weight(0.5f)
                            .height(100.dp)
                            .padding(end = 12.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                shape = RoundedCornerShape(10.dp)
                            )
                            .padding(top = 1.dp),
                        horizontalAlignment = Alignment.Start
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.godrej), contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier.fillMaxSize().clip(shape = RoundedCornerShape(10.dp))
                        )
                    }
                }
            }
            item{
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp)
                ) {
                    Column(
                        Modifier
                            .weight(0.5f)
                            .height(100.dp)
                            .padding(end = 12.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                shape = RoundedCornerShape(10.dp)
                            )
                            .padding(top = 16.dp),
                        horizontalAlignment = Alignment.Start
                    ) {


                        Image(
                            painter = painterResource(id = R.drawable.icici), contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier.fillMaxSize().clip(shape = RoundedCornerShape(10.dp))
                        )

                    }
//---------------------------------------------------------------------------------------------------
                    Column(
                        Modifier
                            .weight(0.5f)
                            .height(100.dp)
                            .padding(end = 12.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                shape = RoundedCornerShape(10.dp)
                            )
                            .padding(top = 1.dp),
                        horizontalAlignment = Alignment.Start
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.atidan), contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier.fillMaxSize().clip(shape = RoundedCornerShape(10.dp))
                        )
                    }
                }
            }
        }

        //-----------------------------------------------------------------
        //------------------------------------------------------------------------


    }
}