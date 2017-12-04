package com.thoughtworks.wh.techrador.kotlin.smartcast

import org.junit.Test
import kotlin.test.assertEquals

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
        assertEquals(9, eval(Num(value = 9)))
        assertEquals(10, eval(Sum(left = Num(4), right = Num(6))))
        assertEquals(15, eval(Sum(Num(9), Sum(Num(2), Num(4)))))
    }
}