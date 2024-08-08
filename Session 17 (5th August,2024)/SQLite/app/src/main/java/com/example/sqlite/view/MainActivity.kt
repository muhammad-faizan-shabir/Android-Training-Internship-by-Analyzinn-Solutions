package com.example.sqlite.view

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import com.example.sqlite.R
import com.example.sqlite.database.DBHelper
import com.example.sqlite.viewmodel.DataViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var addName:Button
    private lateinit var printName:Button
    private lateinit var enterName:  EditText
    private lateinit var enterAge: EditText
    private lateinit var Name:TextView
    private lateinit var Age: TextView
    private val viewModel:DataViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
        setListeners()
    }

    private fun initUI()
    {
        addName= findViewById(R.id.addName)
        printName=findViewById(R.id.printName)
        enterName=findViewById(R.id.enterName)
        enterAge=findViewById(R.id.enterAge)
        Name= findViewById(R.id.Name)
        Age= findViewById(R.id.Age)
    }

    @SuppressLint("Range")
    private fun setListeners()
    {
        // below code is to add on click
        // listener to our add name button
        addName.setOnClickListener{
            // creating variables for values
            // in name and age edit texts
            val name = enterName.text.toString()
            val age = enterAge.text.toString()

            // calling method to add
            // name to our database
            viewModel.addName(name, age)

            // Toast to message on the screen
            Toast.makeText(this, name + " added to database", Toast.LENGTH_LONG).show()

            // at last, clearing edit texts
            enterName.text.clear()
            enterAge.text.clear()
        }

        // below code is to add on click
        // listener to our print name button
        printName.setOnClickListener{
            // below is the variable for cursor
            // we have called method to get
            // all names from our database
            // and add to name text view
            val cursor = viewModel.getName()

            if (cursor != null) {
                if (cursor.count >0) {
                    // moving the cursor to first position and
                    // appending value in the text view
                    cursor!!.moveToFirst()
                    Name.append(cursor.getString(cursor.getColumnIndex(DBHelper.NAME_COl)) + "\n")
                    Age.append(cursor.getString(cursor.getColumnIndex(DBHelper.AGE_COL)) + "\n")

                    // moving our cursor to next
                    // position and appending values
                    while(cursor.moveToNext()){
                        Name.append(cursor.getString(cursor.getColumnIndex(DBHelper.NAME_COl)) + "\n")
                        Age.append(cursor.getString(cursor.getColumnIndex(DBHelper.AGE_COL)) + "\n")
                    }

                    // at last we close our cursor
                    cursor.close()
                }
            }
        }
    }
}
