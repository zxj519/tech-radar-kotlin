package com.thoughtworks.wh.techrador.kotlin.nullable

import org.junit.Assert
import org.junit.Test

class KNullableTest {

    @Test(expected = NullPointerException::class)
    fun testKNullable() {
        var s = "this variable cannot store null references"
        val q: String? = null

        if (q != null) q.length      // you have to check to dereference

        val i: Int? = q?.length      // null
        Assert.assertNull(i)

        val j: Int = q?.length ?: 0  // 0
        Assert.assertEquals(0, j)

        q!!.length

    }
}