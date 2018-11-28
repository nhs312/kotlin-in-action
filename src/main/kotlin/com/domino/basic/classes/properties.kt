package com.domino.basic.classes

import java.math.BigDecimal

/**
 * Created by nhs312@gmail.com on 2018. 9. 18..
 */

/**
 * var <propertyName>[: <PropertyType>] [= <property_initializer>]
 *   [<getter>]
 *   [<setter>]
 */
fun propertiesExample() {
    val orangeFarm = Farm("dorange", "pangyo")

    println("name : ${orangeFarm.name}\n" +
            "location : ${orangeFarm.location}\n" +
            "ad : ${orangeFarm.bannerText}")

}

open class Farm(val name: String, var location: String?) {
    var price: BigDecimal = BigDecimal.ZERO

    val isFree: Boolean
        get() = this.price == BigDecimal.ZERO
    // return type can be omitted. same as above
    // val isFree get() = this.price == BigDecimal.ZERO

    var bannerText: String
        get() = if (this.price == BigDecimal.ZERO) {
            "this is free"
        } else {
            "price of this farm is ${this.price}"
        }
        set(value) {
            this.bannerText = value

        }

    lateinit var serialNo: Farm


    constructor(name: String, location: String?, price: BigDecimal) : this(name, location) {
        this.price = price
    }

}

