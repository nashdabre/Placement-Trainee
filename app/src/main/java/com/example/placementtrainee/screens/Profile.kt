package com.example.placementtrainee.screens



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes
import com.example.placementtrainee.utils.SharedPref



@Composable
fun SettingsItem(
    icon: ImageVector,
    title: String,
    hasChevron: Boolean = false,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = title,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.weight(1f)
        )
        if (hasChevron) {
            Icon(
                imageVector = Icons.Default.ChevronRight,
                contentDescription = "Navigate",
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

// Main Screen
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun ProfileScreen(navController: NavController) {


    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Profile",modifier = Modifier.padding(start = 10.dp),fontSize = 24.sp,fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = { },
                        modifier = Modifier
                            .width(62.dp)
                            .padding(start = 10.dp)) {
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
                    }
                },
                    colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF1A237E), // Dark blue background
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        },

    ) { padding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(Color.White),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item{
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .background(
                            brush = Brush.verticalGradient(
                                colors = listOf(
                                    Color(0xFF1A237E), // Dark blue
                                    Color(0xFF3F51B5)  // Lighter blue
                                )
                            )
                        )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp,top = 16.dp),
                        //verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = rememberAsyncImagePainter(model = SharedPref.getImage(context)),
                            contentDescription = null,
                            modifier = Modifier

                                .width(90.dp)
                                .clip(CircleShape)
                                .height(90.dp)
                                .clickable {}
                                .background(Color.DarkGray)

                        )
                        Spacer(modifier = Modifier.width(30.dp))
                            Column(modifier = Modifier.padding(top = 20.dp)) {
                                Text(
                                    text = "Name: " + SharedPref.getName(context),
                                    style = MaterialTheme.typography.titleLarge,
                                    color = Color.White
                                )
                                Text(
                                    text = "Email: " +SharedPref.getEmail(context),
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = Color.White.copy(alpha = 0.7f)
                                )
                            }











                    }
                }
            }
            item {

            }
            item {
                Text(
                    text = "Account Settings",
                    style = MaterialTheme.typography.titleSmall,
                    modifier = Modifier.padding(start = 16.dp, top = 16.dp, bottom = 8.dp)
                )
            }
            item {
                SettingsItem(
                    icon = Icons.Default.Person,
                    title = "Personal Information",
                    hasChevron = true,
                    onClick = {}
                )
            }
            item {
                SettingsItem(
                    icon = Icons.Default.Lock,
                    title = "Password & Security",
                    hasChevron = true,
                    onClick = {}
                )
            }
            item {
                SettingsItem(
                    icon = Icons.Default.Notifications,
                    title = "Notifications Preferences",
                    hasChevron = true,
                    onClick = {}
                )
            }
            item {
                Text(
                    text = "Community Settings",
                    style = MaterialTheme.typography.titleSmall,
                    modifier = Modifier.padding(start = 16.dp, top = 16.dp, bottom = 8.dp)
                )
            }

            item {
                SettingsItem(
                    icon = Icons.Default.List,
                    title = "Following List",
                    hasChevron = true,
                    onClick = {}
                )
            }
            item {
                Text(
                    text = "Other",
                    style = MaterialTheme.typography.titleSmall,
                    modifier = Modifier.padding(start = 16.dp, top = 16.dp, bottom = 8.dp)
                )
            }
            item {
                SettingsItem(
                    icon = Icons.Default.Help,
                    title = "FAQ",
                    hasChevron = true,
                    onClick = {
                        navController.navigate(Routes.FAQ.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }
                    }
                )
            }
            item {
                SettingsItem(
                    icon = Icons.Default.Info,
                    title = "Help Center",
                    hasChevron = true,
                    onClick = {}
                )
            }
        }
        FloatingActionButton(
            onClick = {
                navController.navigate(Routes.Chatbot.routes) {
                    popUpTo(navController.graph.startDestinationId)
                    launchSingleTop = true
                }
            }, modifier = Modifier
                .height(58.dp)
                .width(58.dp),
            containerColor = Color.White,
            shape = CircleShape


        ) {
            Image(
                painter = painterResource(id = R.drawable.chatbot),
                contentDescription = null,

                modifier = Modifier
                    .fillMaxWidth()
                    .padding(7.dp)
                    .clickable {
                        navController.navigate(Routes.Chatbot.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }

                    },

                )

        }
    }
}