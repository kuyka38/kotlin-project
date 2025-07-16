//prompts user to type a value
// in kotlin u need a class called scanner, import from java library. it must always be called

import java.util.Scanner

fun main() {
   var read = Scanner(System.`in`)

    println("Enter your fullname : ")
    var fullname = readln() //this is called when typing a text value
    println("Fullname : $fullname")


    println("How old are you (in years?) : ")
    var age = read.nextInt() // called when entering an integer
    println("Age : $age")

    println("Enter Weight (in Kg ) :")
    var weight = read.nextDouble() // called for decimals
    println( " Weight : $weight")

    println()

    println("Summary of your information ")
    println("Fullname : $fullname")
    println("Age : $age years old")
    println("Weight: $weight in kg")


}