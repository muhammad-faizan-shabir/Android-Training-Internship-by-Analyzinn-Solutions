package com.example.activityredirection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class MyFragment : Fragment() {
    private lateinit var view: View
    private lateinit var textview1:TextView
    private lateinit var button1:Button
    var counter=1
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view=inflater.inflate(R.layout.fragment_my, container, false)
        initUI()
        setListeners()
        // Inflate the layout for this fragment
        return view

    }

    private fun initUI()
    {
        textview1= view.findViewById(R.id.textview1)
        button1= view.findViewById(R.id.button1)
    }

    private fun setListeners()
    {
        button1.setOnClickListener() {
            textview1.text= "$counter"
            counter=counter+1
        }
    }
}