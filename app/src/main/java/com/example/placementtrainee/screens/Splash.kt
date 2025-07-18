package com.example.placementtrainee.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.delay

@Composable
fun Splash(navController: NavHostController){



    ConstraintLayout (modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)){
        val (image)= createRefs()
        Image(painter = painterResource(id = R.drawable.trainee_logo), contentDescription = "placement trainee logo",
            modifier = Modifier
                .constrainAs(image) {
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .size(180.dp))
    }
    LaunchedEffect(key1 = true){
        delay(1000)

        if(FirebaseAuth.getInstance().currentUser!=null) {

            navController.navigate(Routes.BottomNav.routes){
                popUpTo(navController.graph.startDestinationId)
                launchSingleTop = true
            }
        }
        else {
            navController.navigate(Routes.StartPage.routes) {
                popUpTo(navController.graph.startDestinationId)
                launchSingleTop = true
            }
        }
    }



}