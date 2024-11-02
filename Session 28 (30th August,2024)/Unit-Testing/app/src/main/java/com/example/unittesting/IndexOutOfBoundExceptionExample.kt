package com.example.unittesting

class IndexOutOfBoundExceptionExample {
    val array = intArrayOf(1, 2, 3)   // index is 0,1,2 value 1,2,3

    fun getValue(index : Int) : Int{
        return array[index]
    }
}