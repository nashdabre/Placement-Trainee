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
import androidx.compose.foundation.layout.wrapContentSize
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes


@Composable
fun Wissen_Chhand(navController: NavController){
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
                         navController.navigate(Routes.Wissen_Experience.routes) {
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
                        text = "Round 1: Coding Round",
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
                            text = "> 10 MCQ-based questions on Space complexity, Time complexity, Basic Algorithm, and Pseudocode" +
                                    "\n> Coding Questions (Only the most optimal solutions were fully-accepted):\n" +
                                    "   - Count Pairs with a given sum in an array\n" +
                                    "   - One Class implementation Question, based \n     on the integration (strictly to be coded in \n     Java language).",
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
                            text = "Round 2: Technical Interview 1 (60 minutes)",
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
                        text = "> Concept of oops such as inheritance, polymorphism, abstraction, encapsulation and explain each one.\n" +
                                "> Asked about my Project( which was based on Spring Boot) and asked me to code any API function introduced newly in Java8 (I coded Time-API )\n"
                                 +"> What are Joins and their types?\n"
                                +"> What is Cache and its Levels?",
                        fontSize = 14.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                } }
                //--------------------
                item { Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 0.dp, start = 15.dp, end = 15.dp)){
                    Text(
                        text = "Round 3: Technical Interview 2 (45 minutes)",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                } }
                //--------------------
                item { Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 10.dp, start = 15.dp, end = 15.dp, bottom = 10.dp)){
                    Text(
                        text = "> Do I have any offer in hand from some other company?\n" +
                                "> Concepts of Operating systems include deadlock(prevention Algo), Paging, Semaphore, Mutual Exclusion, Critical Section, and Virtual Memory.\n" +
                                "> Polymorphism, its types, and uses.\n" +
                                "> Indexing in DBMS and its types.\n" +
                                "> Asked me about the city I was living in and some tourist places.\n",
                        fontSize = 14.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }}
                //--------------------
                item { Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 0.dp, start = 15.dp,bottom = 20.dp)){
                    Text(
                        text = "Final Verdict:  Got Selected",
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

@Composable
fun Wissen_Crystal(navController: NavController){
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
                         navController.navigate(Routes.Wissen_Experience.routes) {
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
                        text = "Round 1: Coding Round",
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
                            text = "> 10 MCQ-based questions on Space complexity, Time complexity, Basic Algorithm, and Pseudocode\n" +
                                    "> Coding Questions (Only the most optimal solutions were fully-accepted):\n" +
                                    "    - Count Pairs with a given sum in an array\n" +
                                    "   - One Class implementation Question, based \n     on the integration (strictly to be coded in \n     Java language).",
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
                            text = "Round 2: Technical Interview 1 (60 minutes)",
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
                        text = "> Concept of oops such as inheritance, polymorphism, abstraction, encapsulation and explain each one.\n" +
                                "> Asked about my Project( which was based on Spring Boot) and asked me to code any API function introduced newly in Java8 (I coded Time-API )\n"
                                +"> What are Joins and their types?\n"
                                +"> What is Cache and its Levels?",
                        fontSize = 14.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                } }
                //--------------------
                item { Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 0.dp, start = 15.dp, end = 15.dp)){
                    Text(
                        text = "Round 3: Technical Interview3 + HR Round (30 minutes)",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                } }
                //--------------------
                item { Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 10.dp, start = 15.dp, end = 15.dp, bottom = 10.dp)){
                    Text(
                        text = "> Introduce yourself.\n" +
                                "> Can you relocate? Why not only Gurugram?\n" +
                                "> Polymorphism, its types, and uses.\n" +
                                "> Indexing in DBMS and its types.\n" +
                                "> Asked me about the city I was living in and some tourist places.\n",
                        fontSize = 14.sp,
                        // fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }}
                //--------------------
                item { Box (contentAlignment = Alignment.Center, modifier = Modifier.padding(top = 0.dp, start = 15.dp, bottom = 20.dp)){
                    Text(
                        text = "Final Verdict:  Got Selected",
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


@Composable
fun Wissen_Experience(navController: NavController){
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
                         navController.navigate(Routes.Wissen_RolesnRes.routes) {
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
                            navController.navigate(Routes.Wissen_crsytal.routes) {
                                popUpTo(navController.graph.startDestinationId)
                                launchSingleTop = true
                            }

                        }
                )

            }
            Text(
                text = "Crsytal",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(android.graphics.Color.parseColor("#000000")),
                modifier = Modifier.padding(top = 8.dp, start = 10.dp)
            )
        }
        //----------------------------------------------------------------------------
        // ----------------------------------------------------------------------------

        Column(
            modifier = Modifier.padding(start = 29.dp),
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
                    painter = painterResource(id = R.drawable.boy2),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(7.dp)
                        .clickable {
//                            navController.navigate(Routes.Articels.routes) {
//                                popUpTo(navController.graph.startDestinationId)
//                                launchSingleTop = true
//                            }

                        }
                )

            }
            Text(
                text = "Mathav",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(android.graphics.Color.parseColor("#000000")),
                modifier = Modifier.padding(top = 8.dp)
            )
        }
        //----------------------------------------------------------------------------
        // ----------------------------------------------------------------------------

        Column(
            modifier = Modifier.padding(start = 28.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Box(
                modifier = Modifier
                    .height(55.dp)
                    .width(55.dp)
                    .background(
                        color = Color(android.graphics.Color.parseColor("#ffffff")),
                        shape = RoundedCornerShape(15.dp)
                    ),
                contentAlignment = Alignment.CenterEnd
            ) {

                Image(
                    painter = painterResource(id = R.drawable.boy1),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(7.dp)
                        .clickable {


                        }
                )

            }
            Text(
                text = "Jonathan",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(android.graphics.Color.parseColor("#000000")),
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
//-------------------------------------------------------------
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
                        painter = painterResource(id = R.drawable.boy2),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
//                            navController.navigate(Routes.Interview.routes) {
//                                popUpTo(navController.graph.startDestinationId)
//                                launchSingleTop = true
//                            }
                            }
                    )

                }
                Text(
                    text = "Rishab",
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
                        painter = painterResource(id = R.drawable.girl2),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                /*navController.navigate(Routes.Quiz.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }*/

                            }
                    )

                }
                Text(
                    text = "Janvi",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(android.graphics.Color.parseColor("#000000")),
                    modifier = Modifier.padding(top = 8.dp, start = 10.dp)
                )
            }
            //----------------------------------------------------------------------------
            // ----------------------------------------------------------------------------

            Column(
                modifier = Modifier.padding(start = 29.dp),
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
//                            navController.navigate(Routes.Articels.routes) {
//                                popUpTo(navController.graph.startDestinationId)
//                                launchSingleTop = true
//                            }

                            }
                    )

                }
                Text(
                    text = "Samarth",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(android.graphics.Color.parseColor("#000000")),
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
            //----------------------------------------------------------------------------
            // ----------------------------------------------------------------------------

            Column(
                modifier = Modifier.padding(start = 28.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Box(
                    modifier = Modifier
                        .height(55.dp)
                        .width(55.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#ffffff")),
                            shape = RoundedCornerShape(15.dp)
                        ),
                    contentAlignment = Alignment.CenterEnd
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.girl1),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {


                            }
                    )

                }
                Text(
                    text = "Seema",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(android.graphics.Color.parseColor("#000000")),
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}


@Composable
fun Wissen_RolesnRes(navController: NavController){
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
                         navController.navigate(Routes.Wissen.routes) {
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
                        text = "Wissen Technology is looking for brilliant technologists to build best-in-class solutions. The " +
                                "company is in rapid growth mode and you can help build this young organization. Our" +
                                "leadership team will offer you training, experience and opportunities to build the foundation of a" +
                                "successful career in technology.",
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
                        text = "Your responsibilities would include building software for startups, ecommerce , banks and" +
                                "financial institutions, and telecom companies. We have over 50 clients including Flipkart," +
                                "Swiggy, Morgan Stanley, Goldman Sachs, UpGrad, JustInvest, Rakuten, COLT, Capital One," +
                                "4Tigo, Fidelity and other Fortune 500 companies.",
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
                        text = "The technology stack mainly includes –\n" +
                                "- Core Java\n" +
                                "- Web Services\n" +
                                "- Databases\n" +
                                "- Angular / React",
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
                        text = "A successful candidate will be\n" +
                                "- passionate about technology and building  software\n" +
                                "- good at solving problems\n" +
                                "- eager to learn the domain of finance\n" +
                                "- highly motivated and self-driven",
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
                        text = "CTC: 8 + 1.5 LPA\n",
                        fontSize = 14.sp,
                        //fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Justify,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }

            }

            item {
                Button(onClick = {
                    navController.navigate(Routes.Wissen_Experience.routes) {
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

