fun main() {
    // standard library functions / built-in functions
    var result = Math.sqrt(81.0)
    println("The result is $result")

    var number = Math.round(67.8)
    println(number)

    school()
    divide()
    student("Kuyka", 11, "Male" )
    student("Teecha", 13, "Female" )
    student("Kunji", 17, "Male" )

}

//use-defined functions- name, brackets, calibres
fun school(){
   println("eMobilis")
}

fun divide (){
    var num1 = 56
    var num2 = 7

    println(num1/num2)
}


//parameter and argument

fun student(name:String, age: Int, gender: String){
    println("$name $age $gender")
}











