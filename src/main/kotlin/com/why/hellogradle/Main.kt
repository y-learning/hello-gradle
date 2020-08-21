package com.why.hellogradle

enum class Lang { GERMAN, FRENCH, ENGLISH, SPANISH }

fun main() {
    println(MyClass.getMessage(Lang.SPANISH))
}
