package com.example.unittesting

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculatorExampleTest {

    lateinit var CE: CalculatorExample
    lateinit var OP: Operators

    @Before
    fun onSetup() {
        OP = Mockito.mock(Operators::class.java)
        CE = CalculatorExample(OP)
    }

    @Test
    fun addTwoNumber_PrintValue() {
        val a = 100
        val b = 20

        `when`(OP.addTwoInt(a, b)).thenReturn(a + b)

        val result = CE.addTwoNumbers(a, b)

        println(" after adding two numbers : $result")

    }
}