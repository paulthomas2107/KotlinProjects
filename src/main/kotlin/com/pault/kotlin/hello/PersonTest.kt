package com.pault.kotlin.hello

fun main() {
    val person = Person("Paul", "Thomas")
    println("${person.firstName} ${person.lastName}")

    // Use default constructor
    val person2 = Person()
    println("${person2.firstName} ${person2.lastName}")
    person2.nickname = "Tomo"
    println("${person2.nickname}")
    person.nickname = "Name 1" // gets get AND set by  class method
    person.nickname = "Name 2"
    println(person.nickname)
    person.nickname = null

    //  call method on class
    person.printInfo()
    person.nickname = "Tomo"
    person.printInfo()

}