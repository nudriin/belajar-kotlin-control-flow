package com.nudriin

fun main() {
    var ranges = 1..5
    for (i in ranges){
        println("value is $i!")
    }

    ranges = 1.rangeTo(5)
    for (i in ranges){
        println("value is $i!")
    }

//    Mengakses index menggunakan with index
    ranges = 1.rangeTo(10)
    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }

    ranges.forEach{ value ->
        println(value)
    }
}