package com.example.placementtrainee.screens



import android.annotation.SuppressLint
import android.content.Context
import android.util.Log

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Button

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.placementtrainee.R
import com.example.placementtrainee.data.Education
import com.example.placementtrainee.data.Project
import com.example.placementtrainee.data.ResumeData
import com.example.placementtrainee.data.WorkExperience
import com.example.placementtrainee.navigation.Routes
import com.example.placementtrainee.utils.generateResumePdf


@Composable
fun ResumeBuilderScreen(context: Context,navController: NavController) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var github by remember { mutableStateOf("") }
    var linkedin by remember { mutableStateOf("") }

    // You can do the same for education, projects, etc.
    Column(
        Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color(android.graphics.Color.parseColor("#eeeeee")))
            .padding(top = 10.dp, start = 16.dp, end = 16.dp),
        //  horizontalAlignment = Alignment.CenterHorizontally
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
                        navController.navigate(Routes.ResumeInnerPage.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }

                    }
            )


        }
        Column(modifier = Modifier.padding(16.dp)) {
            OutlinedTextField(value = name, onValueChange = { name = it }, label = { Text("Name") })
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") })
            OutlinedTextField(
                value = phone,
                onValueChange = { phone = it },
                label = { Text("Phone") })
            OutlinedTextField(
                value = github,
                onValueChange = { github = it },
                label = { Text("GitHub") })
            OutlinedTextField(
                value = linkedin,
                onValueChange = { linkedin = it },
                label = { Text("LinkedIn") })

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = {
                val resumeData = ResumeData(
                    name = name,
                    email = email,
                    phone = phone,
                    github = github,
                    linkedin = linkedin,
                    education = listOf(), // collect via dynamic list
                    skills = listOf(),
                    frameworks = listOf(),
                    projects = listOf(),
                    experience = listOf(),
                    certifications = listOf(),
                    achievements = listOf(),
                    volunteer = ""
                )

                generateResumePdf(context, resumeData)
            },
                colors =  ButtonDefaults.outlinedButtonColors(
                    backgroundColor = Color(android.graphics.Color.parseColor("#1b5e20")))//
                , shape = RoundedCornerShape(20.dp)) {
                Text("Generate PDF",modifier = Modifier.padding(vertical = 6.dp),color = Color.White)
            }
        }
    }
}
