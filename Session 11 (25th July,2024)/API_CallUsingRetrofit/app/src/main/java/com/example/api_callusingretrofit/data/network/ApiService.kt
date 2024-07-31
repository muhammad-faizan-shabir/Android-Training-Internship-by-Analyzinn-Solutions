package com.example.api_callusingretrofit.data.network

import com.example.api_callusingretrofit.data.model.Student
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("students")
    fun getStudents(): Call<List<Student>>

    // ALL METHOD SHOULD BE MENTIONED HERE
    // PUT
    // POST
    // GET
}