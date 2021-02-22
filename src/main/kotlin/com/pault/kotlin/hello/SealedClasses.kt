package com.pault.kotlin.hello

import java.util.*

enum class EntityType2 {
    HELP, EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EntityFactory4 {
    fun create(type: EntityType2): SealedClasses {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType2.HELP -> type.getFormattedName()
            EntityType2.EASY -> type.getFormattedName()
            EntityType2.MEDIUM -> type.getFormattedName()
            EntityType2.HARD -> type.getFormattedName()
        }
        return when(type) {
            EntityType2.HELP -> SealedClasses.Help
            EntityType2.EASY -> SealedClasses.Easy(id, name)
            EntityType2.MEDIUM -> SealedClasses.Medium(id, name)
            EntityType2.HARD -> SealedClasses.Hard(id, name, 2f)
        }
    }

}
sealed class SealedClasses {
    object Help: SealedClasses() {
        val name: String = "Help here !!!!"

    }
    // Override how equals  / hashcode works
    data class Easy(val id: String, val name: String): SealedClasses() {
        override fun equals(other: Any?): Boolean {
            return super.equals(other)
        }

        override fun hashCode(): Int {
            return super.hashCode()
        }
    }
    data class Medium(val id: String, val name: String): SealedClasses()
    data class Hard(val id: String, val name: String, val multiplier: Float): SealedClasses()
}

fun main() {
    val msg = when(EntityFactory4.create(EntityType2.HELP)) {
        SealedClasses.Help -> "Help Class"
        is SealedClasses.Easy -> "Easy Class"
        is SealedClasses.Medium -> "Medium Class"
        is SealedClasses.Hard -> "Hard Class"
    }
    println(msg)

    // Data classes
    val entity1 = EntityFactory4.create(EntityType2.EASY)
    val entity2 = EntityFactory4.create(EntityType2.EASY)

    if (entity1 == entity2) {
        println("Entity 1 & 2 are equal")
    } else {
        println("Entity 1 & 2 are NOT equal")
    }

    val entity3 = SealedClasses.Easy("1", "Caitlin")
    val entity4 = entity3.copy(id = "1", name = "Caitlin")

    if (entity3 == entity4) {
        println("Entity 3 & 4 are equal")
    } else {
        println("Entity 3 & 4 are NOT equal")
    }

    if (entity3 === entity4) {
        println("Entity 3 & 4 are ref equal")
    } else {
        println("Entity 3 & 4 are NOT ref equal")
    }

}