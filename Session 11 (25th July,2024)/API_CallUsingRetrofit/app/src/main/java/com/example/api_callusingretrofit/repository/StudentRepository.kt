package com.example.api_callusingretrofit.repository

import com.example.api_callusingretrofit.data.model.Student
import com.example.api_callusingretrofit.data.network.ApiService
import com.example.api_callusingretrofit.data.network.StudentAPIClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class StudentRepository {
    private val apiService: ApiService = StudentAPIClient.instance

    fun getStudents(onResult: (List<Student>?) -> Unit, onError: (Throwable) -> Unit) {
        val call = apiService.getStudents()

        call.enqueue(object : Callback<List<Student>> {
            override fun onResponse(call: Call<List<Student>>, response: Response<List<Student>>) {
                if (response.isSuccessful) {
                    onResult(response.body())
                } else {
                    onError(Throwable(response.errorBody()?.string()))
                }
            }

            override fun onFailure(call: Call<List<Student>>, t: Throwable) {
                onError(t)
            }

        })
    }
}