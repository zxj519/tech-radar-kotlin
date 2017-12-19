package com.thoughtworks.wh.techrador.kotlin.lambda

import org.junit.Assert
import org.junit.Test

class KLambdaTest {
    @Test
    fun testKLambda() {
        val sum = { x: Int, y: Int -> x + y }
        val square: (Int) -> Int = { x -> x * x }

        Assert.assertEquals(5, sum(1, square(2)))
    }
}