package com.domino.basic.classes.generics

/**
 * Created by nhs312@gmail.com on 20/09/2018.
 */

fun genericsExample() {

    println(Dough.THIN)
    println(Dough.THIN.exp)

}

enum class Dough(val exp: String) {
    THIN("thin"),
    NORMAL("normal")
}
