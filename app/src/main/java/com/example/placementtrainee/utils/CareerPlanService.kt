package com.example.placementtrainee.utils

import com.example.placementtrainee.data.WeeklyPlan
import com.google.ai.client.generativeai.GenerativeModel

object CareerPlanService {
    private const val API_KEY = "YOUR_API_KEY"
    private val generativeModel = GenerativeModel(
        modelName = "gemini-1.5-flash",
        apiKey = API_KEY
    )

    suspend fun generateCareerPlan(goal: String, months: String): List<WeeklyPlan> {
        return try {
            val prompt = """
                Generate a weekly roadmap to achieve the following goal:
                Goal: $goal
                Duration: $months months
                
                Provide the response in the following format (no numbering or bullet points):
                Week 1: <Content>
                Week 2: <Content>
                ...
            """.trimIndent()

            val response = generativeModel.generateContent(prompt)
            val text = response.text ?: return emptyList()

            // Parse response into WeeklyPlan list
            val lines = text.split("\n").filter { it.contains("Week") && ":" in it }
            lines.map {
                val parts = it.split(":", limit = 2)
                val title = parts[0].trim()
                val content = parts[1].trim()
                WeeklyPlan(weekTitle = title, content = content)
            }
        } catch (e: Exception) {
            e.printStackTrace()
            emptyList()
        }
    }
}
