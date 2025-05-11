package com.example.placementtrainee.screens



import android.net.Uri
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes
import com.example.placementtrainee.viewModel.AuthViewModel

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun BottomNav(navController: NavHostController){
    val navController1 = rememberNavController()
    val authViewModel: AuthViewModel = viewModel()
    val videoUri = Uri.parse("android.resource://com.example.unreal/drawable/sample")


    androidx.compose.material.Scaffold (bottomBar ={ BottomBar(navController1)}){

            innerPadding -> NavHost(navController = navController1, startDestination = Routes.Home.routes,
        modifier = Modifier.padding(innerPadding)){
        composable(route = Routes.Home.routes){
            Home(navController)//navController
        }
        composable(Routes.Logout.routes){
            authViewModel.logout()
            Login(navController)
        }
        composable(Routes.Quiz.routes){

            Quiz(navController)
        }

        composable(Routes.Profile.routes){

            ProfileScreen(navController)
        }

        /*composable(Routes.Profile.routes){
            Profile(navController)
        }
        composable(Routes.Notification.routes){
            Notifications()
        }
        composable(Routes.Settings.routes){
            Settings(navController)
        }*/


    }

    }
}
data class BottomMenuItem(val label:String, val icon: Painter, val route:String) {

}


@Composable
fun prepareBottomMenu(): List<BottomMenuItem>{
    val bottomMenuItemList= arrayListOf<BottomMenuItem>()

    bottomMenuItemList.add(BottomMenuItem(label = "home", icon = painterResource(id = R.drawable.bottom_home),route = Routes.Home.routes))
    bottomMenuItemList.add(BottomMenuItem(label = "profile", icon = painterResource(id = R.drawable.bottom_profile),route = Routes.Profile.routes))
    bottomMenuItemList.add(BottomMenuItem(label = "Quiz", icon = painterResource(id = R.drawable.bottom_appointment),route = Routes.Quiz.routes))
    bottomMenuItemList.add(BottomMenuItem(label = "logout", icon = painterResource(id = R.drawable.logout_1),route = Routes.Logout.routes))

    return bottomMenuItemList
}


@Composable
fun BottomBar(navController1: NavHostController) {

    val backStackEntry = navController1.currentBackStackEntryAsState()
    val bottomMenuItemList = prepareBottomMenu()



    BottomAppBar(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 9.dp)
            .height(50.dp)
            .background(
                color = Color.White,
                shape = RoundedCornerShape(bottomEnd = 10.dp, bottomStart = 10.dp)
            ),
        containerColor = Color.White, contentPadding = PaddingValues(1.dp)
    ) {

        bottomMenuItemList.forEach{
            val selected = it.route == backStackEntry?.value?.destination?.route

            BottomNavigationItem(
                selected = selected,
                onClick = {
                    navController1.navigate(it.route){
                        popUpTo(navController1.graph.findStartDestination().id){
                            saveState = true
                        }
                        launchSingleTop = true
                    }
                },
                icon = {
                    Icon(
                        painter = it.icon,
                        contentDescription = null,
                        modifier = Modifier
                            .height(26.dp)
                            .width(26.dp)
                        //.padding(start= 10.dp,bottom = 6.dp)

                    )
                },
                label = {
                    Text(text = it.label, fontSize = 13.sp,modifier = Modifier.padding(top = 14.dp))
                },
                alwaysShowLabel = true,
                enabled = true
            )
        }



    }


}

