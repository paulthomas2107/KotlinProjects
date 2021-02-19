package com.pault.kotlin.hello

class Person(val firstName: String = "Jesus", val lastName: String = "Smith") {

    /*
    val firstName: String
    val lastName: String
    // or...
    init {
        firstName = _firstName
        lastName = _lastName
    }
    */

    // Runs 1st
    init {
        println("Init 1")
    }

    // Runs THIRD !
    // Secondary constructor
    constructor():this("--Default--", "--Name--") {
        println("Secondary Constructor")
    }

    // Runs 2nd
    init {
        println("Init 2")
    }

    var nickname: String? = null

}
