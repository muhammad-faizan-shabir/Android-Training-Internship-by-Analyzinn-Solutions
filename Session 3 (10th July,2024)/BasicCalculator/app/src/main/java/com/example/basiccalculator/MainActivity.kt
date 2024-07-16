package com.example.basiccalculator

import android.os.Bundle
import android.provider.Telephony.Mms.Addr
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var num1:EditText
    private lateinit var num2:EditText
    private lateinit var add: Button
    private lateinit var subtract: Button
    private lateinit var multiply: Button
    private lateinit var divide:Button
    private lateinit var result: TextView
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

    fun initUI()
    {
        num1=findViewById(R.id.edittext1)
        num2=findViewById(R.id.edittext2)
        add=findViewById(R.id.button1)
        subtract=findViewById(R.id.button2)
        multiply=findViewById(R.id.button3)
        divide=findViewById(R.id.button4)
        result=findViewById(R.id.textview1)
    }

    fun setListeners()
    {
        add.setOnClickListener {
            if(num1.text.toString()=="" || num2.text.toString()=="" )
            {
                result.text="Error!"
            }
            else
            {
                var input1=num1.text.toString().toDouble()
                var input2=num2.text.toString().toDouble()
                var answer=input1+input2
                result.text="Result = $answer"
            }
        }

        subtract.setOnClickListener {
            if(num1.text.toString()=="" || num2.text.toString()=="" )
            {
                result.text="Error!"
            }
            else
            {
                var input1=num1.text.toString().toDouble()
                var input2=num2.text.toString().toDouble()
                var answer=input1-input2
                result.text="Result = $answer"
            }
        }

        multiply.setOnClickListener {
            if(num1.text.toString()=="" || num2.text.toString()=="" )
            {
                result.text="Error!"
            }
            else
            {
                var input1=num1.text.toString().toDouble()
                var input2=num2.text.toString().toDouble()
                var answer=input1*input2
                result.text="Result = $answer"
            }
        }

        divide.setOnClickListener {
            if(num1.text.toString()=="" || num2.text.toString()=="" )
            {
                result.text="Error!"
            }
            else
            {
                var input1=num1.text.toString().toDouble()
                var input2=num2.text.toString().toDouble()
                if(input2 == 0.0 )
                {
                    result.text="Error!"

                }
                else
                {
                    var answer=input1/input2
                    result.text="Result = $answer"
                }

            }
        }
    }
}