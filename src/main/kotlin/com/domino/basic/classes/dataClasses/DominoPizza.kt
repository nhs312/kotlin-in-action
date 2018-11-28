package com.domino.basic.classes.dataClasses

/**
 * Created by nhs312@gmail.com on 19/09/2018.
 */

/**
 * rules of data class
 * the primary constructor needs to have at least one parameter
 * all primary constructor parameters need to be marked as val or var
 * data classes cannot be abstract, open, sealed or inner
 * data classes may only implement interfaces
 */
data class DominoPizza(val name: String, val size: String)
