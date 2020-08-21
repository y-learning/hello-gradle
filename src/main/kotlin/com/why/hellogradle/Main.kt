package com.why.hellogradle

import MyClass

enum class Lang { GERMAN, FRENCH, ENGLISH, SPANISH }

fun main() {
    println(MyClass.getMessage(Lang.SPANISH))
}
