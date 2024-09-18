package com.nudriin

fun main(){
//    When mirip seperti switch statemen
    var value = 4
    when(value) {
        1 -> println("Value 1")
        2 -> println("Value 2")
        3 -> println("Value 3")
        4 -> println("Value 4")
        5 -> println("Value 5")
        else -> println("No value match")
    }

    var stringOfValues = when(20) {
        1 -> "Value 1"
        2 -> "Value 2"
        3 -> "Value 3"
        4 -> "Value 4"
        5 -> "Value 5"
        else -> println("No value match")
    }

    println(stringOfValues)

    value = 2
    stringOfValues = when(value) {
        1 -> {
            println("Value 1")
            "Value 1"
        }
        3 -> {
            println("Value 1")
            "Value 1"
        }
        2 -> {
            println("Value 1")
            "Value 1"
        }
        else -> "No value match"

    }

    val anyType: Any = 120L
    when(anyType) {
        is Long -> println("Type is Long")
        is Int -> println("Type is Int")
        is String -> println("Type is String")
        else -> println("No value match")
    }

    value =  27
    val ranges = 10..50 // ini range 10 - 50

    when(value){
        in ranges -> println("value is in the range $ranges") // dalam rentang
        !in ranges -> println("value is outside the range")
    }

}