package com.domino.basic

/**
 * Created by nhs312@gmail.com on 2018. 9. 12..
 */

/**
 * basic conditional expression
 * @see <a href="https://kotlinlang.org/docs/reference/control-flow.html#if-expression">if-expression</a>
 */
fun maxOf(a: Int, b: Int): Int {

    if (a > b) {
        return a
    } else {
        return b
    }
}

// using 'if' as an expression
fun minOf(a: Int, b: Int) = if (a > b) b else a


/**
 * Created by nhs312@gmail.com on 2018. 9. 12..
 * @see <a href="https://kotlinlang.org/docs/reference/control-flow.html#for-loops">for-loops</a>
 * @see <a href="https://kotlinlang.org/docs/reference/control-flow.html#while-loops">while-loops</a>
 */
fun basicLoop() {
    val brands = listOf("nike", "adidas", "puma")

    for (brand in brands) {
        println(brand)
    }

    for (index in brands.indices) {
        println("brand at $index is ${brands[index]}")
    }

}


/**
 * when expression
 * @see <a href="https://kotlinlang.org/docs/reference/control-flow.html#when-expression">when-expression</a>
 */
fun describeWhen(obj: Any): String = when (obj) {
    1 -> "one"
    "hello" -> "greeting"
    is Long -> "it's too long"
    !is String -> "not a String"
    else -> "unknown"
}
