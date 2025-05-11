package com.example.placementtrainee.screens

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FAQScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("FAQ",modifier = Modifier.padding(start = 10.dp)) },
                navigationIcon = {
                    IconButton(onClick = {  },modifier = Modifier
                        .width(62.dp)
                        .padding(start = 3.dp)) {
                        Box(
                            modifier = Modifier
                                .height(45.dp)
                                .width(60.dp)
                                .padding(start = 5.dp)
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
                                        navController.navigate(Routes.Profile.routes) {
                                            popUpTo(navController.graph.startDestinationId)
                                            launchSingleTop = true
                                        }

                                    }
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF1A237E), // Dark blue to match ProfileScreen
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(Color(0xFFF5F5DC)), // Light beige background
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item {
                Spacer(modifier = Modifier.height(8.dp))
            }
            items(faqList.size) { index ->
                FAQItem(faq = faqList[index])
            }
            item {
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}

data class FAQ(
    val question: String,
    val answer: String
)

val faqList = listOf(
    FAQ(
        question = "How can I prepare for placement interviews?",
        answer = "The app provides a dedicated Interview Questions section where you can practice common questions asked in placement interviews. Additionally, the Aptitude Practice section helps you improve your problem-solving skills, which are often tested during interviews."
    ),
    FAQ(
        question = "What resources are available for learning?",
        answer = "You can access Reference Videos, PDFs, and Notes in the app to study various topics relevant to placement preparation. The Course Section also offers structured learning content to guide you through your preparation journey."
    ),
    FAQ(
        question = "How does the Resume Builder work?",
        answer = "The Resume Parser and Resume Builder feature allows you to create a professional resume by entering your details. You can choose from templates, input your personal information, education, work experience, and skills, and then preview and download your resume."
    ),
    FAQ(
        question = "What is the Chatbot used for?",
        answer = "The Chatbot is here to assist you with quick answers to your placement-related queries. You can ask about interview tips, resume advice, or even get help with aptitude questions."
    ),
    FAQ(
        question = "How can I generate code using the app?",
        answer = "The Code Generator feature lets you input a problem statement or select a template, and the app will generate code snippets for you. It’s useful for practicing coding problems commonly asked in technical interviews."
    ),
    FAQ(
        question = "Can I track my progress in the app?",
        answer = "Yes, the Course Section allows you to track your progress through various topics. You can mark sections as completed and revisit them as needed to ensure you’re prepared for placements."
    )
)

@Composable
fun FAQItem(faq: FAQ) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .animateContentSize(),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF4A4A4A) // Dark gray to match the image
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { expanded = !expanded }
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = faq.question,
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.White
                )
                Icon(
                    imageVector = if (expanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                    contentDescription = if (expanded) "Collapse" else "Expand",
                    tint = Color.White
                )
            }
            if (expanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = faq.answer,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White.copy(alpha = 0.9f)
                )
            }
        }
    }
}