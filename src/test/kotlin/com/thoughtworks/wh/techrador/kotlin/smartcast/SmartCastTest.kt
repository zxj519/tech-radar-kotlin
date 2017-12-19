package com.thoughtworks.wh.techrador.kotlin.smartcast

import org.junit.Assert
import org.junit.Test

sealed class Expr
class Num(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()

fun eval(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> eval(e.left) + eval(e.right)
        }

class SmartCastTest {
    @Test
    fun testEval() {
        Assert.assertEquals(9, eval(Num(value = 9)))
        Assert.assertEquals(10, eval(Sum(left = Num(4), right = Num(6))))
        Assert.assertEquals(15, eval(Sum(Num(9), Sum(Num(2), Num(4)))))
    }
}