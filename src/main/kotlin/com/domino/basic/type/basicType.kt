package com.domino.basic.type

/**
 * Created by nhs312@gmail.com on 2018. 9. 12..
 */
fun basicTypeExample() {
    basicLiterals()
}

fun basicLiterals() {
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    // equality vs identity
    val a: Int = 1010
    println(a == a)
    val anotherA: Int? = a
    val theOtherA: Int? = a
    println(anotherA == theOtherA) // preserve equality

    println(a === a)
    println(anotherA === theOtherA) // preserve identity

    // explicit conversions
    explicitConversions()
}

/**
 * @see <a href="https://kotlinlang.org/docs/reference/basic-types.html#explicit-conversions">explicit conversions</a>
 */
fun explicitConversions() {
    println("============================")
    // smaller -> bigger X
    // impossible to execute
//    val a: Int? = 3
//    val b: Long? = a
//    println(a)

    val aa: Byte = 1
    val bb: Int = aa.toInt()

    println(bb)
}

/**
 * @see <a href="https://kotlinlang.org/docs/reference/basic-types.html#arrays">arrays</a>
 */
fun arrays() {

    val firstArray = arrayOf(1, 2, 3)
    firstArray.forEach { println(it) }

    firstArray.set(1, 5)
    firstArray.forEach { println(it) }

    val a: Array<Int> = arrayOf(1, 2, 3)
    val b: Array<String> = Array(3) { "" }

}

fun copyArray(from: Array<out Any>, to: Array<Any>) {
    assert(from.size != to.size)
    for (i in from.indices) {
        to[i] = from[i]

    }
}
