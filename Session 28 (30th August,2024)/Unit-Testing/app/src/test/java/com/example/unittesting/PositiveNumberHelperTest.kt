package com.example.unittesting

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class PositiveNumberHelperTest{
    lateinit var pnHelper : PositiveNumberHelper
    @Before
    fun setUp(){
        pnHelper = PositiveNumberHelper()
        println("Starting test");
    }

    @Test
    fun testPositiveNumber(){
        val result = pnHelper.isNumberPositive(2)
        println("Is Positive Number : $result")
        assert(result==false)
    }

    @After
    fun cleanUp()
    {
        println("Ending test");
    }
}