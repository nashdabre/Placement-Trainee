package com.example.placementtrainee.screens



import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.OutlinedButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.os.LocaleListCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import coil.compose.rememberAsyncImagePainter
import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes
import com.example.placementtrainee.utils.SharedPref
import com.example.placementtrainee.viewModel.AuthViewModel
import java.time.LocalDate

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun Home(navController: NavHostController) {
    val authViewModel: AuthViewModel = viewModel()
    val firebaseUser by authViewModel.firebaseUser.observeAsState(null)
    val context = LocalContext.current
    val day = LocalDate.now().dayOfWeek
    val date = LocalDate.now()

    var showDialog by remember { mutableStateOf(false) }

    /*if (showDialog) {
        language(navController = navController, onDismiss = { showDialog = false })
    }*/


    Text(
        text = "${LocalDate.now().dayOfWeek}, ${LocalDate.now()}",
        color = Color.Gray,
        fontSize = 12.sp
    )



    Scaffold (floatingActionButton = {
        FloatingActionButton(
            onClick = {
                navController.navigate(Routes.Chatbot.routes) {
                    popUpTo(navController.graph.startDestinationId)
                    launchSingleTop = true
                }
            },
            containerColor = Color.Gray,//Color(0xFF1A237E), // Dark blue to match the top bar
            contentColor = Color.White
        ) {
            Image(
                painter = painterResource(id = R.drawable.chatbot),
                contentDescription = null,

                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .padding(7.dp)
                    .clickable {
                        navController.navigate(Routes.Chatbot.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }

                    },

                )
        }
    }){

        Image(
            painter = painterResource(id = R.drawable.back1), contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )
    Column(
        Modifier

            //.background(color = Color(android.graphics.Color.parseColor("#00ffff")))
            .padding(top = 32.dp, start = 16.dp, end = 16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        //val(text,logo,username) = createRefs()
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = rememberAsyncImagePainter(model = SharedPref.getImage(context)),
                contentDescription = null,
                modifier = Modifier
                    .width(60.dp)
                    .clip(CircleShape)
                    .height(60.dp)
                    .clickable {}
                    .background(Color.LightGray)
            )

        Spacer(modifier = Modifier.width(20.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 0.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()

                ) {
                    Text(
                        text = "hello" + ", ",
                        color = androidx.compose.ui.graphics.Color.White,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 10.dp)
                    )
                    Text(
                        text = SharedPref.getName(context),
                        color = Color(android.graphics.Color.parseColor("#D8E94C")),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.padding(start = 70.dp))




                }
                //  val timeFormat = DateFormat.getTimeInstance(DateFormat.SHORT).format(calendar)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()

                ) {
                    Text(
                        text = "$day, ",
                        color = androidx.compose.ui.graphics.Color.Gray,
                        fontSize = 16.sp,
                        //   fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 10.dp)
                    )
                    Text(
                        text = "$date",
                        color = androidx.compose.ui.graphics.Color.Gray,
                        fontSize = 16.sp,
                        // fontWeight = FontWeight.Bold,
                        // modifier = Modifier.padding(start = 10.dp)
                    )

                }

            }




        }

        Spacer(modifier = Modifier.height(60.dp))

        var text by rememberSaveable { mutableStateOf("") }

        TextField(modifier = Modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(20.dp))
            ,
            value = text, onValueChange = { text = it },
            label = { Text(text = "search for") },
            trailingIcon = {
                Box(
                    modifier = Modifier
                        .padding(end = 6.dp)
                        .height(45.dp)
                        .width(45.dp)

                ){
                    Image(
                        painter = painterResource(id = R.drawable.search),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(7.dp)
                            .clickable {
                                navController.navigate(Routes.Interview.routes) {
                                    popUpTo(navController.graph.startDestinationId)
                                    launchSingleTop = true
                                }
                            }
                    )
                }
            })
                LaunchedEffect(firebaseUser) {
                    if (firebaseUser == null) {
                        navController.navigate(Routes.Login.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }
                    }
                }



                LazyRow(
                    modifier = Modifier.padding(top = 35.dp),
                    horizontalArrangement = Arrangement.Start
                ) {


                    item {
                        Column(
                            modifier = Modifier.padding(start = 2.dp),
                            horizontalAlignment = Alignment.Start
                        ) {


                            Box(
                                modifier = Modifier
                                    .height(55.dp)
                                    .width(55.dp)
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#eeeeee")),
                                        shape = RoundedCornerShape(15.dp)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {

                                Image(
                                    painter = painterResource(id = R.drawable.interview),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(7.dp)
                                        .clickable {
                                            navController.navigate(Routes.Interview.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }
                                        }
                                )

                            }
                            Text(
                                text = "Interview",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                    //---------------------------
                    item {
                        Column(
                            modifier = Modifier.padding(start = 17.dp),
                            horizontalAlignment = Alignment.Start
                        ) {


                            Box(
                                modifier = Modifier
                                    .height(55.dp)
                                    .width(55.dp)
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#eeeeee")),
                                        shape = RoundedCornerShape(15.dp)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {

                                Image(
                                    painter = painterResource(id = R.drawable.quiz),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(7.dp)
                                        .clickable {
                                            navController.navigate(Routes.Quiz.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }

                                        }
                                )

                            }
                            Text(
                                text = "Quiz",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(top = 8.dp, start = 10.dp)
                            )
                        }
                    }
                    //---------------------------
                    item {
                        Column(
                            modifier = Modifier.padding(start = 24.dp),
                            horizontalAlignment = Alignment.Start
                        ) {


                            Box(
                                modifier = Modifier
                                    .height(55.dp)
                                    .width(55.dp)

                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#eeeeee")),
                                        shape = RoundedCornerShape(15.dp)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {

                                Image(
                                    painter = painterResource(id = R.drawable.aware),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(7.dp)
                                        .clickable {
                                            navController.navigate(Routes.Articels.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }

                                        }
                                )

                            }
                            Text(
                                text = "Videos",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                    //---------------------------
                    item {
                        Column(
                            modifier = Modifier.padding(start = 23.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {


                            Box(
                                modifier = Modifier
                                    .height(55.dp)
                                    .width(55.dp)
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#eeeeee")),
                                        shape = RoundedCornerShape(15.dp)
                                    ),
                                contentAlignment = Alignment.CenterEnd
                            ) {

                                Image(
                                    painter = painterResource(id = R.drawable.resume),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(7.dp)
                                        .clickable {
                                            navController.navigate(Routes.ResumeInnerPage.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }

                                        }
                                )

                            }
                            Text(
                                text = "Resume",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                    //---------------------------

                    //---------------------------
                    item {
                        Column(
                            modifier = Modifier.padding(start = 23.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {


                            Box(
                                modifier = Modifier
                                    .height(55.dp)
                                    .width(55.dp)
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#eeeeee")),
                                        shape = RoundedCornerShape(15.dp)
                                    ),
                                contentAlignment = Alignment.CenterEnd
                            ) {

                                Image(
                                    painter = painterResource(id = R.drawable.code),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(7.dp)
                                        .clickable {
                                            navController.navigate(Routes.Coding.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }

                                        }
                                )

                            }
                            Text(
                                text = "Coding",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                    //----------------------------------------------------------------------------
                    item {
                        Column(
                            modifier = Modifier.padding(start = 23.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {


                            Box(
                                modifier = Modifier
                                    .height(55.dp)
                                    .width(55.dp)
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#eeeeee")),
                                        shape = RoundedCornerShape(15.dp)
                                    ),
                                contentAlignment = Alignment.CenterEnd
                            ) {

                                Image(
                                    painter = painterResource(id = R.drawable.career),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(7.dp)
                                        .clickable {
                                            navController.navigate(Routes.CareerPlan.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }

                                        }
                                )

                            }
                            Text(
                                text = "Career",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(top = 8.dp)
                            )
                        }
                    }
                // ----------------------------------------------------------------------------

                    //---------------------------
                    item {
                        Column(
                            modifier = Modifier.padding(start = 17.dp),
                            horizontalAlignment = Alignment.Start
                        ) {


                            Box(
                                modifier = Modifier
                                    .height(55.dp)
                                    .width(55.dp)
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#eeeeee")),
                                        shape = RoundedCornerShape(15.dp)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {

                                Image(
                                    painter = painterResource(id = R.drawable.course),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(7.dp)
                                        .clickable {
                                            navController.navigate(Routes.Course.routes) {
                                                popUpTo(navController.graph.startDestinationId)
                                                launchSingleTop = true
                                            }

                                        }
                                )

                            }
                            Text(
                                text = "Course",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(android.graphics.Color.parseColor("#000000")),
                                modifier = Modifier.padding(top = 8.dp, start = 10.dp)
                            )
                        }
                    }

                    //----------------------------------------------------------------------------
                    // ----------------------------------------------------------------------------


                    //----------------------------------------------------------------------------
                    // ----------------------------------------------------------------------------


                }
//---------------------------------------------------------------------------------------
                Spacer(modifier = Modifier.height(20.dp))

                Column(horizontalAlignment = Alignment.End) {
                    Text(
                        text = "My Progress",
                        fontSize = 19.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(android.graphics.Color.parseColor("#000000")),

                        )
                }


//-----------------------------------------------------------------
                //-----------------------------------------
                LazyColumn(
                    modifier = Modifier
                        .padding(4.dp)
                        .height(280.dp)
                        .background(
                            color = Color(android.graphics.Color.parseColor("#fafafa")),
                            shape = RoundedCornerShape(15.dp)
                        )

                ) {

                    item {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 8.dp)
                        ) {

                            Column(
                                Modifier
                                    .weight(0.5f)
                                    .height(85.dp)
                                    .padding(top = 4.dp, end = 3.dp)
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#eeeeee")),
                                        shape = RoundedCornerShape(20.dp)
                                    )
                                    .padding(top = 8.dp, start = 8.dp),
                            ) {

                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 0.dp),

                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .height(60.dp)
                                            .width(60.dp)
                                            .padding(end = 4.dp)
                                            .background(
                                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                                shape = RoundedCornerShape(20.dp)
                                            ),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.logical),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(7.dp)
                                                .clickable {
                                                    navController.navigate(Routes.Youtube0.routes) {
                                                        popUpTo(navController.graph.startDestinationId)
                                                        launchSingleTop = true
                                                    }

                                                }
                                        )
                                    }

                                    Spacer(modifier = Modifier.width(10.dp))

                                    Column(
                                        Modifier.width(190.dp),

                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(start = 6.dp, end = 4.dp)
                                                .height(25.dp)
                                            // .background(
                                            //  color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                                            // shape = RoundedCornerShape(20.dp))
                                            , contentAlignment = Alignment.TopStart
                                        ) {
                                            Text(
                                                text = "Logical Reasoning",
                                                fontSize = 19.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = Color(android.graphics.Color.parseColor("#000000"))
                                            )

                                        }

                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(start = 6.dp, end = 4.dp)
                                                .height(20.dp)
                                            // .background(
                                            //  color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                                            // shape = RoundedCornerShape(20.dp))
                                            , contentAlignment = Alignment.TopStart
                                        ) {
                                            Text(
                                                text = "Direction and Work",
                                                fontSize = 14.sp,
                                                //  fontWeight = FontWeight.Bold,
                                                color = Color.Black
                                            )

                                        }


                                        Row(modifier = Modifier.padding(start = 7.dp)) {


                                            Box(
                                                modifier = Modifier
                                                    .clip(RoundedCornerShape(10.dp))
                                                    .height(17.dp)
                                                    .background(color = Color.Gray)
                                                    .width(400.dp),


                                                ) {
                                                Box(
                                                    modifier = Modifier
                                                        .background(color = Color.Green)
                                                        .width(145.dp)
                                                )
                                                {
                                                    Text(
                                                        text = "75%",
                                                        modifier = Modifier.align(Alignment.Center),
                                                        fontSize = 12.sp,
                                                        fontWeight = FontWeight.Bold,
                                                        color = Color.White
                                                    )
                                                }
                                            }
                                        }


                                    }


                                }


                            }

                        }
                    }
                    //----------------------------------------------------------------------------

                    //-------------------------------------------------------------
                    item {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 8.dp)
                        ) {

                            Column(
                                Modifier
                                    .weight(0.5f)
                                    .height(85.dp)
                                    .padding(top = 4.dp, end = 3.dp)
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#eeeeee")),
                                        shape = RoundedCornerShape(20.dp)
                                    )
                                    .padding(top = 8.dp, start = 8.dp),
                            ) {

                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 0.dp),

                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .height(60.dp)
                                            .width(60.dp)
                                            .padding(end = 4.dp)
                                            .background(
                                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                                shape = RoundedCornerShape(20.dp)
                                            ),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.quantitative),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(7.dp)
                                                .clickable {
                                                    navController.navigate(Routes.Quiz.routes) {
                                                        popUpTo(navController.graph.startDestinationId)
                                                        launchSingleTop = true
                                                    }

                                                }
                                        )
                                    }

                                    Spacer(modifier = Modifier.width(10.dp))

                                    Column(
                                        Modifier.width(190.dp),

                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(start = 6.dp, end = 4.dp)
                                                .height(25.dp)
                                            // .background(
                                            //  color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                                            // shape = RoundedCornerShape(20.dp))
                                            , contentAlignment = Alignment.TopStart
                                        ) {
                                            Text(
                                                text = "Quantitative",
                                                fontSize = 19.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = Color(android.graphics.Color.parseColor("#000000"))
                                            )

                                        }

                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(start = 6.dp, end = 4.dp)
                                                .height(20.dp)
                                            // .background(
                                            //  color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                                            // shape = RoundedCornerShape(20.dp))
                                            , contentAlignment = Alignment.TopStart
                                        ) {
                                            Text(
                                                text = "Speed n Distance",
                                                fontSize = 14.sp,
                                                //  fontWeight = FontWeight.Bold,
                                                color = Color.Black
                                            )

                                        }


                                        Row(modifier = Modifier.padding(start = 7.dp)) {


                                            Box(
                                                modifier = Modifier
                                                    .clip(RoundedCornerShape(10.dp))
                                                    .height(17.dp)
                                                    .background(color = Color.Gray)
                                                    .width(400.dp),


                                                ) {
                                                Box(
                                                    modifier = Modifier
                                                        .background(color = Color.Green)
                                                        .width(95.dp)
                                                )
                                                {
                                                    Text(
                                                        text = "50%",
                                                        modifier = Modifier.align(Alignment.Center),
                                                        fontSize = 12.sp,
                                                        fontWeight = FontWeight.Bold,
                                                        color = Color.White
                                                    )
                                                }
                                            }
                                        }


                                    }


                                }


                            }

                        }
                    }

                    //-----------------------------------------------------
                    item {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 8.dp)
                        ) {

                            Column(
                                Modifier
                                    .weight(0.5f)
                                    .height(85.dp)
                                    .padding(top = 4.dp, end = 3.dp)
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#eeeeee")),
                                        shape = RoundedCornerShape(20.dp)
                                    )
                                    .padding(top = 8.dp, start = 8.dp),
                            ) {

                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 0.dp),

                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .height(60.dp)
                                            .width(60.dp)
                                            .padding(end = 4.dp)
                                            .background(
                                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                                shape = RoundedCornerShape(20.dp)
                                            ),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.fundamentals),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(7.dp)
                                                .clickable {
                                                    navController.navigate(Routes.Youtube0.routes) {
                                                        popUpTo(navController.graph.startDestinationId)
                                                        launchSingleTop = true
                                                    }

                                                }
                                        )
                                    }

                                    Spacer(modifier = Modifier.width(10.dp))

                                    Column(
                                        Modifier.width(190.dp),

                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(start = 6.dp, end = 4.dp)
                                                .height(25.dp)
                                            // .background(
                                            //  color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                                            // shape = RoundedCornerShape(20.dp))
                                            , contentAlignment = Alignment.TopStart
                                        ) {
                                            Text(
                                                text = "Fundamentals",
                                                fontSize = 19.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = Color(android.graphics.Color.parseColor("#000000"))
                                            )

                                        }

                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(start = 6.dp, end = 4.dp)
                                                .height(20.dp)
                                            // .background(
                                            //  color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                                            // shape = RoundedCornerShape(20.dp))
                                            , contentAlignment = Alignment.TopStart
                                        ) {
                                            Text(
                                                text = "Operating System",
                                                fontSize = 14.sp,
                                                //  fontWeight = FontWeight.Bold,
                                                color = Color.Black
                                            )

                                        }


                                        Row(modifier = Modifier.padding(start = 7.dp)) {


                                            Box(
                                                modifier = Modifier
                                                    .clip(RoundedCornerShape(10.dp))
                                                    .height(17.dp)
                                                    .background(color = Color.Gray)
                                                    .width(400.dp),


                                                ) {
                                                Box(
                                                    modifier = Modifier
                                                        .background(color = Color.Green)
                                                        .width(60.dp)
                                                )
                                                {
                                                    Text(
                                                        text = "30%",
                                                        modifier = Modifier.align(Alignment.Center),
                                                        fontSize = 12.sp,
                                                        fontWeight = FontWeight.Bold,
                                                        color = Color.White
                                                    )
                                                }
                                            }
                                        }


                                    }


                                }


                            }

                        }
                    }
                    //--------------------------------------------------
                    item {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 8.dp)
                        ) {

                            Column(
                                Modifier
                                    .weight(0.5f)
                                    .height(85.dp)
                                    .padding(top = 4.dp, end = 3.dp)
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#eeeeee")),
                                        shape = RoundedCornerShape(20.dp)
                                    )
                                    .padding(top = 8.dp, start = 8.dp),
                            ) {

                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 0.dp),

                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .height(60.dp)
                                            .width(60.dp)
                                            .padding(end = 4.dp)
                                            .background(
                                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                                shape = RoundedCornerShape(20.dp)
                                            ),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.programming),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(7.dp)
                                                .clickable {
                                                    navController.navigate(Routes.Youtube0.routes) {
                                                        popUpTo(navController.graph.startDestinationId)
                                                        launchSingleTop = true
                                                    }

                                                }
                                        )
                                    }

                                    Spacer(modifier = Modifier.width(10.dp))

                                    Column(
                                        Modifier.width(190.dp),

                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(start = 6.dp, end = 4.dp)
                                                .height(25.dp)
                                            // .background(
                                            //  color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                                            // shape = RoundedCornerShape(20.dp))
                                            , contentAlignment = Alignment.TopStart
                                        ) {
                                            Text(
                                                text = "Programming",
                                                fontSize = 19.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = Color(android.graphics.Color.parseColor("#000000"))
                                            )

                                        }

                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(start = 6.dp, end = 4.dp)
                                                .height(20.dp)
                                            // .background(
                                            //  color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                                            // shape = RoundedCornerShape(20.dp))
                                            , contentAlignment = Alignment.TopStart
                                        ) {
                                            Text(
                                                text = "Java",
                                                fontSize = 14.sp,
                                                //  fontWeight = FontWeight.Bold,
                                                color = Color.Black
                                            )

                                        }


                                        Row(modifier = Modifier.padding(start = 7.dp)) {


                                            Box(
                                                modifier = Modifier
                                                    .clip(RoundedCornerShape(10.dp))
                                                    .height(17.dp)
                                                    .background(color = Color.Gray)
                                                    .width(400.dp),


                                                ) {
                                                Box(
                                                    modifier = Modifier
                                                        .background(color = Color.Green)
                                                        .width(148.dp)
                                                )
                                                {
                                                    Text(
                                                        text = "80%",
                                                        modifier = Modifier.align(Alignment.Center),
                                                        fontSize = 12.sp,
                                                        fontWeight = FontWeight.Bold,
                                                        color = Color.White
                                                    )
                                                }
                                            }
                                        }


                                    }


                                }


                            }

                        }
                    }

                    //-----------------------------------------------------------------------
                    item {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 8.dp)
                        ) {

                            Column(
                                Modifier
                                    .weight(0.5f)
                                    .height(85.dp)
                                    .padding(top = 4.dp, end = 3.dp)
                                    .background(
                                        color = Color(android.graphics.Color.parseColor("#eeeeee")),
                                        shape = RoundedCornerShape(20.dp)
                                    )
                                    .padding(top = 8.dp, start = 8.dp),
                            ) {

                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 0.dp),

                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .height(60.dp)
                                            .width(60.dp)
                                            .padding(end = 4.dp)
                                            .background(
                                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                                shape = RoundedCornerShape(20.dp)
                                            ),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.quantitative),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(7.dp)
                                                .clickable {
                                                    navController.navigate(Routes.Youtube0.routes) {
                                                        popUpTo(navController.graph.startDestinationId)
                                                        launchSingleTop = true
                                                    }

                                                }
                                        )
                                    }

                                    Spacer(modifier = Modifier.width(10.dp))

                                    Column(
                                        Modifier.width(190.dp),

                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(start = 6.dp, end = 4.dp)
                                                .height(25.dp)
                                            // .background(
                                            //  color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                                            // shape = RoundedCornerShape(20.dp))
                                            , contentAlignment = Alignment.TopStart
                                        ) {
                                            Text(
                                                text = "Quantitative",
                                                fontSize = 19.sp,
                                                fontWeight = FontWeight.Bold,
                                                color = Color(android.graphics.Color.parseColor("#000000"))
                                            )

                                        }

                                        Box(
                                            modifier = Modifier
                                                .fillMaxWidth()
                                                .padding(start = 6.dp, end = 4.dp)
                                                .height(20.dp)
                                            // .background(
                                            //  color = Color(android.graphics.Color.parseColor("#Dad9ff")),
                                            // shape = RoundedCornerShape(20.dp))
                                            , contentAlignment = Alignment.TopStart
                                        ) {
                                            Text(
                                                text = "Profit n Loss",
                                                fontSize = 14.sp,
                                                //  fontWeight = FontWeight.Bold,
                                                color = Color.Black
                                            )

                                        }


                                        Row(modifier = Modifier.padding(start = 7.dp)) {


                                            Box(
                                                modifier = Modifier
                                                    .clip(RoundedCornerShape(10.dp))
                                                    .height(17.dp)
                                                    .background(color = Color.Gray)
                                                    .width(400.dp),


                                                ) {
                                                Box(
                                                    modifier = Modifier
                                                        .background(color = Color.Green)
                                                        .width(105.dp)
                                                )
                                                {
                                                    Text(
                                                        text = "60%",
                                                        modifier = Modifier.align(Alignment.Center),
                                                        fontSize = 12.sp,
                                                        fontWeight = FontWeight.Bold,
                                                        color = Color.White
                                                    )
                                                }
                                            }
                                        }


                                    }


                                }


                            }

                        }
                    }
                    //------------------------------------------------------
                }


//-------------------------------------------------------------------------


    }
    }
}










