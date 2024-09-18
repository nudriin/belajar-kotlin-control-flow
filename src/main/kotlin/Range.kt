package com.nudriin

fun main() {
    /*
    * Jarak antara dua nilai yang dicakup,
    * ditentukan oleh step.
    * Secara default, step bernilai 1
    * */
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    println( "\nStep : " + rangeInt.step)

    val rangeTo = 1.rangeTo(10) // 1 - 10
    rangeTo.forEach {
        print("$it-")
    }
    println()

    val rangeDown = 10.downTo(1) // 1 - 10
    rangeDown.forEach {
        print("$it-")
    }
    println()

    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }

    val rangeChar = 'A'.rangeTo('F')
    rangeChar.forEach {
        print("$it-")
    }
}