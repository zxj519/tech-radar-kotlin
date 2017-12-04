package com.thoughtworks.wh.techrador.kotlin.nullable

import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException
import kotlin.test.assertEquals
import kotlin.test.assertNull

class KNullableTest {

    @Test(expected = NullPointerException::class)
    fun testKNullable() {
        val s = "this variable cannot store null references"
        val q: String? = null

        if (q != null) q.length      // you have to check to dereference

        val i: Int? = q?.length      // null
        assertNull(i)

        val j: Int = q?.length ?: 0  // 0
        assertEquals(0, j)

        q!!.length

    }
}