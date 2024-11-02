package com.example.unittesting

class CalculatorExample ( val operators:Operators) {
    fun addTwoNumbers(a: Int, b: Int): Int = operators.addTwoInt(a,b)
}