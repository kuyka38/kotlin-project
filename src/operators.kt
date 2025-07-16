//operators
fun main() {
    //Arithmetic operators
    var num1 = 30
    var num2 = 5

    println(num1 + num2)
    println(num1 - num2)
    println(num1 * num2)
    println(num1 / num2)
    println(num1 % num2)


    //comparison operators
    println(num1 < num2)
    println(num1 > num2)
    println(num1 <= num2)
    println(num1 >= num2)
    println(num1 == num2)
    println(num1 != num2)

    //Assignment operators- assign values to variables
    var x = 90
    x -= 4

    println(x)

   //logical operators - && represents and , || represents or, (!) is a not and it reverses the answer
    var log = 56
    println(log < 100 && log > 89)
    println(log < 100 || log > 89)
    println(!(log < 100 || log > 89))




}