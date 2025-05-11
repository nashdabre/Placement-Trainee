package com.example.placementtrainee.screens


import android.content.Intent
import android.net.Uri
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
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes


@Composable
fun Wissen(navController: NavHostController){

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
                        navController.navigate(Routes.Interview.routes) {
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

            WissenImages()
        }

        Row (modifier = Modifier.padding(top = 30.dp)){
            Column(modifier = Modifier
                .height(370.dp)
                .fillMaxSize()
                .background(Color.White, shape = RoundedCornerShape(20.dp))
                .padding(10.dp))
                    {

                        LazyColumn(modifier = Modifier.fillMaxSize()) {
                            item{
                                Box (contentAlignment = Alignment.Center){
                                    Text(
                                        text = "Wissen",
                                        fontSize = 19.sp,
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Center,
                                        color = Color(android.graphics.Color.parseColor("#000000")),

                                        )
                                }
                           }
                            //------------------------------------------------
                            item{
                                Box (contentAlignment = Alignment.Center){
                                    Text(
                                        text = "Company Profile:",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Justify,
                                        color = Color(android.graphics.Color.parseColor("#000000")),

                                        )
                                }
                                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(3.dp)){
                                    Text(
                                        text = "Wissen is a global technology consulting and solutions " +
                                                "company, known for providing IT solutions and services " +
                                                "across multiple domains. It has a strong focus on banking, " +
                                                "financial services, and insurance (BFSI), with expertise in " +
                                                "areas like cloud computing, data engineering, and AI-driven solutions.",
                                        fontSize = 14.sp,
                                       // fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Justify,
                                        color = Color(android.graphics.Color.parseColor("#000000")),

                                        )
                                }
                            }
                            //------------------------------------------------
                            item{
                                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top= 10.dp)){
                                    Text(
                                        text = "Applications/Services:",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Justify,
                                        color = Color(android.graphics.Color.parseColor("#000000")),

                                        )
                                }
                                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(3.dp)){
                                    Text(
                                        text = "> Digital transformation\n" +
                                                "> Cloud services and DevOps\n" +
                                                "> Data analytics and engineering\n" +
                                                "> AI & machine learning solutions\n" +
                                                "> Risk management and regulatory reporting for BFSI",
                                        fontSize = 14.sp,
                                        // fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Justify,
                                        color = Color(android.graphics.Color.parseColor("#000000")),

                                        )
                                }
                            }
                        //------------------------------------------------
                            item{
                                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top= 10.dp)){
                                    Text(
                                        text = "Website Link:",
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Justify,
                                        color = Color(android.graphics.Color.parseColor("#000000")),

                                        )
                                }
                                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(3.dp)){
                                   CompanyLinks()
                                }
                            }

                            //------------------------------------------------
                            item{
                                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top= 10.dp)){
                                    Button(onClick = {
                                        navController.navigate(Routes.Wissen_RolesnRes.routes) {
                                            popUpTo(navController.graph.startDestinationId)
                                            launchSingleTop = true
                                        }


                                    }, modifier = Modifier.fillMaxWidth().padding(10.dp),
                                        colors =  ButtonDefaults.outlinedButtonColors(
                                            backgroundColor = Color(android.graphics.Color.parseColor("#637f57")))//
                                        , shape = RoundedCornerShape(20.dp),


                                        )

                                    {
                                        androidx.compose.material.Text(
                                            text = "Roles & Responsibilities", style = TextStyle(
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 22.sp,

                                                ), modifier = Modifier.padding(vertical = 6.dp),color = Color.White
                                        )

                                    }
                                }

                            }
                        }


            }
        }










        }
}

@Composable
fun CompanyLink(text: String, url: String) {
    val context = LocalContext.current
    val annotatedString = buildAnnotatedString {
        append(text)
        addStringAnnotation(
            tag = "URL",
            annotation = url,
            start = 0,
            end = text.length
        )
    }

    ClickableText(
        text = annotatedString,
        style = LocalTextStyle.current.copy(
            color = MaterialTheme.colorScheme.primary,
            textDecoration = TextDecoration.Underline
        ),
        onClick = { offset ->
            annotatedString.getStringAnnotations(tag = "URL", start = offset, end = offset)
                .firstOrNull()?.let { stringAnnotation ->
                    val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(stringAnnotation.item))
                    context.startActivity(browserIntent)
                }
        }
    )
}

@Composable
fun CompanyLinks() {
    Column {
        CompanyLink("Wissen", "https://wissen.com")

    }
}