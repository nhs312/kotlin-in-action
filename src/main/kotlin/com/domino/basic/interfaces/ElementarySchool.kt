package com.domino.basic.interfaces

/**
 * Created by nhs312@gmail.com on 19/09/2018.
 */

class ElementarySchool : SchoolInterface {
    override val name: String = "판교 초등학교"
    override val location: String = "판교"
    override val numOfGrade: Int
        get() = 6

    override fun apply() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("applying elementary school")
    }

    override fun graduate() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("graduated elementary school")
    }
}
