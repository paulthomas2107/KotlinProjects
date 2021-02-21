package com.pault.kotlin.hello

import java.util.*

enum class EntityType {
    EASY, MEDIUM, HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EntityFactory3 {
    fun create(type: EntityType): Entity3 {
        val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType.EASY -> type.getFormattedName()
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> type.getFormattedName()
        }
        return Entity3(id,  name)
    }

}
class Entity3 (private val id: String, private val name: String) {
    override fun toString(): String {
        return "id:$id name:$name"
    }
}

fun main() {
    val entity1 = EntityFactory3.create(EntityType.EASY)
    println(entity1)

    val entity2 = EntityFactory3.create(EntityType.MEDIUM)
    println(entity2)

    val entity3 = EntityFactory3.create(EntityType.HARD)
    println(entity3)
}