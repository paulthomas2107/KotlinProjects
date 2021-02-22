package com.pault.kotlin.hello

// Return or take other functions as params
fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach {
        if (predicate?.invoke(it) == true) {
            println(it)
        }
    }
}

val predicate: (String) -> Boolean = {
    it.startsWith("R")
}

fun getPrintPredicate(): (String) -> Boolean {
    return {
        it.startsWith("K")
    }
}


fun main() {
    val list = listOf("Rory", "Caitlin", "Paul", "Kotlin", "Apache Wicket", "C++")
    printFilteredStrings(list) { it.startsWith("R") }
    printFilteredStrings(list) { it.startsWith("C") }
    printFilteredStrings(list, null) // handled by ? above
    printFilteredStrings(list, predicate) // handled by predicate string
    printFilteredStrings(list, getPrintPredicate()) // handled by method getPrintPredicate
    println("----------------------")

    val list2 = listOf("Kotlin", "Java", "C++", "Javascript", "Cobol", null, null)
    list2
        .filterNotNull()
        .filter {
            it.startsWith("J")
        }
        .map {
            it.length
        }
        .forEach {
            println(it)
        }
    println("----------------------")

    val list3 = listOf("Kotlin", "Java", "C++", "Javascript", "Cobol", null, null)
    list3
        .filterNotNull()
        .take(3)
        .forEach {
            println(it)
        }
    println("----------------------")
    list3
        .filterNotNull()
        .takeLast(3)
        .forEach {
            println(it)
        }
    println("----------------------")
    list3
        .filterNotNull()
        .associateWith { it.length }
        .forEach {
            println("${it.value}, ${it.key}")
        }
    println("----------------------")
    val map = list3
        .filterNotNull()
        .associateWith { it.length }
    val languageFirst: String? = list3.first()
    println(languageFirst)
    val languageLast: String? = list3.filterNotNull().last()
    println(languageLast)
    val languageSearch: String? = list3.filterNotNull().find{it.startsWith("Java")}
    println(languageSearch)
    val languageSearchLast: String? = list3.filterNotNull().findLast{it.startsWith("Java")}
    println(languageSearchLast)
    val notFoundsLanguage: String? = list3.filterNotNull().findLast{it.startsWith("Foo")}.orEmpty()
    println(notFoundsLanguage)
    println("----------------------")
}













