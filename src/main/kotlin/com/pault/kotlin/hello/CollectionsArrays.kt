package com.pault.kotlin.hello

fun main() {
    val interestingThings = arrayOf("Paul", "Alan", "Thomas")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))

    for (aThing in interestingThings) {
        println(aThing)
    }

    interestingThings.forEach {aThing ->
        println(aThing)
    }
    
    interestingThings.forEachIndexed { index, aThing ->
        println("$aThing is at $index")
    }

    println("===========================")
    val moreThings = listOf("Car book", "kitchen guides", "football guide")
    moreThings.forEach {aThing ->
        println(aThing)
    }
    // Maps
    val map1 = mapOf(1 to "Paul", 2 to "Caitlin", 3 to "Rory")
    println(map1)

    val map2 = mapOf("Dad" to "Paul", "Daughter" to "Caitlin", "Son" to "Rory")
    println(map2)
    map2.forEach{key, value -> println("$key --> $value")}

    // mutable list can be added
    val books = mutableListOf("Car book", "kitchen guides", "football guide")
    books.add("sherlock")
    println(books)
    books.add(0, "bible")
    println(books)

    val map3 = mutableMapOf("Dad" to "Paul", "Daughter" to "Caitlin", "Son" to "Rory")
    println(map3)
    map3.forEach{key, value -> println("$key --> $value")}
    map3.put("Pet", "Doggo")
    map3.forEach{key, value -> println("$key --> $value")}

    fun sayHelloToList(greeting: String, listOfPeople:List<String>) {
        for (person in listOfPeople) {
            println("$greeting to $person")
        }
    }
    val people = listOf("Pope John", "Prince Leo", "Sister Ola")
    sayHelloToList("Bonjour", people)

    // Variable size of paramaters
    fun sayHelloToListV2(greeting: String, vararg itemsToGreet:String) {
        itemsToGreet.forEach {itemToGreet ->
            println("$greeting $itemToGreet")
        }
    }
    sayHelloToListV2("Paul")
    sayHelloToListV2("Paul", "Hiya...", "Bonjour", "Hallo", "Tuti")

    // Using Spread
    var cars = arrayOf("Ford", "Cadillac", "Dodge", "MG Mini")
    sayHelloToListV2("Hi !", *cars)

    // Normal call
    fun greetPerson(greeting: String = "HaHoi !", name: String = "I am a default") = println("$greeting $name")
    greetPerson("Hello", "Paul")
    // or named arguments move order of params around
    greetPerson(name="Paul", greeting="Hello")

    // Default method params -- takes values set from signature
    greetPerson() // takes both defaults
    greetPerson(name="Paul") // takes greeting default
    greetPerson(greeting="Hello") // takes name default


}