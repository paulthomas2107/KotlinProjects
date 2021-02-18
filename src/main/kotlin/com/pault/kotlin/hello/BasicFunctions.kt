package com.pault.kotlin.hello

class Animal {
    var genus: String = ""
    var name: String = ""

    init {
        genus = ""
        name = ""
    }

}
fun getGreeting(): String {
    return "Paul"
}

fun sayHello() {
    println("Hello....")
}

fun returnANull(): String? {
    return null
}


fun returnPaul(): String = "Paul"
// or
fun returnRory() = "Rory" // knows its a string

fun sayStuff(nameOfStuff: String, displayString: String): String {
    return "$nameOfStuff $displayString"
}

fun lengthOfName(name: String): Int {
    return name.length
}

fun animalHolder(anAnimal: Animal): Animal {
    return anAnimal
}

fun sayHelloAgain(name: String) = println("Hello $name")

fun main() {
    println("Hello again")
    println(getGreeting())
    sayHello()
    println(returnANull())
    println(returnPaul())
    println(returnRory())
    println(sayStuff(nameOfStuff = "Paul", displayString = "Hello"))
    println(lengthOfName(name = "Paul"))
    sayHelloAgain("Tori")


}