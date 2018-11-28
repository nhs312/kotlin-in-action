package com.domino.basic

/**
 * Created by nhs312@gmail.com on 2018. 9. 12..
 */
fun rangeExample() {
    inRange(5)
}

/**
 * @see <a href="https://kotlinlang.org/docs/reference/ranges.html">ranges</a>
 */
fun inRange(a: Int): Boolean {
    val begin = 1
    val end = 10

    return a in begin..end
}

fun stepInRange(a: Int) {

    for (x in 1..10 step a) {
        print(x)
    }

    println()
    for (x in 10 downTo 1 step a) {
        print(x)
    }
}
