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
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import android.content.Context
import androidx.core.content.FileProvider

import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes
import java.io.File


@Composable
fun Arcon(navController: NavController){

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

            ArconImages()
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
                                text = "Arcon",
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
                                text = "Arcon TechSolutions is a leading provider of Privileged Access Management (PAM) solutions. " +
                                        "Founded in 2006, the company specializes in offering advanced cybersecurity solutions to " +
                                        "protect sensitive information and systems from unauthorized access and cyber threats. " +
                                        "Arcon TechSolutions is headquartered in Houston, Texas, with a global presence",
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
                                text = "> Privileged Access Management (PAM)\n" +
                                        "> Endpoint Privilege Management (EPM)\n" +
                                        "> Global Remote Access (GRA)\n" +
                                        "> Drift Management\n" +
                                        "> My Vault",
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
                            CompanyLinks_Arcon()
                        }
                    }

                    //------------------------------------------------
                    item{
                        Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top= 10.dp)){
                            Button(onClick = {
                                navController.navigate(Routes.Arcon_RolesnRes.routes) {
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
fun CompanyLink_Arcon(text: String, url: String) {
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
fun CompanyLinks_Arcon() {
    Column {
        //CompanyLink("Wissen", "https://wissen.com")
         CompanyLink_Arcon("Arcon", "https://arconnet.com/")
        /* CompanyLink("Quantiphi", "https://quantiphi.com")
         CompanyLink("Arcon", "https://arconnet.com")*/
    }
}

@Composable
fun Arcon_RolesnRes(navController: NavController){

    val context = LocalContext.current
    Column(
        Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color(android.graphics.Color.parseColor("#eeeeee")))
            .padding(top = 32.dp, start = 10.dp, end = 10.dp),
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
                        navController.navigate(Routes.Arcon.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }

                    }
            )
        }




        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp, start = 1.dp, bottom = 10.dp)
            .background(
                color = Color(android.graphics.Color.parseColor("#fdfdfd")),
                shape = RoundedCornerShape(20.dp)
            )
            .padding(5.dp)) {
            item {
                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 15.dp, start = 15.dp)){
                    Text(
                        text = "Roles and Responsiblity",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }
                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)){
                    Button(onClick = {

                        navController.navigate(Routes.Arcon_software_role.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }

                    }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 7.dp, start = 5.dp, end = 5.dp),
                        colors =  ButtonDefaults.outlinedButtonColors(
                            backgroundColor = Color(android.graphics.Color.parseColor("#a6acaf"))
                        )//
                        , shape = RoundedCornerShape(20.dp),


                        )

                    {
                        androidx.compose.material.Text(
                            text = "Software Developer", style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,

                                ), modifier = Modifier.padding(vertical = 6.dp), color = Color.White
                        )

                    }
                }

            }

            item {

                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)){
                    Button(onClick = {
                        navController.navigate(Routes.Arcon_Quality_role.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }


                    }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 7.dp, start = 5.dp, end = 5.dp),
                        colors =  ButtonDefaults.outlinedButtonColors(
                            backgroundColor = Color(android.graphics.Color.parseColor("#a6acaf"))
                        )//
                        , shape = RoundedCornerShape(20.dp),


                        )

                    {
                        androidx.compose.material.Text(
                            text = "Quality Assurance", style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,

                                ), modifier = Modifier.padding(vertical = 6.dp), color = Color.White
                        )

                    }
                }
            }
            item {
                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)){
                    Button(onClick = {
                      //  openPdf(context, "pdfs/Implementation_Engineer.pdf")


                    }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 7.dp, start = 5.dp, end = 5.dp),
                        colors =  ButtonDefaults.outlinedButtonColors(
                            backgroundColor = Color(android.graphics.Color.parseColor("#a6acaf"))
                        )//
                        , shape = RoundedCornerShape(20.dp),


                        )

                    {
                        androidx.compose.material.Text(
                            text = "Implementation Engineer", style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,

                                ), modifier = Modifier.padding(vertical = 6.dp), color = Color.White
                        )

                    }
                }
            }
            item {
                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)){
                    Button(onClick = {
                        navController.navigate(Routes.Arcon_Support_role.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }

                    }, modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 7.dp, start = 5.dp, end = 5.dp),
                        colors =  ButtonDefaults.outlinedButtonColors(
                            backgroundColor = Color(android.graphics.Color.parseColor("#a6acaf"))
                        )//
                        , shape = RoundedCornerShape(20.dp),


                        )

                    {
                        androidx.compose.material.Text(
                            text = "Support Engineer", style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp,

                                ), modifier = Modifier.padding(vertical = 6.dp), color = Color.White
                        )

                    }
                }
            }

        }
    }
}

@Composable
fun Arcon_Experience_software(navController: NavController){
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
                        navController.navigate(Routes.Arcon_software_role.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }

                    }
            )
        }

        Row(
            modifier = Modifier.padding(top = 35.dp, start = 20.dp),
            horizontalArrangement = Arrangement.Center
        ) {

            Column(
                modifier = Modifier.padding(start = 2.dp),
                horizontalAlignment = Alignment.Start
            ) {


                Box(
                    modifier = Modifier
                        .height(55.dp)
                        .width(55.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#ffffff")),
                            shape = RoundedCornerShape(15.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.boy1),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                navController.navigate(Routes.Arcon_Nash.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }
                            }
                    )

                }
                Text(
                    text = "Soham",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(android.graphics.Color.parseColor("#000000")),
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            //----------------------------------------------------------------------------
            // ----------------------------------------------------------------------------

            Column(
                modifier = Modifier.padding(start = 21.dp),
                horizontalAlignment = Alignment.Start
            ) {


                Box(
                    modifier = Modifier
                        .height(55.dp)
                        .width(55.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#ffffff")),
                            shape = RoundedCornerShape(15.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.girl1),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                navController.navigate(Routes.Arcon_Nash.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }

                            }
                    )

                }
                Text(
                    text = "Risa",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(android.graphics.Color.parseColor("#000000")),
                    modifier = Modifier.padding(top = 8.dp, start = 10.dp)
                )
            }
            //----------------------------------------------------------------------------
            // ----------------------------------------------------------------------------


        }
    }
}


@Composable
fun Arcon_Nash(navController: NavController){
    Column(
        Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color(android.graphics.Color.parseColor("#eeeeee")))
            .padding(top = 32.dp, start = 10.dp, end = 10.dp),
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
                        navController.navigate(Routes.Arcon_Experience.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }

                    }
            )
        }

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp)
            .background(Color.White, RoundedCornerShape(20.dp))
            .padding(top = 20.dp)) {

            LazyColumn(modifier = Modifier.fillMaxSize()) {
                item { Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 0.dp, start = 15.dp)){
                    Text(
                        text = "Round 1: Aptitude test",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                } }
                //--------------------
                item {
                    Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 10.dp, start = 15.dp, end = 15.dp, bottom = 10.dp)){
                        Text(
                            text = "The journey began with the first round, an aptitude test held at the Arcon office. " +
                                    "This round was divided into two sections: technical and non-technical. " +
                                    "The technical section, tailored to gauge the depth of my technical knowledge, " +
                                    "consisted of SQL coding questions and challenges that tested my problem-solving skills. " +
                                    "In contrast, the non-technical section delved into areas like probability.",
                            fontSize = 14.sp,
                            // fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Justify,
                            color = Color(android.graphics.Color.parseColor("#000000")),

                            )
                    }
                }
                //--------------------
                item {
                    Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 0.dp, start = 15.dp,end = 15.dp)){
                        Text(
                            text = "Round 2: The Offline Encounter",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Justify,
                            color = Color(android.graphics.Color.parseColor("#000000")),

                            )
                    }
                }
                //--------------------
                item { Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 10.dp, start = 15.dp, end = 15.dp, bottom = 10.dp)){
                    Text(
                        text = "Round 2 was an in-person interview held at Arcon’s office. " +
                                "It began with a deep dive into my resume, allowing me to narrate " +
                                "my professional journey and highlight my achievements. " +
                                "The interview then shifted gears towards the technical aspect, " +
                                "focusing on my specialization as a front-end developer. " +
                                "Additionally, questions related to indexing and SQL added an " +
                                "unexpected twist to the interview, reminding me that a holistic " +
                                "understanding of various technologies is often necessary in the dynamic tech landscape.",
                        fontSize = 14.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                } }
                //--------------------
                item { Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 0.dp, start = 15.dp, end = 15.dp)){
                    Text(
                        text = "Round 3:The Virtual Deep Dive",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                } }
                //--------------------
                item { Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 10.dp, start = 15.dp, end = 15.dp, bottom = 10.dp)){
                    Text(
                        text = "The third and final round of the Arcon interview was conducted virtually. " +
                                "This round continued to explore my proficiency in front-end development but " +
                                "went deeper into the nuances of the subject matter. The interviewers were keen " +
                                "on understanding my knowledge of Redux, React, and the intricacies of the DOM lifecycle." +
                                "This round not only tested my theoretical knowledge but also my practical skills " +
                                "and the ability to apply them in a dynamic work environment.",
                        fontSize = 14.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }}
                //--------------------
                item { Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 0.dp, start = 15.dp,bottom = 20.dp)){
                    Text(
                        text = "Final Verdict:  Not Selected",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }  }
               }
            }

        }
    }

@Composable
fun Arcon_Software_role(navController: NavController){
    Column(
        Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color(android.graphics.Color.parseColor("#eeeeee")))
            .padding(top = 32.dp, start = 10.dp, end = 10.dp),
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
                        navController.navigate(Routes.Arcon_RolesnRes.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }

                    }
            )
        }




        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp, start = 1.dp, bottom = 10.dp)
            .background(
                color = Color(android.graphics.Color.parseColor("#fdfdfd")),
                shape = RoundedCornerShape(20.dp)
            )
            .padding(5.dp)) {
            item {
                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 15.dp, start = 15.dp)){
                    Text(
                        text = "Software Development",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }
                Box (contentAlignment = Alignment.Center){
                    Text(
                        text = "Education Qualification: ",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),
                        modifier = Modifier.padding(start = 10.dp,top = 10.dp)
                        )
                }
                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)){
                    Text(
                        text = "BSC Comp, MSC Comp, BE IT, ME IT, BTECH, MTECH \n" +
                                "\nSkill Set: Windows Services, Security Domain, Requirement Gathering, Analysis, and \n" +
                                "Problem Solving, Data structure, Algorithm and Multithreading \n"
                               ,
                        fontSize = 14.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }

            }

            item {
                Box (contentAlignment = Alignment.Center){
                    Text(
                        text = "Responsibilities and Duties",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),
                        modifier = Modifier.padding(start = 10.dp,top = 10.dp)
                    )
                }
                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)){
                    Text(
                        text = "> Design & Development of .Net applications\n"+
                    "> Make modifications to existing applications"+
                    "\n> Manage the team and assign tasks & keep the timeline"+
                    "\n> Understand the algorithm, codes, flow and business behind all the existing applications"+
                    "\n> Create and update database in SQL & other modern databases"+
                   "\n> Generate APIs needed for different applications"+
                    "\n> Understand the client requirements, meet them at their location for requirement gathering"+
                    "\n> project demos etc." ,
                        fontSize = 14.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }
            }
            item {
                Box (contentAlignment = Alignment.Center){
                    Text(
                        text = "Qualifications:",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),
                        modifier = Modifier.padding(start = 10.dp,top = 10.dp)
                    )
                }
                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)){
                    Text(
                        text =
                                "> Bachelor’s or Master’s degree in Computer Engineering, Software Engineering, or a related field.\n" +
                                "> Strong programming skills in languages such as Java, Python, C++, or Kotlin.\n" +
                                "> Solid understanding of data structures, algorithms, and software architecture.\n" +
                                "> Experience in building scalable, high-performance applications, particularly in the finance or trading domain.",
                        fontSize = 14.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }
            }

            item {
                Column (horizontalAlignment = Alignment.Start, modifier = Modifier.padding(10.dp)){
                    Text(
                        text = "Salary:",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                    Text(
                        text = "CTC: 6 LPA\n",
                        fontSize = 14.sp,
                        //fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }

            }

            item {
                Button(onClick = {
                    navController.navigate(Routes.Arcon_Experience.routes) {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }


                }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                    colors =  ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color(android.graphics.Color.parseColor("#637f57")))//
                    , shape = RoundedCornerShape(20.dp),


                    )

                {
                    androidx.compose.material.Text(
                        text = "Experiences", style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 22.sp,

                            ), modifier = Modifier.padding(vertical = 6.dp),color = Color.White
                    )

                }

            }

        }
    }
}


@Composable
fun Arcon_Quality_role(navController: NavController){
    Column(
        Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color(android.graphics.Color.parseColor("#eeeeee")))
            .padding(top = 32.dp, start = 10.dp, end = 10.dp),
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
                        navController.navigate(Routes.Arcon_RolesnRes.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }

                    }
            )
        }




        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp, start = 1.dp, bottom = 10.dp)
            .background(
                color = Color(android.graphics.Color.parseColor("#fdfdfd")),
                shape = RoundedCornerShape(20.dp)
            )
            .padding(5.dp)) {
            item {
                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 15.dp, start = 15.dp)){
                    Text(
                        text = "Quality Assurance",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }
                Box (contentAlignment = Alignment.Center){
                    Text(
                        text = "Job Description",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),
                        modifier = Modifier.padding(start = 10.dp,top = 10.dp)
                    )
                }
                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)){
                    Text(
                        text = "We are looking for a results-driven software tester to be responsible for designing and running tests on \n" +
                                "ARCON’s software usability. The software tester will conduct tests, analyze the results, and report \n" +
                                "observations to the design team. You may also interact with clients in order to understand the \n" +
                                "requirements of the product.\n\n "+"To be successful as a software tester, you should have a working knowledge of software and test design, \n" +
                                "the capability to run through tests, and the ability to analyze the results. Ultimately, the software tester \n" +
                                "should be result-driven, have good communication skills, and up-to-date knowledge of software \n" +
                                "programming and software test design."
                        ,
                        fontSize = 14.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }

            }

            item {
                Box (contentAlignment = Alignment.Center){
                    Text(
                        text = "Responsibilities",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),
                        modifier = Modifier.padding(start = 10.dp,top = 10.dp)
                    )
                }
                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)){
                    Text(
                        text = "> Execute all levels of testing (System, Integration, and Regression)\n"+
                                "> Collaborate closely with other team members and departments "+
                                "\n> Design and develop automation scripts when needed "+
                                "\n> Provide timely solutions",
                        fontSize = 14.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }
            }
            item {
                Box (contentAlignment = Alignment.Center){
                    Text(
                        text = "Requirements:",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),
                        modifier = Modifier.padding(start = 10.dp,top = 10.dp)
                    )
                }
                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)){
                    Text(
                        text =
                        "> Strong knowledge of STLC (Software Testing Life Cycle) process and SQL & Scripting \n" +
                                "> Should be well versed with Manual and Automation testing using Selenium – Product Testing " +
                                "and custom solutions experience will be added advantage \n" +
                                "> Experience in UI / API testing and tools like Postman, and hands on Mobile testing is a plus. \n" +
                                "> Working knowledge of Test Case management tools. ",
                        fontSize = 14.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }
            }

            item {
                Column (horizontalAlignment = Alignment.Start, modifier = Modifier.padding(10.dp)){
                    Text(
                        text = "Salary:",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                    Text(
                        text = "CTC: 5 LPA\n",
                        fontSize = 14.sp,
                        //fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }

            }

            item {
                Button(onClick = {
                    navController.navigate(Routes.Arcon_Experience.routes) {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }


                }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                    colors =  ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color(android.graphics.Color.parseColor("#637f57")))//
                    , shape = RoundedCornerShape(20.dp),


                    )

                {
                    androidx.compose.material.Text(
                        text = "Experiences", style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 22.sp,

                            ), modifier = Modifier.padding(vertical = 6.dp),color = Color.White
                    )

                }

            }

        }
    }
}



@Composable
fun Arcon_Support_role(navController: NavController){
    Column(
        Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color(android.graphics.Color.parseColor("#eeeeee")))
            .padding(top = 32.dp, start = 10.dp, end = 10.dp),
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
                        navController.navigate(Routes.Arcon_RolesnRes.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }

                    }
            )
        }




        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp, start = 1.dp, bottom = 10.dp)
            .background(
                color = Color(android.graphics.Color.parseColor("#fdfdfd")),
                shape = RoundedCornerShape(20.dp)
            )
            .padding(5.dp)) {
            item {
                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 15.dp, start = 15.dp)){
                    Text(
                        text = "Support Engineer",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }


            }

            item {
                Box (contentAlignment = Alignment.Center){
                    Text(
                        text = "Responsibilities",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),
                        modifier = Modifier.padding(start = 10.dp,top = 10.dp)
                    )
                }
                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)){
                    Text(
                        text = "> Find technical resolutions on issues or queries related to unknown or new scenarios \n"+
                                "> Able to work & Knowledge of Windows Server "+
                                "\n> Knowledge of IIS & Dot Net."+
                                "\n> Knowledge on basic linux commands "+
                                "\n> Having Basic knowledge of SQL"+
                                "\n> Knowledge of basic network fundamentals"+
                                "\n> Manage relationships with clients "+
                                "\n> Maintain excellent customer satisfaction level" ,
                        fontSize = 14.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }
            }
            item {
                Box (contentAlignment = Alignment.Center){
                    Text(
                        text = "Qualifications:",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),
                        modifier = Modifier.padding(start = 10.dp,top = 10.dp)
                    )
                }
                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)){
                    Text(
                        text =
                        "> Telephone etiquette\n" +
                                "> Ability to balance multiple priorities. \n" +
                                "> Ability to handle difficult situations.\n" +
                                "> Excellent customer service orientation.",
                        fontSize = 14.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }
            }

            item {
                Column (horizontalAlignment = Alignment.Start, modifier = Modifier.padding(10.dp)){
                    Text(
                        text = "Salary:",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                    Text(
                        text = "CTC: 5 LPA\n",
                        fontSize = 14.sp,
                        //fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }

            }

            item {
                Button(onClick = {
                    navController.navigate(Routes.Arcon_Experience.routes) {
                        popUpTo(navController.graph.startDestinationId)
                        launchSingleTop = true
                    }


                }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                    colors =  ButtonDefaults.outlinedButtonColors(
                        backgroundColor = Color(android.graphics.Color.parseColor("#637f57")))//
                    , shape = RoundedCornerShape(20.dp),


                    )

                {
                    androidx.compose.material.Text(
                        text = "Experiences", style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 22.sp,

                            ), modifier = Modifier.padding(vertical = 6.dp),color = Color.White
                    )

                }

            }

        }
    }
}