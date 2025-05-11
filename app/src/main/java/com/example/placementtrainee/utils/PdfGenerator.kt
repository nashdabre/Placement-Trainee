package com.example.placementtrainee.utils


import android.content.Context
import android.graphics.*
import android.graphics.pdf.PdfDocument
import android.os.Environment
import android.widget.Toast
import com.example.placementtrainee.data.ResumeData
import java.io.File
import java.io.FileOutputStream
fun generateResumePdf(context: Context, resumeData: ResumeData) {
    val pdfDocument = PdfDocument()
    val paint = Paint()
    val pageInfo = PdfDocument.PageInfo.Builder(595, 842, 1).create() // A4 size
    val page = pdfDocument.startPage(pageInfo)
    val canvas: Canvas = page.canvas

    var y = 50 // vertical start position

    fun drawSection(title: String, content: List<String>) {
        paint.textSize = 16f
        paint.isFakeBoldText = true
        canvas.drawText(title, 40f, y.toFloat(), paint)
        y += 25
        paint.textSize = 14f
        paint.isFakeBoldText = false
        for (item in content) {
            canvas.drawText("- $item", 60f, y.toFloat(), paint)
            y += 20
        }
        y += 10
    }

    paint.textSize = 20f
    paint.isFakeBoldText = true
    canvas.drawText(resumeData.name, 40f, y.toFloat(), paint)
    y += 30
    paint.textSize = 14f
    paint.isFakeBoldText = false

    canvas.drawText("Email: ${resumeData.email}", 40f, y.toFloat(), paint)
    y += 20
    canvas.drawText("Phone: ${resumeData.phone}", 40f, y.toFloat(), paint)
    y += 20
    canvas.drawText("GitHub: ${resumeData.github}", 40f, y.toFloat(), paint)
    y += 20
    canvas.drawText("LinkedIn: ${resumeData.linkedin}", 40f, y.toFloat(), paint)
    y += 30

    drawSection("Education", resumeData.education.map { it.detail })
    drawSection("Projects", resumeData.projects.map { it.detail })
    drawSection("Experience", resumeData.experience.map { it.detail })

    drawSection("Skills", resumeData.skills)
    drawSection("Frameworks", resumeData.frameworks)
    drawSection("Certifications", resumeData.certifications)
    drawSection("Achievements", resumeData.achievements)

    if (resumeData.volunteer.isNotBlank()) {
        drawSection("Volunteer", listOf(resumeData.volunteer))
    }

    pdfDocument.finishPage(page)

    try {
        val file = File(context.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS), "Resume.pdf")
        pdfDocument.writeTo(FileOutputStream(file))
        Toast.makeText(context, "PDF saved to ${file.absolutePath}", Toast.LENGTH_LONG).show()
    } catch (e: Exception) {
        e.printStackTrace()
        Toast.makeText(context, "Error generating PDF: ${e.message}", Toast.LENGTH_SHORT).show()
    } finally {
        pdfDocument.close()
    }
}