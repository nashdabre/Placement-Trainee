package com.example.placementtrainee.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


data class ResumeData(
    var name: String = "",
    var email: String = "",
    var phone: String = "",
    var github: String = "",
    var linkedin: String = "",
    val education: List<Education> = emptyList(),
    val projects: List<Project> = emptyList(),
    val experience: List<WorkExperience> = emptyList(),
    var skills: List<String> = listOf(),
    var frameworks: List<String> = listOf(),
    var certifications: List<String> = listOf(),
    var achievements: List<String> = listOf(),
    var volunteer: String = ""

)

data class Education(val detail: String)
data class Project(val detail: String)
data class WorkExperience(val detail: String)
