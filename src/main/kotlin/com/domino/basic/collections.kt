package com.domino.basic

/**
 * Created by nhs312@gmail.com on 2018. 9. 12..
 */
fun collectionsExample() {
    printItems()
}

/**
 * @see <a href="https://kotlinlang.org/docs/reference/lambdas.html">collections</a>
 * @see <a href="https://kotlinlang.org/docs/reference/lambdas.html">using lambda</a>
 */
fun printItems() {
    val items = listOf("animal", "human", "nature")

    for (item in items) {
        println(item)
    }

    // check containing something in collections
    when {
        "animal" in items -> println("Yes")
        "sports" in items -> println("Nof")
    }

    // using lambda expressions
    val sports = listOf("soccer", "baseball", "football", "cycle", "running", "basketball", "tennis", "swimming")

    sports.filter { it.startsWith("b") }.sortedBy { it }.map { it.toUpperCase() }.forEach { println(it) }
}

