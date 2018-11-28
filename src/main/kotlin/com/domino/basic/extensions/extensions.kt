package com.domino.basic.extensions

/**
 * Created by nhs312@gmail.com on 19/09/2018.
 */
/**
 * scope of extensions
 * 1. on the op level, directly under package
 * 2. outside fo this package, should import that
 */
fun extensionsExample() {
    testSwap()
    testSwapAny()
    printFoo(D())

    println("#############")
    E().foo()
    E().foo(2)
}

// extension for type
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

// extension for generic
fun <T> MutableList<T>.swapAny(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

fun testSwap() {
    val list = mutableListOf(1, 2, 3, 4, 5)

    list.swap(0, 4)
    for (item in list) {
        println(item)

    }
}

fun testSwapAny() {
    val list = mutableListOf("a", "b", "c")
    list.swapAny(0,2)
    for (item in list) {
        println(item)

    }
}


open class C

class D : C()

fun C.foo() = "C"
fun D.foo() = "D"

fun printFoo(c: C) {
    println(c.foo())
}

// for same name but a different signature, extension function can be overloaded
class E {
    fun foo() {
        println("I am the E")
    }
}

fun E.foo(i: Int) {
    println("I am the $i")
}


