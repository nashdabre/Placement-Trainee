package com.example.placementtrainee.screens




import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.runtime.Composable


import androidx.compose.ui.unit.dp

import androidx.compose.foundation.layout.*

import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext

import okhttp3.*

import kotlinx.coroutines.launch


import android.net.Uri

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.placementtrainee.R
import com.example.placementtrainee.navigation.Routes
import com.example.placementtrainee.utils.ATSService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

@Composable
fun ATSScoreScreen(navController: NavController) {
    val context = LocalContext.current
    var resumeText by remember { mutableStateOf("") }
    var jdText by remember { mutableStateOf("") }
    var resultText by remember { mutableStateOf("") }
    var isLoading by remember { mutableStateOf(false) }

    val resumePicker = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) { uri: Uri? ->
        uri?.let {
            resumeText = readTextFromUri(context, it)
        }
    }
    Column(
        Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color(android.graphics.Color.parseColor("#eeeeee")))
            .padding(top = 32.dp, start = 10.dp,end = 10.dp),
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 16.dp)
        ) {

            Text(
                text = "Upload Resume",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Justify,
                color = Color(android.graphics.Color.parseColor("#000000")),
                modifier = Modifier.padding(bottom = 10.dp)

                )
            Button(onClick = { resumePicker.launch("application/pdf")},
                colors =  ButtonDefaults.outlinedButtonColors(
                    backgroundColor = Color(android.graphics.Color.parseColor("#1b5e20")))//
                , shape = RoundedCornerShape(20.dp)) {
                Text("Select Resume (PDF/Text)",modifier = Modifier.padding(vertical = 6.dp),color = Color.White)
            }

            Spacer(modifier = Modifier.height(14.dp))

            Text("Enter Job Description:", fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Justify,
                color = Color(android.graphics.Color.parseColor("#000000")),)

            LazyColumn(modifier = Modifier
                .height(170.dp)
                .fillMaxWidth()
                .padding(top = 10.dp, start = 1.dp, bottom = 10.dp)
                .background(
                    color = Color(android.graphics.Color.parseColor("#fdfdfd")),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(5.dp)) {
                item {
                    BasicTextField(
                        value = jdText,
                        onValueChange = { jdText = it },
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(4.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#ffffff")),
                                shape = RoundedCornerShape(20.dp)
                            )
                    )
                }}



            Spacer(modifier = Modifier.height(4.dp))

            Button(
                onClick = {
                    isLoading = true
                    CoroutineScope(Dispatchers.IO).launch {
                        val result = ATSService.getAtsScore(resumeText, jdText)
                        resultText = result
                        isLoading = false
                    }
                },
                colors =  ButtonDefaults.outlinedButtonColors(
                    backgroundColor = Color(android.graphics.Color.parseColor("#1b5e20")))//
                , shape = RoundedCornerShape(20.dp),
                enabled = !isLoading
            ) {
                Text(if (isLoading) "Calculating..." else "Get ATS Score",modifier = Modifier.padding(vertical = 6.dp),color = Color.White)
            }

            Spacer(modifier = Modifier.height(22.dp))
            Text("Result:",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Justify,
                color = Color(android.graphics.Color.parseColor("#000000")),)

            LazyColumn(modifier = Modifier
                .height(230.dp)
                .fillMaxWidth()
                .padding(top = 10.dp, start = 1.dp, bottom = 10.dp)
                .padding(5.dp)
               )
            {
                item {

                    Text(resultText)
                }}

        }
    }
}
fun readTextFromUri(context: android.content.Context, uri: Uri): String {
    return try {
        context.contentResolver.openInputStream(uri)?.bufferedReader().use { it?.readText() ?: "" }
    } catch (e: Exception) {
        "Error reading file: ${e.message}"
    }
}
