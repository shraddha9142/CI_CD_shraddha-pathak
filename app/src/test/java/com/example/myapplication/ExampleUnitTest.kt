package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
        assertEquals(4, CalculatorUtils().addition(2, 2))
        assertEquals(10, CalculatorUtils().addition(6, 4))
        assertEquals(22, CalculatorUtils().addition(2, 20))
    }

    @Test
    fun subtraction_isCorrect() {
        assertEquals(4, CalculatorUtils().subtraction(6, 2))
        assertEquals(2, CalculatorUtils().subtraction(6, 4))
        assertEquals(202, CalculatorUtils().subtraction(222, 20))
    }

    @Test
    fun division_isCorrect() {
        assertEquals(4, CalculatorUtils().division(8, 2))
        assertEquals(3, CalculatorUtils().division(6, 2))
        assertEquals(22, CalculatorUtils().division(220, 10))
    }

    @Test
    fun multiplication_isCorrect() {
        assertEquals(4, CalculatorUtils().multiply(2, 2))
        assertEquals(30, CalculatorUtils().multiply(15, 2))
        assertEquals(2200, CalculatorUtils().multiply(220, 10))
    }

    @Test
    fun modulus_isCorrect() {
        assertEquals(1, CalculatorUtils().modulus(15, 2))
        assertEquals(2, CalculatorUtils().modulus(17, 3))
        assertEquals(1, CalculatorUtils().modulus(10, 3))
    }
}