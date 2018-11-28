package com.domino.basic.classes

import com.domino.basic.classes.dataClasses.DominoPizza

/**
 * Created by nhs312@gmail.com on 2018. 9. 13..
 */

fun classesExample() {

    //    var member = Member("domino", "commerce")
    //    println("member's name is ${member.name} " +
    //            "and he is ${member.age} years old")

    //    var koreanMember = KoreanMember("domino", "AI", 12345_1234)
    //    println("my name is ${koreanMember.name} and working for ${koreanMember.depo}" +
    //            "\n S/N is ${koreanMember.socialNumber}")

    destructuring()

    println("##########################");
    returnTwoValues()
}

fun destructuring() {
    val pepperoniPizza = DominoPizza("Pepperoni", "Large")
    //    println(dominoPizza.toString())
    //    println(dominoPizza.hashCode())
    val supremePizza = DominoPizza("Supreme", "Family")
    val cheesePizza = DominoPizza("cheese", "Large")

    val pizzas = listOf<DominoPizza>(pepperoniPizza, supremePizza, cheesePizza)

    // destructuring
    val (name, size) = pepperoniPizza

    println(name)
    println(size)

    // better simply using destruction in loop
    for ((nameOfPizza, sizeOfPizza) in pizzas) {
        println("name : $nameOfPizza\n" +
                "size : $sizeOfPizza")
    }
}

/**
 * package side
 *
 * Top-Level declaration rule
 *  public : default - visible everywhere
 *  private : inside this file
 *  internal : visible in same module
 *  protected : not available for top-level declarations.
 *
 * to use a visible top-level declaration from another package, you should still import it.
 * 이것이 기본 룰
 */

fun visibleFun() {
    println("I'm visible")
}

private fun invisible() {
    println("I'm an invisible man")
}

/**
 * for member inside class rule
 */

/**
 * inside class
 *
 * private : visible inside this class(including all its members
 * protected : private + visible in subclass too
 * internal : any client inside this module who sees the declaring class sees its internal members.
 * 즉 같은 모듈에서 internal로 선언한 때만.
 * public : any
 *
 * outer class does not see private members of its inner classes in Kotlin.
 *
 */
open class Outer {

    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4

    class nested {
        public val e = 5
    }

}

class Inner : Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    override val b = 10 // 'b' is protected
}

class Domino {
    val width: Int = 120
    val height: Int = 80
}

fun runAboutApply() {
    val desk = Domino()

    with(desk) {
        println(width)
        println(height)
    }
}

// primary constructor can be omitted
open class Member(val name: String, val depo: String) {
    open val company = "NHN"
    var age: Int = 0

    // then called secondary constructor
    // this is secondary constructor
    constructor(name: String, depo: String, age: Int) : this(name, depo) {
        this.age = age
    }

    // first called init
    // initialize block is a part of primary constructor
    init {
        println("Member initialize!")
        println("name : $name, depo : $depo, age : $age company : $company")
    }

    open fun getLengthOfName(): Int {
        return name.length
    }

    fun getAmericanAge(): Int {
        return age - 1
    }

}

// inheritance
class KoreanMember : Member {
    var socialNumber: Int = 0
    override val company = "NHN KOREA"

    init {
        println("social number is $socialNumber")
    }

    constructor(name: String, depo: String, socialNumber: Int) : super(name, depo, 34) {
        this.socialNumber = socialNumber
    }

    override fun getLengthOfName(): Int {
        return socialNumber
    }
}

fun returnTwoValues() {
    data class Something(var no: Int, var name: String)

    fun someFunc(obj: Something): Something {
        println("execute some function")

        obj.no = 1
        obj.name = "white box"

        return obj
    }

    val box = Something(1, "black box")

    println(box.no)
    println(box.name)
    // unused variables -> underscore _
    // val (_, boxName) = someFunc(box)
    val (boxNo, boxName) = someFunc(box)

    println(boxNo)
    println(boxName)
}

