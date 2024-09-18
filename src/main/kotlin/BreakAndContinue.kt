package com.nudriin

fun main() {
    /*
    * Pada Kotlin, sebuah expression dapat ditandai dengan sebuah label.
    * Label pada Kotlin memiliki sebuah identifier yang diikuti dengan tanda @.
    * Contoh dari sebuah label adalah foo@ atau bar@.
    * */
    loop@ for (i in 1..10) {
        println("Outside Loop $i")

        for (j in 1..10) {
            if ( j > 5) break@loop
            println("Inside Loop $j")
        }
    }
}
