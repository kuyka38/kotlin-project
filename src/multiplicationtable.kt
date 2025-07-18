//2. Kotlin program to generate a multiplication table

import java.util.Scanner

fun main() {


    val read = Scanner(System.`in`)

    print("Enter a number: ")
    val number = read.nextInt()

    println("multiplication table for $number:")

    for (i in 1..15) {
        println("$number x $i = ${number * i}")


    }



}
