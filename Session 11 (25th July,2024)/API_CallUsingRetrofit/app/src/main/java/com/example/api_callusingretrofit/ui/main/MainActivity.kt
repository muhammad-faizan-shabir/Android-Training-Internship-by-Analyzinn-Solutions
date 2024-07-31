package com.example.api_callusingretrofit.ui.main

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.api_callusingretrofit.R
import com.example.api_callusingretrofit.repository.StudentRepository

class MainActivity : AppCompatActivity() {
    private val studentRepository = StudentRepository()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        fetchStudents()
    }

    private fun fetchStudents() {
        studentRepository.getStudents(
            onResult = { students ->
                students?.forEach { student ->
                    Log.d("MainActivity", "Student: ${student.name}, Age: ${student.age}, Email: ${student.email}")
                }
            },
            onError = { error ->
                Log.e("MainActivity", "Error: ${error.message}")
            }
        )
    }
}