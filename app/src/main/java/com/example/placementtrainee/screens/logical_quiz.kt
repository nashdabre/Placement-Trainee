package com.example.placementtrainee.screens


import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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

import androidx.compose.material3.RadioButton
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.placementtrainee.R
import com.example.placementtrainee.data.Question
import com.example.placementtrainee.data.Quiz
import com.example.placementtrainee.data.Topic
import com.example.placementtrainee.navigation.Routes
import com.example.placementtrainee.utils.loadQuizFromJson


@Composable
fun Logical_Quiz(navController: NavHostController) {
    val context = LocalContext.current
    val quizData= loadQuizFromJson(context, "quantitative.json")
    var selectedTopic by remember { mutableStateOf<Topic?>(null) }
    var currentQuestionIndex by remember { mutableStateOf(0) }
    var score by remember { mutableStateOf(0) }
    var showResult by remember { mutableStateOf(false) }

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
                        navController.navigate(Routes.Quiz.routes) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }

                    }
            )
        }


        if (selectedTopic == null) {
            TopicButtons3(quizData.topics) { topic ->
                selectedTopic = topic
                currentQuestionIndex = 0
                score = 0
                showResult = false
            }
        } else if (showResult) {
            ResultScreen3(score = score, totalQuestions = selectedTopic?.questions?.size ?: 0) {
                selectedTopic = null // Reset to show topic selection screen again
            }
        } else {
            val question = selectedTopic?.questions?.get(currentQuestionIndex)
            question?.let {
                QuizQuestion3(
                    question = it,
                    currentQuestionIndex = currentQuestionIndex,
                    totalQuestions = selectedTopic!!.questions.size,
                    onPreviousClicked = {
                        if (currentQuestionIndex > 0) {
                            currentQuestionIndex--
                        }
                    },
                    onNextClicked = { isCorrect ->
                        if (isCorrect) score++
                        if (currentQuestionIndex < (selectedTopic!!.questions.size - 1)) {
                            currentQuestionIndex++
                        } else {
                            showResult = true // Show result screen after the last question
                        }
                    }
                )
            }
        }
    }
}


@Composable
fun TopicButtons3(topics: List<Topic>, onTopicSelected: (Topic) -> Unit) {
    Column(
        Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color(android.graphics.Color.parseColor("#eeeeee")))
            .padding(top = 10.dp, start = 1.dp, end = 4.dp),
    ) {
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center) {
            Text(text = "Select a Topic",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(android.graphics.Color.parseColor("#000000")),
                modifier = Modifier.padding(top = 2.dp, start = 10.dp))
        }


        LazyColumn(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(7.dp)
            .background(Color.Transparent, RoundedCornerShape(10.dp)
            )) {


            topics.forEach { topic ->
                item{
                    Column (modifier = Modifier
                        .height(80.dp)
                        .width(800.dp)
                        .padding(8.dp)
                        .clickable { onTopicSelected(topic) }

                        .background(color = Color(android.graphics.Color.parseColor("#637f57")), RoundedCornerShape(20.dp)),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){
                        Text(topic.topic,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(android.graphics.Color.parseColor("#ffffff")),
                            modifier = Modifier.padding(top = 2.dp, start = 10.dp))
                    }
                }
            }
        }

    }

}

@Composable
fun QuizQuestion3(
    question: Question,
    currentQuestionIndex: Int,
    totalQuestions: Int,
    onPreviousClicked: () -> Unit,
    onNextClicked: (Boolean) -> Unit
) {
    var selectedOption by remember { mutableStateOf<String?>(null) }

    Column(
        Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color(android.graphics.Color.parseColor("#eeeeee")))
            .padding(top = 10.dp, start = 1.dp, end = 4.dp),
    ) {
        Text(text = "Question ${question.id}",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(android.graphics.Color.parseColor("#000000")),
            modifier = Modifier.padding(top = 2.dp, start = 10.dp))
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = question.question,
            fontSize = 18.sp,
            //fontWeight = FontWeight.Bold,
            color = Color(android.graphics.Color.parseColor("#000000")),
            modifier = Modifier.padding(top = 2.dp, start = 10.dp))
        Spacer(modifier = Modifier.height(16.dp))

        // RadioButtons for options
        question.options.forEach { option ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                RadioButton(
                    selected = selectedOption == option,
                    onClick = { selectedOption = option }
                )
                Text(
                    text = option,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Previous and Next buttons
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = onPreviousClicked,
                enabled = currentQuestionIndex > 0,
                modifier = Modifier.width(140.dp).padding(10.dp),
                colors =  ButtonDefaults.outlinedButtonColors(
                    backgroundColor = Color(android.graphics.Color.parseColor("#637f57")))//
                , shape = RoundedCornerShape(10.dp),
            ) {
                Text("Previous",color = Color(android.graphics.Color.parseColor("#ffffff")))
            }
            Button(
                onClick = {
                    // Pass true if the selected option is correct, otherwise false
                    onNextClicked(selectedOption == question.answer)
                },
                enabled = selectedOption != null,
                modifier = Modifier.width(140.dp).padding(10.dp),
                colors =  ButtonDefaults.outlinedButtonColors(
                    backgroundColor = Color(android.graphics.Color.parseColor("#637f57")))//
                , shape = RoundedCornerShape(10.dp),
            ) {
                Text(if (currentQuestionIndex < totalQuestions - 1) "Next" else "Submit",
                    color = Color(android.graphics.Color.parseColor("#ffffff")))
            }
        }
    }
}


@Composable
fun ResultScreen3(score: Int, totalQuestions: Int, onRetakeQuiz: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Quiz Completed!")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Your Score: $score / $totalQuestions")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onRetakeQuiz) {
            Text("Back to Topics")
        }
    }
}

