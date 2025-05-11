package com.example.placementtrainee.screens



import androidx.appcompat.app.AppCompatDelegate
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.os.LocaleListCompat
import androidx.navigation.NavHostController
import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes


@Composable
fun Languages(navController: NavHostController){

    val localeOptions = mapOf(
        "English" to "en",
        "हिंदी" to "hi",
        "मराठी" to "mr",

    )

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
                .height(50.dp)
                .width(65.dp)
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
                        navController.navigate(Routes.StartPage.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }

                    }
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth().height(70.dp)
                .padding(top = 24.dp)
                .background(
                    color= Color(android.graphics.Color.parseColor("#00796e")),
                    shape = RoundedCornerShape(10.dp)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ) {
        Text(
            text = "Select Language", style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,

                ), modifier = Modifier.padding(vertical = 6.dp), color = Color.White
        )}

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        ) {
            localeOptions.forEach { (languageName, languageTag) ->
                OutlinedButton(
                    onClick = {
                        AppCompatDelegate.setApplicationLocales(
                            LocaleListCompat.forLanguageTags(languageTag)
                        )
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 7.dp, start = 8.dp, end = 8.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(10.dp), ambientColor = Color.Black),
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color(android.graphics.Color.parseColor("#6BB76E"))
                    ),
                    shape = RoundedCornerShape(20.dp),
                ) {
                    Text(
                        text = languageName, style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,
                        ), modifier = Modifier.padding(vertical = 6.dp), color = Color.White
                    )
                }
            }
        }
      /*  Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        ) {
            Column(
                Modifier
                    .weight(0.5f)
                    .height(90.dp)
                    .padding(end = 12.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                    Button(
                        onClick = {
                            AppCompatDelegate.setApplicationLocales(
                                LocaleListCompat.forLanguageTags(
                                    localeOptions["en"]
                                )
                            )

                            *//*navController.navigate(Routes.Login.routes) {
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }*//*


                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 7.dp, start = 8.dp, end = 8.dp).shadow(10.dp, shape = RoundedCornerShape(10.dp), ambientColor = Color.Black),
                        colors = ButtonDefaults.outlinedButtonColors(
                            backgroundColor = Color(android.graphics.Color.parseColor("#6BB76E"))
                        )//
                        ,
                        shape = RoundedCornerShape(20.dp),
                      //  content = {Text(stringResource(id = selectionLocale))}


                        ){
                        androidx.compose.material.Text(
                            text = "English", style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,

                                ), modifier = Modifier.padding(vertical = 6.dp), color = Color.White
                        )
                    }



                *//*Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                        .height(40.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                            shape = RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp)
                        ), contentAlignment = Alignment.Center
                ) {

                    Text(
                        text = "Eye Specialist",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(android.graphics.Color.parseColor("#7869e5"))
                    )
                }*//*
            }
//---------------------------------------------------------------------------------------------------

            Column(
                Modifier
                    .weight(0.5f)
                    .height(90.dp)
                    .padding(end = 12.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                localeOptions.keys.forEach{ selectionLocale ->
    OutlinedButton(
    onClick = {
        AppCompatDelegate.setApplicationLocales(
            LocaleListCompat.forLanguageTags(
                localeOptions[selectionLocale]
            )
        )


    },
    modifier = Modifier
        .fillMaxWidth()
        .padding(top = 7.dp, start = 8.dp, end = 8.dp).shadow(10.dp, shape = RoundedCornerShape(10.dp), ambientColor = Color.Black),
    colors = ButtonDefaults.outlinedButtonColors(
        backgroundColor = Color(android.graphics.Color.parseColor("#6BB76E"))
    )//
    ,
    shape = RoundedCornerShape(20.dp),
    //  content = {Text(stringResource(id = selectionLocale))}


){
    androidx.compose.material.Text(
        text = "Hindi", style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,

            ), modifier = Modifier.padding(vertical = 6.dp), color = Color.White
    )
}
}

            }
        }
        //--------------------------------------------------------------------------------------
        //-------------------------------------------------------------------------------
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        ) {

            Column(
                Modifier
                    .weight(0.5f)
                    .height(90.dp)
                    .padding(end = 12.dp)
                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                OutlinedButton(
                    onClick = {
                        *//*navController.navigate(Routes.Login.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }*//*
                        AppCompatDelegate.setApplicationLocales(
                            LocaleListCompat.forLanguageTags(
                                localeOptions[localeOptions.]
                            )
                        )


                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 7.dp, start = 8.dp, end = 8.dp).shadow(10.dp, shape = RoundedCornerShape(10.dp), ambientColor = Color.Black),
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color(android.graphics.Color.parseColor("#6BB76E"))
                    )//
                    ,
                    shape = RoundedCornerShape(20.dp),
                    //  content = {Text(stringResource(id = selectionLocale))}


                ){
                    androidx.compose.material.Text(
                        text = "Marathi", style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,

                            ), modifier = Modifier.padding(vertical = 6.dp), color = Color.White
                    )
                }
            }
//-----------------------------------------------------------------------------------------
            Column(
                Modifier
                    .weight(0.5f)
                    .height(90.dp)
                    .padding(end = 12.dp)

                    .background(
                        color = androidx.compose.ui.graphics.Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(top = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                OutlinedButton(
                    onClick = {
                        AppCompatDelegate.setApplicationLocales(
                            LocaleListCompat.forLanguageTags(
                                localeOptions["gu"]
                            )
                        )
                       *//* navController.navigate(Routes.Login.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }*//*

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 7.dp, start = 8.dp, end = 8.dp).shadow(10.dp, shape = RoundedCornerShape(10.dp), ambientColor = Color.Black),
                    colors = ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color(android.graphics.Color.parseColor("#6BB76E"))
                    )//
                    ,
                    shape = RoundedCornerShape(20.dp),
                    //  content = {Text(stringResource(id = selectionLocale))}


                ){
                    androidx.compose.material.Text(
                        text = "Gujarati", style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 14.sp,

                            ), modifier = Modifier.padding(vertical = 6.dp), color = Color.White
                    )
                }
            }
        }*/

        Button(onClick = {
            navController.navigate(Routes.Login.routes) {
                popUpTo(navController.graph.startDestinationId)
                launchSingleTop = true
            }



        }, modifier = Modifier.fillMaxWidth().padding(top = 200.dp),
            colors =  ButtonDefaults.outlinedButtonColors(
                backgroundColor = Color(android.graphics.Color.parseColor("#6C9E81")))//
            , shape = RoundedCornerShape(20.dp),


            )

        {
            Text(
                text = "Next", style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,

                    ), modifier = Modifier.padding(vertical = 6.dp),color = Color.White
            )

        }



    }
}
