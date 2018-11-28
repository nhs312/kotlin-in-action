package com.domino.basic.interfaces

import java.math.BigDecimal

/**
 * Created by nhs312@gmail.com on 19/09/2018.
 */
interface SpecialSchoolInterface : SchoolInterface {
    val govermentGrant: BigDecimal
        get() = BigDecimal(1_000_000)

    override fun apply() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("applying special school")
    }
}
