package com.pault.kotlin.hello

interface PersonInfoProvider {

    val providerInfo: String

    fun printInfo(person: Person) {
        println(providerInfo)
        person.printInfo()
    }

}

interface SessionInfoProvider {

    fun getSessionId(): String
}

class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider {

    override val providerInfo: String
        get() = "BasicInfoProvider..."

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Additional stuff....")
    }

    override fun getSessionId(): String {
        return "Some session data"
    }
}

fun main() {

    val provider = BasicInfoProvider()
    provider.printInfo(Person())
    println(provider.getSessionId())

    checkTypes(provider)

}

fun checkTypes(infoProvider: PersonInfoProvider) {
    if (infoProvider !is SessionInfoProvider) {
        println("Is Not a SessionInfoProvider")
    } else {
        println("IS... a SessionInfoProvider")
        (infoProvider as SessionInfoProvider).getSessionId() // cast and run a method
        infoProvider.getSessionId() // smart cast as above
    }
}





