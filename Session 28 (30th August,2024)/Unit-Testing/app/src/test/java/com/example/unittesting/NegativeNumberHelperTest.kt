package com.example.unittesting

import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runners.Parameterized
import org.junit.runner.RunWith

@RunWith(value = Parameterized::class)
class NegativeNumberHelperTest (private val input: Int, private val expectedValue: Boolean){

    @Test
    fun testParameterized_IsNegativeNumberOrNot() {
        val NNH = NegativeNumberHelper()
        val result = NNH.isNumberNegative(input)
        assertEquals(expectedValue,result)
    }

    companion object {

        @JvmStatic
        @Parameterized.Parameters()
        fun data(): List<Array<Any>> {
            return listOf(
                arrayOf(-1,true),
                arrayOf(3,true)
            )
        }
    }
}