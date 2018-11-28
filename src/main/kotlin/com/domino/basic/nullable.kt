package com.domino.basic

/**
 * Created by nhs312@gmail.com on 2018. 9. 12..
 */

fun printSomething(str1: String, str2: String) {
    val a = parseInt(str1)
    val b = parseInt(str2)

    if (a != null && b != null) {
        println(a * b)
    } else {
        println("either '$str1' or '$str2' is not a number")
    }


}

fun parseInt(str: String): Int? {
    if (str.length < 3) {
        return null
    }
    return str.toInt()
}
