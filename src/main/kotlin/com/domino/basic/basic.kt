package com.domino.basic

/**
 * Created by nhs312@gmail.com on 2018. 9. 12..
 */
fun basicFuncs() {
    instantiateClass()
}

/**
 * defining functions
 * @see <a href="https://kotlinlang.org/docs/reference/functions.html">functions</a>
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

// return type can be omitted;
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

// inferring return type
fun subtract(a: Int, b: Int) = a - b


// define variables
fun defineVariables() {

    // type can be inferred
    val var1 = 1
    val var2 = "domino"

    val var3: Int
    var3 = 4

    // immutable vs mutable variables
    val a: Int = 100
    var b: Int = 5

    println("")
}

/**
 * string template
 * @see <a href="https://kotlinlang.org/docs/reference/basic-types.html#string-templates">string template</a>
 */
fun stringTemplate() {
    var a = 1

    val s1 = "a is $a"

    a = 2

    // can use arbitrary expression
    println("${s1.replace("is", "was")}, but a is $a now")
}


/**
 * basic classes
 * @see <a href="https://kotlinlang.org/docs/reference/classes.html">classes</a>
 * @see <a href="https://kotlinlang.org/docs/reference/object-declarations.html">instance</a>
 */
fun instantiateClass() {
    val animal = Animal(feline = "cat", canine = "dog")

    println(animal.canine)
    println(animal.feline)

    val creditCardNumber = 1234_5678_9012_3456L

    println(creditCardNumber)
}

class Animal(val feline: String, val canine: String)
