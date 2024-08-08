package com.example.sqlite.repository

import android.content.Context
import android.database.Cursor
import com.example.sqlite.database.DBHelper

class Repository(private val context: Context)
{
    // below we have created
    // a new DBHelper class,
    // and passed context to it
    private val db = DBHelper(context, null)

    fun addName(name:String,age:String)
    {
        // calling method to add
        // name to our database
        db.addName(name, age)
    }

    fun getName(): Cursor?
    {
        return db.getName()
    }
}