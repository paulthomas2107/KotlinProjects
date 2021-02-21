package com.pault.kotlin.hello

object EntityFactory {
    fun create() = AnotherEntityFactory("PAUL-00121", "Paul Alan Thomas")

}
class AnotherEntityFactory (val id: String, val name: String) {
    override fun toString(): String {
        return "id:$id name:$name"
    }
}

fun main() {
    val entity = EntityFactory.create()
    println(entity)

}