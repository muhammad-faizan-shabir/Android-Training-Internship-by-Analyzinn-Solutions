package com.example.activityredirection

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.FrameLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var edittext1:EditText
    private lateinit var fragment: Fragment
    private var visibility=1
    private lateinit var frameLayout: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initUI()
        setListeners()

    }

    private fun initUI()
    {
        button1=findViewById(R.id.button1)
        button2=findViewById(R.id.button2)
        edittext1=findViewById(R.id.edittext1)
        frameLayout=findViewById(R.id.fragment_container)
        fragment = MyFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, fragment)
            .commit()

    }

    private fun setListeners()
    {
        button1.setOnClickListener()
        {
            // to move to next activity
            val intent= Intent(this,MainActivity2::class.java)
            intent.putExtra("data",edittext1.text.toString())
            startActivity(intent)
            //finish()

        }

        button2.setOnClickListener()
        {
            if(visibility==0)
            {
                visibility=1
                frameLayout.visibility= View.VISIBLE
            }
            else {
                visibility = 0
                frameLayout.visibility= View.INVISIBLE
            }

        }


    }
}