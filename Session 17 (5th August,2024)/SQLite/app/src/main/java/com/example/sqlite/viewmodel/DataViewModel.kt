package com.example.sqlite.viewmodel

import android.app.Application
import android.database.Cursor
import androidx.lifecycle.AndroidViewModel
import com.example.sqlite.repository.Repository

class DataViewModel(application: Application): AndroidViewModel(application)
{
    private val repository=Repository(application)

    fun addName(name:String,age:String)
    {
        repository.addName(name,age)
    }

    fun getName(): Cursor?
    {
        return repository.getName()
    }
}