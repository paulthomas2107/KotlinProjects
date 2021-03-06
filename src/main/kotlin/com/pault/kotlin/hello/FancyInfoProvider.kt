package com.pault.kotlin.hello

class FancyInfoProvider: BasicInfoProvider() {

    override val sessionIdPrefix: String
        get() = "Fancy Session"

    override val providerInfo: String
        get() = "Fancy Info Provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("From Fancy Info")
    }
}