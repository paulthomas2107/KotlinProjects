package com.pault.kotlin.hello

fun main() {
    var person = Person("Paul", "Thomas")
    println("${person.firstName} ${person.lastName}")

    // Use default constructor
    var person2 = Person()
    println("${person2.firstName} ${person2.lastName}")
    person2.nickname = "Tomo"
    println("${person2.nickname}")
}