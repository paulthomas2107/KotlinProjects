package com.pault.kotlin.hello

val name: String = "Paul !" // once set read only
var thing: String  = "Hello !"
val isAmNullable: String? = null
val greeting: String? = null
var anotherGreeting: String? = null


fun main() {
    println("Vars....")
    thing = "Changed"
    println(thing)
    println(name)
    println(isAmNullable)


    if (isAmNullable !=null) {
        println("I am not null")
    } else {
        println("Im still null")
    }

    // WHEN
    when(greeting) {
        null -> println("i am null")
        "Hello" -> println("hes saying hello")
        else -> println("something else")
    }

    val greetingToPrint = if(anotherGreeting != null) anotherGreeting else "Hello !!!"
    println(greetingToPrint)
    val greet2 = when (anotherGreeting) {
        null -> "Hi, Paul"
        else -> anotherGreeting
    }
    println(greet2)



















}