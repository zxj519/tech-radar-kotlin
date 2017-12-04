package com.thoughtworks.wh.techrador.kotlin.extensionfn

import com.thoughtworks.wh.techrador.kotlin.dataclass.KPerson

fun String.lastChar() = this.get(this.length - 1)

fun KPerson.fullName() = "${this.firstName} ${this.lastName}"