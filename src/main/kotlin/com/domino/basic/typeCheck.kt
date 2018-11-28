package com.domino.basic

/**
 * Created by nhs312@gmail.com on 2018. 9. 12..
 */

/**
 * @see <a href="https://kotlinlang.org/docs/reference/classes.html">classes</a>
 * @see <a href="https://kotlinlang.org/docs/reference/typecasts.html">type checks</a>
 */
fun getStringLength(obj: Any): Int? {

    // or if(obj !is String)
    if (obj is String) {
        return obj.length
    } else {
        println("obj is not a String")
    }
    return null
}
