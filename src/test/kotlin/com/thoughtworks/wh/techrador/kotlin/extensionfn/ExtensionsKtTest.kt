package com.thoughtworks.wh.techrador.kotlin.extensionfn

import com.thoughtworks.wh.techrador.kotlin.dataclass.Gender
import com.thoughtworks.wh.techrador.kotlin.dataclass.KPerson
import org.junit.Test

import org.junit.Assert.*

class ExtensionsKtTest {
    @Test
    fun lastChar() {
        val string = "Hello Kotlin"
        assertEquals('n', string.lastChar())
    }

    @Test
    fun fullName() {
        assertEquals(
                "Xunjie Zhou",
                KPerson(
                        firstName = "Xunjie",
                        lastName = "Zhou",
                        gender = Gender.MALE,
                        age = 18
                ).fullName()
        )
    }

}