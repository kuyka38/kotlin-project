// 1. Kotlin program to check leap year

import java.util.Scanner

fun main() {


    val reader = Scanner(System.`in`)

    print("year: ")
    val year = reader.nextInt()

    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        println("$year is a leap year.")
    }

    else {
        println("$year is not a leap year.")
    }




}
