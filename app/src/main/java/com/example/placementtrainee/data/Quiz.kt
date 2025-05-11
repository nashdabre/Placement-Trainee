package com.example.placementtrainee.data

data class Quiz(
    val topics: List<Topic>
)

data class Topic(
    val topic: String,
    val questions: List<Question>
)



data class Question(
    val id: Int,
    val question: String,
    val options: List<String>,
    val answer: String
)