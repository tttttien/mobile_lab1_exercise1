package com.example.lab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CVApp()
        }
    }
}

@Composable
fun CVApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Image(
            painter = painterResource(id = R.drawable.image), // Profile picture
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Nguyen Thanh Quynh Tien", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text(text = "Mobile Developer", color = Color.Gray, fontSize = 16.sp)
        Spacer(modifier = Modifier.height(24.dp))

        SectionTitle("About Me")
        Text(
            text = "I am a passionate mobile developer and AI researcher with a strong background in Kotlin, Jetpack Compose, and Machine Learning. My goal is to build innovative and impactful applications that leverage AI technologies.",
            fontSize = 16.sp,
            modifier = Modifier.padding(8.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        SectionTitle("Skills")
        SkillItem("Kotlin, Jetpack Compose, Firebase")
        SkillItem("Machine Learning, Deep Learning, AI")
        SkillItem("Python, C++, Linux")

        Spacer(modifier = Modifier.height(24.dp))

        SectionTitle("Work Experience")
        ExperienceItem("2024 - Present", "AI Researcher", "University of Information Technology - UIT")
        ExperienceItem("2023 - 2024", "Android Developer", "XYZ Company")

        Spacer(modifier = Modifier.height(24.dp))

        SectionTitle("Education")
        EducationItem("2020 - 2024", "University of Information Technology - UIT", "Major: Computer Science")

        Spacer(modifier = Modifier.height(24.dp))

        SectionTitle("Projects")
        ProjectItem("Fire Detection Application", "AI-powered fire detection from images/videos using Swin-UNet.")
        ProjectItem("Smart Learning Platform", "AI-powered educational website that provides study materials and automatic problem-solving.")

        Spacer(modifier = Modifier.height(24.dp))

        SectionTitle("Contact")
        ContactItem("Email", "21521531@ms.uit.edu.vn")
        ContactItem("GitHub", "https://github.com/tttttien")
        ContactItem("LinkedIn", "https://www.linkedin.com/in/quynhtien")
    }
}

@Composable
fun SectionTitle(title: String) {
    Text(text = title, fontSize = 20.sp, color=Color.Blue, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 16.dp))
}

@Composable
fun SkillItem(skill: String) {
    Text(text = "• $skill", fontSize = 16.sp, modifier = Modifier.padding(4.dp))
}

@Composable
fun ExperienceItem(year: String, role: String, company: String) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = year, fontSize = 14.sp, color = Color.Gray)
        Text(text = role, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        Text(text = company, fontSize = 16.sp)
    }
}

@Composable
fun EducationItem(year: String, school: String, major: String) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = year, fontSize = 14.sp, color = Color.Gray)
        Text(text = school, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        Text(text = major, fontSize = 16.sp)
    }
}

@Composable
fun ProjectItem(name: String, description: String) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = name, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        Text(text = description, fontSize = 16.sp)
    }
}

@Composable
fun ContactItem(type: String, info: String) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = "$type:", fontSize = 16.sp, fontWeight = FontWeight.Bold)
        Text(text = info, fontSize = 16.sp, color = Color.Blue)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCVApp() {
    CVApp()
}