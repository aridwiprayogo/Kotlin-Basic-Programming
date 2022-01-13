package com.example.kotlinbasicprogramming.oop

fun main() {
    val person = Person(
        name = "Ari Dwi Prayogo",
        age = 23,
        contact = 88227659785
    )
    person.myName
}

class Person constructor(
    private val name: String,
    private val age: Int,
    private val contact: Long
) {
    internal val myName = "First property: $name".also(::println)

    init {
        println("hello my name is $myName")
    }

}