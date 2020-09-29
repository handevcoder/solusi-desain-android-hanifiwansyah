package com.example.solusidesainandroid

fun main() {

    hello("hanif")
    hello("iWaNs")
    hello()
    hello(" ")
}

fun hello(name: String = " ") {
    return when {
        name != " " -> println("Hello ${(name.toLowerCase()).capitalize()}!")
        name == "" -> println("Hello, World!")
        else -> println("Hello, World!")
    }
}