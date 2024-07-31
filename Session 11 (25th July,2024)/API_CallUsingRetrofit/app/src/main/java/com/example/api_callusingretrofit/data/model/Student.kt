package com.example.api_callusingretrofit.data.model

data class Address(
    val street: String,
    val city: String,
    val country: String
)

data class Student(
    val id: Int,
    val name: String,
    val age: Int,
    val gender: String,
    val address: Address,
    val email: String
)