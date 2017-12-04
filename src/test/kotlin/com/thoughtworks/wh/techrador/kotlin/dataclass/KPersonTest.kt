package com.thoughtworks.wh.techrador.kotlin.dataclass

import com.thoughtworks.wh.techrador.kotlin.extensionfn.fullName
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class KPersonTest {

    lateinit var xunjie: KPerson

    @Before
    fun setup() {
        xunjie = KPerson(
                firstName = "Xunjie",
                lastName = "Zhou",
                gender = Gender.MALE,
                age = 18
        )
    }

    @Test
    fun testKPerson() {
        assertEquals(
                "KPerson(firstName=Xunjie, lastName=Zhou, gender=MALE, age=18)",
                xunjie.toString()
        )
    }
}
