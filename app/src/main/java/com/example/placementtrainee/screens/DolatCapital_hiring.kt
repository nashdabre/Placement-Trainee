package com.example.placementtrainee.screens


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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes





@Composable
fun Dolat_RolesnRes(navController: NavController){
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
                        navController.navigate(Routes.DolatCapital.routes) {
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
                    Text(
                        text = "Dolat Capital is a leading financial services firm specializing in equity research, " +
                                "trading, and investment advisory. We are committed to leveraging cutting-edge technology " +
                                "to optimize trading strategies, enhance research capabilities, and streamline financial operations.",
                        fontSize = 14.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }

            }

            item {

                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)){
                    Text(
                        text = "We are seeking a skilled Software Engineer to join our Financial Technology (FinTech) team. " +
                                "The ideal candidate will be responsible for designing, developing, and maintaining applications " +
                                "and systems that drive our financial services and trading platforms. You will work closely with our research, " +
                                "trading, and IT teams to build innovative, high-performance, and secure financial technology solutions.",
                        fontSize = 14.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }
            }
            item {
                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)){
                    Text(
                        text = "Key Responsibilities:\n" +
                                "> Design, develop, and maintain software applications that support trading, portfolio management, and financial analysis.\n" +
                                "> Collaborate with cross-functional teams, including traders, analysts, and researchers, to gather requirements and translate them into technical specifications.\n" +
                                "> Build and optimize high-performance algorithms for real-time data processing and trading systems.",
                        fontSize = 14.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }
            }
            item {
                Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)){
                    Text(
                        text = "Qualifications:\n" +
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
                        text = "CTC: 15 + 1.5 LPA\n",
                        fontSize = 14.sp,
                        //fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }

            }

            item {
                Button(onClick = {
                    navController.navigate(Routes.Dolat_Experience.routes) {
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
fun Dolat_Experience(navController: NavController){
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
                        navController.navigate(Routes.Dolat_RolesnRes.routes) {
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
                                navController.navigate(Routes.Wissen_chhand.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }
                            }
                    )

                }
                Text(
                    text = "Chhand",
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
                                navController.navigate(Routes.Dolat_Necole.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }

                            }
                    )

                }
                Text(
                    text = "Necole",
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
fun Dolat_Necole(navController: NavController){
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
                        navController.navigate(Routes.Dolat_Experience.routes) {
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
                        text = "Round 1: Coding",
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
                            text = "We were given three programs to be completed in 2 hours.one program was difficult and two others were very simple.each program had different weightage" +
                                    "\n> Program 1 (highest weightage)\n" +
                                    "Insert & delete a integer value in a linked list from either end.i.e insertion and deletion should be from one end only.also find the maximum value in the linked list at any point." +
                                    "all the operations on this ADT needs to be done in constant time complexity."+
                                    "\n> Program 2 (medium weightage)\n" +
                                    "It was to write a code for quicksort.",
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
                            text = "Round 2: Apitude: quants and C input output",
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
                        text = "It was a pen and paper round.\n" +
                                "There were 20 C input output questions and 10 aptitude questions and there was a negative marking.\n" +
                                "due to negative marking,questions were tough as options were very close like,\n" +
                                "a) program gives warning and gives output ….\n" +
                                "b) compile time error\n" +
                                "c) runtime error\n" +
                                "d) executes with output …..\n" +
                                "\n" +
                                "Quants questions were a very easy with just some complex calculations is some cases." +
                                "i guess total time was 40 mins for this test but it was sufficient to solve all the questions." +
                                "\n" +
                                "After some days total 11 students were shortlisted for the interview.",
                        fontSize = 14.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                } }
                //--------------------
                item { Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 0.dp, start = 15.dp, end = 15.dp)){
                    Text(
                        text = "Round 3:interview",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                } }
                //--------------------
                item { Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 10.dp, start = 15.dp, end = 15.dp, bottom = 10.dp)){
                    Text(
                        text = "Basic questions yet tricky on C. like static, global,extern, diff between static global and global." +
                                "some code was given where variable was used before definition how to fix it.\n" +
                                "ans:use extern to declare the variable and compiler will find the definition afterwards" +
                                "\n" +
                                "A puzzle was asked ,where a silver rod of 7 units to be broken in 3 parts to pay a employee a wage who is going to work for 7 days.\n" +
                                "Being a very small set of solutions i was able to do bruteforce and some logical thinking and came up with answer quickly.\n" +
                                "\n" +
                                "Afterwards interviewer asked on memory leak and some complicated cases where a memory leak can happen.\n" +
                                "\n",
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
                //--------------------
                item { /*Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(10.dp)){
                    Text(
                        text = "> 10 MCQ-based questions on Space complexity, Time complexity, Basic Algorithm, and Pseudocode\n" +
                                "> Coding Questions (Only the most optimal solutions were fully-accepted):\n" +
                                "       - Count Pairs with a given sum in an array\n" +
                                "       - One Class implementation Question, based \n       on the integration (strictly to be coded in Java \n       language).",
                        fontSize = 16.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }*/}
            }

        }
    }
}