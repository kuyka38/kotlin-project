import java.util.Scanner

fun main() {
    print("Enter a number: ")
    val input = readLine()

    if (input != null) {
        val number = input.toInt()

        if (number % 2 == 0) {
            println("$number is even.")
        } else {
            println("$number is odd.")
        }
    } else {
        println("Invalid input.")
    }
}
