package com.example.unittesting

import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import java.lang.Exception

@RunWith(MockitoJUnitRunner::class)
class IndexOutOfBoundExceptionExampleTest {
    @Test
    fun testException_IndexOutOfBound() {
        val ob: IndexOutOfBoundExceptionExample = IndexOutOfBoundExceptionExample()
        try {
            val value = ob.getValue(3)
            println("value of getvalue() is : $value")
        }catch (e : Exception){
            println(e.message)
        }
    }

}
