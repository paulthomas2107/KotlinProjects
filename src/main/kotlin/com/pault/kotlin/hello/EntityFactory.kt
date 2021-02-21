package com.pault.kotlin.hello

interface IDProvider {
    fun getID(): String
}

class Entity private constructor(val id: String) {
    // Companion Object
    companion object Factory: IDProvider {
        private const val id: String = "Rory001"

        fun create() = Entity(getID())

        override fun getID(): String {
            return "ID-123-444"
        }
    }
}

    fun main() {
        val entity = Entity.Factory.create() // companion can be left off
        println(entity.id)
    }

