import java.util.Scanner
// a simple calculator program that allows one to enter a first, second number, and operator using when statements

fun main() {
    val read = Scanner(System.`in`)

    println("Enter the first number:")
    var num1 = read.nextDouble()



    println("Enter an operator (+, -, *, /):")
    var operator = read.next()


    println("Enter the second number:")
    var num2 = read.nextDouble()



    var result = when (operator) {
        "+" -> num1 + num2
        "*" -> num1 * num2
        "-" -> num1 - num2
        "/" -> {
            if (num2 != 0.0) num1 / num2
            else {
                println("Error: Zero can't be divided.")
                return
            }
        }
        else -> {

            println ("Invalid")
            return
        }
    }





    println("Result: $num1 $operator $num2 = $result")
}
