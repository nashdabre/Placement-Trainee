package com.example.placementtrainee.navigation

import android.os.Build

import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable

import androidx.compose.ui.platform.LocalLifecycleOwner

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.placementtrainee.data.ResumeData
import com.example.placementtrainee.screens.ATSScoreScreen
import com.example.placementtrainee.screens.Aptitude
import com.example.placementtrainee.screens.Arcon
import com.example.placementtrainee.screens.Arcon_Experience_software
import com.example.placementtrainee.screens.Arcon_Nash
import com.example.placementtrainee.screens.Arcon_Quality_role
import com.example.placementtrainee.screens.Arcon_RolesnRes
import com.example.placementtrainee.screens.Arcon_Software_role
import com.example.placementtrainee.screens.Arcon_Support_role
import com.example.placementtrainee.screens.Articels
import com.example.placementtrainee.screens.BottomNav
import com.example.placementtrainee.screens.ChatBot
import com.example.placementtrainee.screens.CodeGeneratorScreen
import com.example.placementtrainee.screens.Course
import com.example.placementtrainee.screens.DolatCapital1
import android.content.Context
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import com.example.placementtrainee.screens.CareerPlanScreen
import com.example.placementtrainee.screens.Dolat_Experience
import com.example.placementtrainee.screens.Dolat_Necole
import com.example.placementtrainee.screens.Dolat_RolesnRes
import com.example.placementtrainee.screens.FAQScreen
import com.example.placementtrainee.screens.Fundamental_quiz

import com.example.placementtrainee.screens.Home
import com.example.placementtrainee.screens.Interview
import com.example.placementtrainee.screens.Languages
import com.example.placementtrainee.screens.Logical_Quiz
import com.example.placementtrainee.screens.Login
import com.example.placementtrainee.screens.ProfileScreen
import com.example.placementtrainee.screens.Programming_quiz
import com.example.placementtrainee.screens.Quanti_quiz
import com.example.placementtrainee.screens.Quantiphi
import com.example.placementtrainee.screens.Quiz

import com.example.placementtrainee.screens.Register
import com.example.placementtrainee.screens.ResumeBuilderScreen
import com.example.placementtrainee.screens.ResumeInnerPage
import com.example.placementtrainee.screens.Splash
import com.example.placementtrainee.screens.StartPage
import com.example.placementtrainee.screens.Wissen
import com.example.placementtrainee.screens.Wissen_Chhand
import com.example.placementtrainee.screens.Wissen_Crystal
import com.example.placementtrainee.screens.Wissen_Experience

import com.example.placementtrainee.screens.Wissen_RolesnRes

/*import com.example.placementtrainee.screens.logical_quiz*/
import com.example.placementtrainee.screens.youtube.youtube0
import com.example.placementtrainee.screens.youtube.youtube1
import com.example.placementtrainee.screens.youtube.youtube2
import com.example.placementtrainee.screens.youtube.youtube3
import com.example.placementtrainee.screens.youtube.youtube4
import com.example.placementtrainee.screens.youtube.youtube5




@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NavGraph(navController: NavHostController){




    NavHost(navController= navController,
        startDestination = Routes.Splash.routes){


        composable(Routes.Coding.routes){
            CodeGeneratorScreen(navController)
        }

        composable(Routes.Login.routes){
            Login(navController)
        }
        composable(Routes.StartPage.routes){
            StartPage(navController)
        }
        composable(Routes.Splash.routes){
            Splash(navController)
        }
        composable(Routes.BottomNav.routes){
            BottomNav(navController)
        }
        composable(Routes.Languages.routes){
            Languages(navController)
        }
        composable(Routes.Arcon_Nash.routes){
            Arcon_Nash(navController)
        }
        composable(Routes.Arcon.routes){
            Arcon(navController)
        }
        composable(Routes.Arcon_RolesnRes.routes){
            Arcon_RolesnRes(navController)
        }
     /*   composable(Routes.Lang.routes){
            language(navController, onDismiss = {})
        }*/

        composable(Routes.Articels.routes){
            Articels(navController)
        }

        composable(Routes.Interview.routes){
            Interview(navController)
        }

        composable(Routes.Aptitude.routes){
            Aptitude(navController)
        }

        composable(Routes.Arcon_software_role.routes){
            Arcon_Software_role(navController)
        }

        composable(Routes.Quantiphi.routes){
            Quantiphi(navController)
        }

        composable(Routes.Wissen_RolesnRes.routes){
            Wissen_RolesnRes(navController)
        }
        composable(Routes.Wissen_Experience.routes){
            Wissen_Experience(navController)
        }
        composable(Routes.Wissen_chhand.routes){
            Wissen_Chhand(navController)
        }

        composable(Routes.Wissen_crsytal.routes){
            Wissen_Crystal(navController)
        }

        composable(Routes.Wissen.routes){
            Wissen(navController)
        }

        composable(Routes.DolatCapital.routes){
            DolatCapital1(navController)
        }

        composable(Routes.Arcon_Experience.routes){
            Arcon_Experience_software(navController)
        }

        composable(Routes.Arcon_Support_role.routes){
            Arcon_Support_role(navController)
        }

        composable(Routes.Arcon_Quality_role.routes){
            Arcon_Quality_role(navController)
        }

        composable(Routes.resume.routes){
            ATSScoreScreen(navController)
        }

        composable(Routes.ResumeInnerPage.routes){
            ResumeInnerPage(navController)
        }

        composable(Routes.ResumeBuilderScreen.routes){
            ResumeBuilderScreen(
                context = LocalContext.current,
                navController = navController
            )
        }


        composable(Routes.Dolat_Necole.routes){
            Dolat_Necole(navController)
        }

        composable(Routes.FAQ.routes){
            FAQScreen(navController)
        }

        composable(Routes.Profile.routes){

            ProfileScreen(navController)
        }

        composable(Routes.CareerPlan.routes){

            CareerPlanScreen(navController)
        }

        composable(Routes.Dolat_RolesnRes.routes){
            Dolat_RolesnRes(navController)
        }
        composable(Routes.Dolat_Experience.routes){
            Dolat_Experience(navController)
        }

        composable(Routes.Youtube0.routes){
            youtube0(navController, youtubeVideoId = "jzNxXm5twx4", lifecycleOwner = LocalLifecycleOwner.current)
        }
        composable(Routes.Youtube1.routes){
            youtube1(navController, youtubeVideoId = "x0WkptLF6oE", lifecycleOwner = LocalLifecycleOwner.current )
        }
        composable(Routes.Youtube2.routes){
            youtube2(navController, youtubeVideoId = "cZOrX0WHWFk", lifecycleOwner = LocalLifecycleOwner.current )
        }
        composable(Routes.Youtube3.routes){
            youtube3(navController, youtubeVideoId = "T2odvmxqi1I", lifecycleOwner = LocalLifecycleOwner.current )
        }
        composable(Routes.Youtube4.routes){
            youtube4(navController, youtubeVideoId = "Eg6ibIGxeGc", lifecycleOwner = LocalLifecycleOwner.current )
        }
        composable(Routes.Youtube5.routes){
            youtube5(navController, youtubeVideoId = "jo_AsE9QL7k", lifecycleOwner = LocalLifecycleOwner.current )
        }

        composable(Routes.Home.routes){
            Home(navController)//navController
        }
        composable(Routes.Quiz.routes){
            Quiz(navController)
        }


        composable(Routes.Chatbot.routes){
            ChatBot(navController)
        }


        composable(Routes.Course.routes){
            Course(navController)
        }

        composable(Routes.Fundamental.routes){
            Fundamental_quiz(navController)
        }

        composable(Routes.Register.routes){
            Register(navController)
        }

        composable(Routes.Qaunti_Quiz.routes){
            Quanti_quiz(navController)
        }
        composable(Routes.Logical_Quiz.routes){
            Logical_Quiz(navController)
        }
        composable(Routes.Programming.routes){
            Programming_quiz(navController)
        }

        }
    }


