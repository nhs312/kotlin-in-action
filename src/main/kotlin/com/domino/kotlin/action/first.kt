package com.domino.kotlin.action

/**
 * Created by nhs312@gmail.com on 2018-11-29.
 */

data class Person(
    val name: String,
    val age: Int? = null
)

fun main(args: Array<String>) {
    val persons = listOf(
        Person("도미노"),
        Person("버거킹", age = 20)
    )

    val oldset = persons.maxBy { it.age ?: 0 }
    println("나이가 가장 많은 사람: $oldset")

}
