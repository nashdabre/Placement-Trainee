package com.example.placementtrainee.utils


import com.google.ai.client.generativeai.GenerativeModel

object ATSService {
    private const val API_KEY = "Your_API_Key"
    private val model = GenerativeModel(
        modelName = "gemini-1.5-flash",
        apiKey = API_KEY
    )

    suspend fun getAtsScore(resume: String, jobDescription: String): String {
        return try {
            val prompt = """
                You are an ATS system. Given the following resume and job description:
                
                Resume:
                $resume
                
                Job Description:
                $jobDescription
                
                1. Give an ATS match score out of 100.
                2. List the missing or weak skills or experiences that reduce the score.
                3. Suggest clear recommendations to improve the resume to better match the job description.
            """.trimIndent()

            val response = model.generateContent(prompt)
            response.text ?: "No response from model."
        } catch (e: Exception) {
            "Error: ${e.message}"
        }
    }
}
