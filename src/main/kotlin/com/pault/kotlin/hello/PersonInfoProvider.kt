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

open class BasicInfoProvider: PersonInfoProvider, SessionInfoProvider { // open can noe be inherited from

    override val providerInfo: String
        get() = "BasicInfoProvider..."

    protected open val sessionIdPrefix: String = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Additional stuff....")
    }

    override fun getSessionId(): String {
         return sessionIdPrefix
    }
}

fun main() {

    val provider = FancyInfoProvider()
    provider.printInfo(Person())
    println(provider.getSessionId())
    checkTypes(provider)

    // Anonymous inner class
    println("Provider 2...")
    val provider2 = object: PersonInfoProvider {
        override val providerInfo: String
            get() = "*** New Info Provider"
        fun getSessionId(): String = "*** id"
    }
    provider2.printInfo(Person())
    println(provider2.getSessionId())
    checkTypes(provider2)

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





