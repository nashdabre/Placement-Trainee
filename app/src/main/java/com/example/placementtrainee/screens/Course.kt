package com.example.placementtrainee.screens

import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.view.ViewCompat
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView


@Composable
fun Course(navController: NavHostController){
    val context = LocalContext.current
    var showVideo by remember { mutableStateOf(false) }

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

        Text(
            text = "Categories",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color(android.graphics.Color.parseColor("#000000")),
            modifier = Modifier.padding(top = 10.dp)

            )

        LazyRow(modifier = Modifier.padding(top = 15.dp, bottom = 15.dp)) {
            item{
                Button(modifier= Modifier
                    .height(60.dp)
                    .padding(end = 10.dp),
                    onClick = { /*TODO*/ },
                    colors =  ButtonDefaults.outlinedButtonColors(Color.White)) {

                Text(text = "Programming", color = Color.Black, fontSize = 20.sp)
                
            }}
            item{
                Button(modifier= Modifier
                    .height(60.dp)
                    .padding(end = 10.dp),
                    onClick = { /*TODO*/ },
                    colors =  ButtonDefaults.outlinedButtonColors(Color.White)) {

                    Text(text = "DSA", color = Color.Black, fontSize = 20.sp)

                }}
            item{
                Button(modifier= Modifier
                    .height(60.dp)
                    .padding(end = 10.dp),
                    onClick = { /*TODO*/ },
                    colors =  ButtonDefaults.outlinedButtonColors(Color.White)) {

                    Text(text = "OOP", color = Color.Black, fontSize = 20.sp)

                }}
            item{
                Button(modifier= Modifier
                    .height(60.dp)
                    .padding(end = 10.dp),
                    onClick = { /*TODO*/ },
                    colors =  ButtonDefaults.outlinedButtonColors(Color.White)) {

                    Text(text = "System Design", color = Color.Black, fontSize = 20.sp)

                }}
            item{
                Button(modifier= Modifier
                    .height(60.dp)
                    .padding(end = 10.dp),
                    onClick = { /*TODO*/ },
                    colors =  ButtonDefaults.outlinedButtonColors(Color.White)) {

                    Text(text = "DBMS", color = Color.Black, fontSize = 20.sp)

                }}
            item{
                Button(modifier= Modifier
                    .height(60.dp)
                    .padding(end = 10.dp),
                    onClick = { /*TODO*/ },
                    colors =  ButtonDefaults.outlinedButtonColors(Color.White)) {

                    Text(text = "OS", color = Color.Black, fontSize = 20.sp)

                }}
            item{
                Button(modifier= Modifier
                    .height(60.dp)
                    .padding(end = 10.dp),
                    onClick = { /*TODO*/ },
                    colors =  ButtonDefaults.outlinedButtonColors(Color.White)) {

                    Text(text = "Networking", color = Color.Black, fontSize = 20.sp)

                }}
            item{
                Button(modifier= Modifier
                    .height(60.dp)
                    .padding(end = 10.dp),
                    onClick = { /*TODO*/ },
                    colors =  ButtonDefaults.outlinedButtonColors(Color.White)) {

                    Text(text = "Cloud", color = Color.Black, fontSize = 20.sp)

                }}
            item{
                Button(modifier= Modifier
                    .height(60.dp)
                    .padding(end = 10.dp),
                    onClick = { /*TODO*/ },
                    colors =  ButtonDefaults.outlinedButtonColors(Color.White)) {

                    Text(text = "Web dev", color = Color.Black, fontSize = 20.sp)

                }}
            item{
                Button(modifier= Modifier
                    .height(60.dp)
                    .padding(end = 10.dp),
                    onClick = { /*TODO*/ },
                    colors =  ButtonDefaults.outlinedButtonColors(Color.White)) {

                    Text(text = "App dev", color = Color.Black, fontSize = 20.sp)

                }}
            item{
                Button(modifier= Modifier
                    .height(60.dp)
                    .padding(end = 10.dp),
                    onClick = { /*TODO*/ },
                    colors =  ButtonDefaults.outlinedButtonColors(Color.White)) {

                    Text(text = "Communication", color = Color.Black, fontSize = 20.sp)

                }}
            item{
                Button(modifier= Modifier
                    .height(60.dp)
                    .padding(end = 10.dp),
                    onClick = { /*TODO*/ },
                    colors =  ButtonDefaults.outlinedButtonColors(Color.White)) {

                    Text(text = "GD", color = Color.Black, fontSize = 20.sp)

                }}
            item{
                Button(modifier= Modifier
                    .height(60.dp)
                    .padding(end = 10.dp),
                    onClick = { /*TODO*/ },
                    colors =  ButtonDefaults.outlinedButtonColors(Color.White)) {

                    Text(text = "Resume Writing", color = Color.Black, fontSize = 20.sp)

                }}
            item{
                Button(modifier= Modifier
                    .height(60.dp)
                    .padding(end = 10.dp),
                    onClick = { /*TODO*/ },
                    colors =  ButtonDefaults.outlinedButtonColors(Color.White)) {

                    Text(text = "Coding", color = Color.Black, fontSize = 20.sp)

                }}

        }

        Text(
            text = "Popular Courses",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color(android.graphics.Color.parseColor("#000000")),
            modifier = Modifier.padding(top = 10.dp)

        )

        LazyColumn(Modifier.padding(10.dp)) {
            item {
                LazyRow(Modifier.padding(top = 10.dp, end = 10.dp)) {
                    item{
                        Column(modifier = Modifier
                            .width(270.dp)
                            .height(270.dp)
                           // .padding(end= 10.dp)
                            .background(Color.White, RoundedCornerShape(20.dp))) {

                            Box(
                                modifier = Modifier
                                    .shadow(10.dp)
                                    .height(152.dp)
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#000000")),
                                        shape = RoundedCornerShape(20.dp)
                                    )

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.apti_course),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(0.dp)
                                        .clip(RoundedCornerShape(20.dp))
                                        .clickable {
                                            showVideo = true
                                            /*  navController.navigate(Routes.BottomNav.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )


                            }
                            if (showVideo) {
                                AndroidView(
                                    factory = {
                                        val playerView = PlayerView(context)
                                        val exoPlayer = ExoPlayer.Builder(context).build()

                                        // 🔁 Replace FILE_ID with your actual Drive file ID
                                        val driveVideoUri = Uri.parse("https://drive.google.com/uc?export=download&id=1elHWrG6NUFa8U5QKCX5_DgCfqi02vfTg")
                                        val mediaItem = MediaItem.fromUri(driveVideoUri)
                                        exoPlayer.setMediaItem(mediaItem)
                                        exoPlayer.prepare()
                                        exoPlayer.playWhenReady = true

                                        playerView.player = exoPlayer
                                        playerView.useController = true
                                        ViewCompat.setTranslationZ(playerView, 1f)

                                        playerView
                                    },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .fillMaxHeight()
                                )
                            }

                            Text(
                                text = "Aptitude Practice in 2 days..",
                                fontSize = 18.sp,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(top = 10.dp,start = 10.dp)

                            )

                            Text(
                                text = "Authored by Nash Dabre",
                                fontSize = 14.sp,
                                textAlign = TextAlign.Center,
                               // fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#9e9e9e")),
                                modifier = Modifier.padding(top = 10.dp,start = 10.dp)

                            )

                            Row {
                                Image(
                                    painter = painterResource(id = R.drawable.clock),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .width(40.dp)
                                        .padding(start = 16.dp, top = 13.dp)
                                        .clickable {
                                            /*  navController.navigate(Routes.BottomNav.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )

                                Text(
                                    text = "48 hours",
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center,
                                    // fontWeight = FontWeight.Bold,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(top = 13.dp,start = 10.dp)

                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Image(
                                    painter = painterResource(id = R.drawable.bottom_profile),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .width(40.dp)
                                        .padding(start = 16.dp, top = 13.dp)
                                        .clickable {
                                            /*  navController.navigate(Routes.BottomNav.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )
                                Text(
                                    text = "139 users",
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center,
                                    // fontWeight = FontWeight.Bold,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(top = 13.dp,start = 10.dp)

                                )
                            }
                        }
                    }
                //-----------------------------------------------
                    item {
                        Column(
                            modifier = Modifier
                                .padding(start = 20.dp)
                                .width(270.dp)
                                .height(270.dp)

                                .background(Color.White, RoundedCornerShape(20.dp))
                        ) {

                            Box(
                                modifier = Modifier
                                    .shadow(10.dp)
                                    .height(152.dp)
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#000000")),
                                        shape = RoundedCornerShape(20.dp)
                                    )

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.dsa_course),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(0.dp)
                                        .clip(RoundedCornerShape(20.dp))
                                        .clickable {
                                            /*  navController.navigate(Routes.BottomNav.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )


                            }

                            Text(
                                text = "Complete DSA in 7 days..",
                                fontSize = 18.sp,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(top = 10.dp, start = 10.dp)

                            )

                            Text(
                                text = "Authored by Aqib",
                                fontSize = 14.sp,
                                textAlign = TextAlign.Center,
                                // fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#9e9e9e")),
                                modifier = Modifier.padding(top = 10.dp, start = 10.dp)

                            )

                            Row {
                                Image(
                                    painter = painterResource(id = R.drawable.clock),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .width(40.dp)
                                        .padding(start = 16.dp, top = 13.dp)
                                        .clickable {
                                            /*  navController.navigate(Routes.BottomNav.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )

                                Text(
                                    text = "168 hours",
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center,
                                    // fontWeight = FontWeight.Bold,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(top = 13.dp, start = 10.dp)

                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Image(
                                    painter = painterResource(id = R.drawable.bottom_profile),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .width(40.dp)
                                        .padding(start = 16.dp, top = 13.dp)
                                        .clickable {
                                            /*  navController.navigate(Routes.BottomNav.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )
                                Text(
                                    text = "876 users",
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center,
                                    // fontWeight = FontWeight.Bold,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(top = 13.dp, start = 10.dp)

                                )
                            }
                        }
                    }
                    //-----------------------------------------------
                    item{
                        Column(modifier = Modifier
                            .padding(start = 20.dp)
                            .width(270.dp)
                            .height(270.dp)

                            .background(Color.White, RoundedCornerShape(20.dp))) {

                            Box(
                                modifier = Modifier
                                    .shadow(10.dp)
                                    .height(152.dp)
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#000000")),
                                        shape = RoundedCornerShape(20.dp)
                                    )

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.communication_course),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(0.dp)
                                        .clip(RoundedCornerShape(20.dp))
                                        .clickable {
                                            /*  navController.navigate(Routes.BottomNav.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )


                            }

                            Text(
                                text = "Communication Skills",
                                fontSize = 18.sp,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(top = 10.dp,start = 10.dp)

                            )

                            Text(
                                text = "Authored by Prince Carval",
                                fontSize = 14.sp,
                                textAlign = TextAlign.Center,
                                // fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#9e9e9e")),
                                modifier = Modifier.padding(top = 10.dp,start = 10.dp)

                            )

                            Row {
                                Image(
                                    painter = painterResource(id = R.drawable.clock),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .width(40.dp)
                                        .padding(start = 16.dp, top = 13.dp)
                                        .clickable {
                                            /*  navController.navigate(Routes.BottomNav.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )

                                Text(
                                    text = "72 hours",
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center,
                                    // fontWeight = FontWeight.Bold,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(top = 13.dp,start = 10.dp)

                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Image(
                                    painter = painterResource(id = R.drawable.bottom_profile),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .width(40.dp)
                                        .padding(start = 16.dp, top = 13.dp)
                                        .clickable {
                                            /*  navController.navigate(Routes.BottomNav.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )
                                Text(
                                    text = "657 users",
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center,
                                    // fontWeight = FontWeight.Bold,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(top = 13.dp,start = 10.dp)

                                )
                            }
                        }
                    }
                    //-----------------------------------------------



                }
            }
          //-----------------------------------------------
           //----------------------------------------------
            item {
                LazyRow(Modifier.padding(top = 40.dp, end = 10.dp)) {
                    item{
                        Column(modifier = Modifier
                            .width(270.dp)
                            .height(270.dp)
                            // .padding(end= 10.dp)
                            .background(Color.White, RoundedCornerShape(20.dp))) {

                            Box(
                                modifier = Modifier
                                    .shadow(10.dp)
                                    .height(152.dp)
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#000000")),
                                        shape = RoundedCornerShape(20.dp)
                                    )

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.programming_course),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(0.dp)
                                        .clip(RoundedCornerShape(20.dp))
                                        .clickable {
                                            /*  navController.navigate(Routes.BottomNav.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )


                            }

                            Text(
                                text = "Java Tutorial",
                                fontSize = 18.sp,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(top = 10.dp,start = 10.dp)

                            )

                            Text(
                                text = "Authored by Nash Dabre",
                                fontSize = 14.sp,
                                textAlign = TextAlign.Center,
                                // fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#9e9e9e")),
                                modifier = Modifier.padding(top = 10.dp,start = 10.dp)

                            )

                            Row {
                                Image(
                                    painter = painterResource(id = R.drawable.clock),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .width(40.dp)
                                        .padding(start = 16.dp, top = 13.dp)
                                        .clickable {
                                            /*  navController.navigate(Routes.BottomNav.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )

                                Text(
                                    text = "96 hours",
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center,
                                    // fontWeight = FontWeight.Bold,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(top = 13.dp,start = 10.dp)

                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Image(
                                    painter = painterResource(id = R.drawable.bottom_profile),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .width(40.dp)
                                        .padding(start = 16.dp, top = 13.dp)
                                        .clickable {
                                            /*  navController.navigate(Routes.BottomNav.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )
                                Text(
                                    text = "982 users",
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center,
                                    // fontWeight = FontWeight.Bold,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(top = 13.dp,start = 10.dp)

                                )
                            }
                        }
                    }
                    //-----------------------------------------------
                    item {
                        Column(
                            modifier = Modifier
                                .padding(start = 20.dp)
                                .width(270.dp)
                                .height(270.dp)

                                .background(Color.White, RoundedCornerShape(20.dp))
                        ) {

                            Box(
                                modifier = Modifier
                                    .shadow(10.dp)
                                    .height(152.dp)
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#000000")),
                                        shape = RoundedCornerShape(20.dp)
                                    )

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.resume_course),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(0.dp)
                                        .clip(RoundedCornerShape(20.dp))
                                        .clickable {
                                            /*  navController.navigate(Routes.BottomNav.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )


                            }

                            Text(
                                text = "Resume Building",
                                fontSize = 18.sp,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(top = 10.dp, start = 10.dp)

                            )

                            Text(
                                text = "Authored by Aqib",
                                fontSize = 14.sp,
                                textAlign = TextAlign.Center,
                                // fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#9e9e9e")),
                                modifier = Modifier.padding(top = 10.dp, start = 10.dp)

                            )

                            Row {
                                Image(
                                    painter = painterResource(id = R.drawable.clock),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .width(40.dp)
                                        .padding(start = 16.dp, top = 13.dp)
                                        .clickable {
                                            /*  navController.navigate(Routes.BottomNav.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )

                                Text(
                                    text = "24 hours",
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center,
                                    // fontWeight = FontWeight.Bold,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(top = 13.dp, start = 10.dp)

                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Image(
                                    painter = painterResource(id = R.drawable.bottom_profile),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .width(40.dp)
                                        .padding(start = 16.dp, top = 13.dp)
                                        .clickable {
                                            /*  navController.navigate(Routes.BottomNav.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )
                                Text(
                                    text = "238 users",
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center,
                                    // fontWeight = FontWeight.Bold,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(top = 13.dp, start = 10.dp)

                                )
                            }
                        }
                    }
                    //-----------------------------------------------
                    item{
                        Column(modifier = Modifier
                            .padding(start = 20.dp)
                            .width(270.dp)
                            .height(270.dp)

                            .background(Color.White, RoundedCornerShape(20.dp))) {

                            Box(
                                modifier = Modifier
                                    .shadow(10.dp)
                                    .height(152.dp)
                                    .fillMaxWidth()
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#000000")),
                                        shape = RoundedCornerShape(20.dp)
                                    )

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.programming_course),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(0.dp)
                                        .clip(RoundedCornerShape(20.dp))
                                        .clickable {
                                            /*  navController.navigate(Routes.BottomNav.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )


                            }

                            Text(
                                text = "Python Tutorial",
                                fontSize = 18.sp,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(top = 10.dp,start = 10.dp)

                            )

                            Text(
                                text = "Authored by Prince Carval",
                                fontSize = 14.sp,
                                textAlign = TextAlign.Center,
                                // fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#9e9e9e")),
                                modifier = Modifier.padding(top = 10.dp,start = 10.dp)

                            )

                            Row {
                                Image(
                                    painter = painterResource(id = R.drawable.clock),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .width(40.dp)
                                        .padding(start = 16.dp, top = 13.dp)
                                        .clickable {
                                            /*  navController.navigate(Routes.BottomNav.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )

                                Text(
                                    text = "148 hours",
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center,
                                    // fontWeight = FontWeight.Bold,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(top = 13.dp,start = 10.dp)

                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Image(
                                    painter = painterResource(id = R.drawable.bottom_profile),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .width(40.dp)
                                        .padding(start = 16.dp, top = 13.dp)
                                        .clickable {
                                            /*  navController.navigate(Routes.BottomNav.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }*/

                                        }
                                )
                                Text(
                                    text = "823 users",
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center,
                                    // fontWeight = FontWeight.Bold,
                                    color = Color(android.graphics.Color.parseColor("#000000")),
                                    modifier = Modifier.padding(top = 13.dp,start = 10.dp)

                                )
                            }
                        }
                    }
                    //-----------------------------------------------



                }
            }
        }
    }
}