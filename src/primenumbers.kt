// 3. Kotlin program to check whether a number is prime or not

import java.util.Scanner

fun main() {

    val read = Scanner(System.`in`)

    println("Enter the number: ")
    val number = read.nextInt()

    if (number <= 1) {

        println("$number is not a prime number.")
    }
    else {

        var isprime = true
        for (i in 2..number / 2) {
            if (number % i == 0) {
                isprime = false
                break
            }
        }

        if (isprime) {
            println("$number is a prime number.")
        }

        else {
            println("$number is not a prime number.")
        }
    }
}
