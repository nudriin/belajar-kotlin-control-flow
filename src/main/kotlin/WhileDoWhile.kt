package com.nudriin

fun main() {
    var counter = 1
    while (counter <= 7){
        println("Hello, World!")
        counter++
    }

    counter = 1
    do {
        println("Hello, World! $counter")
        counter++
    } while (counter <= 7)
}