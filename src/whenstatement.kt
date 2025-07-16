import java.util.Scanner

fun main() {

    var read = Scanner(System.`in`)

    println("Enter marks : ") // prompt message
    var marks = read.nextInt()

    var grade = when {   // conditions
        marks >= 90 -> "A+"
        marks >= 80 -> "A"
        marks >= 70 -> "A-"
        marks >= 60 -> "B+"
        marks >= 50 -> "B"
        else -> "E"
    }


    println("Scored : $grade")







}