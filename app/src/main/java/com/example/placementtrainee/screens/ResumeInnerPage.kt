package com.example.placementtrainee.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes




@Composable
fun ResumeInnerPage(navController: NavController){

    Column(
        Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color(android.graphics.Color.parseColor("#eeeeee")))
            .padding(top = 32.dp, start = 16.dp, end = 16.dp),
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
            modifier = Modifier.padding(top = 53.dp,start = 62.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Box(
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp)
                    .background(
                        color = Color(android.graphics.Color.parseColor("#ffffff")),
                        shape = RoundedCornerShape(15.dp)
                    ),
                contentAlignment = Alignment.CenterEnd
            ) {

                Image(
                    painter = painterResource(id = R.drawable.cvparser),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(7.dp)
                        .clickable {
                            navController.navigate(Routes.resume.routes) {
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }

                        }
                )

            }
            Text(
                text = "Resume Parser",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color(android.graphics.Color.parseColor("#000000")),
                modifier = Modifier.padding(top = 8.dp)
            )

            Spacer(modifier = Modifier.height(100.dp))

            Box(
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp)
                    .background(
                        color = Color(android.graphics.Color.parseColor("#ffffff")),
                        shape = RoundedCornerShape(15.dp)
                    ),
                contentAlignment = Alignment.CenterEnd
            ) {

                Image(
                    painter = painterResource(id = R.drawable.cvbuilder),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(7.dp)
                        .clickable {
                             navController.navigate(Routes.ResumeBuilderScreen.routes) {
                                 popUpTo(navController.graph.startDestinationId)
                                 launchSingleTop = true
                             }

                        }
                )

            }
            Text(
                text = "Resume Builder",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color(android.graphics.Color.parseColor("#000000")),
                modifier = Modifier.padding(top = 8.dp)
            )
        }

    }
}