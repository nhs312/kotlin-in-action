package com.domino.basic.interfaces

/**
 * Created by nhs312@gmail.com on 19/09/2018.
 */

interface SchoolInterface {

    val name: String
    val location: String

    val numOfGrade: Int
        get() = 3

    fun apply()
    fun graduate()

}
