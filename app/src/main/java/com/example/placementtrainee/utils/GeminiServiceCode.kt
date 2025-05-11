package com.example.placementtrainee.utils

import com.google.ai.client.generativeai.GenerativeModel

object GeminiService {
    private const val API_KEY = "Your_API_Key"
    private val generativeModel = GenerativeModel(
        modelName = "gemini-1.5-flash",
        apiKey = API_KEY
    )

    suspend fun generateCodingQuestion(): String {
        return try {
            val prompt = """
                Generate a random coding problem in the style of LeetCode with the following format:
                Title
                Difficulty (Easy/Medium/Hard)
                Description
                Constraints
                Example Input and Output
            """.trimIndent()
            val response = generativeModel.generateContent(prompt)
            response.text ?: "No response from Placement Trainee."
        } catch (e: Exception) {
            "Error: ${e.message}"
        }
    }
}
