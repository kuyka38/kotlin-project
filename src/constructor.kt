class Employee(var name :String, var position : String, var salary : Double, var status : String ){
    fun work (){
        println("Employee is working")
    }


}

fun main() {

    var employee1 = Employee("Austin", "CEO", 560000.00, "Engaged")
    println(employee1.name + " " + employee1.position)


    var employee2 = Employee("Kuyka", "Manager", 67000.00, "Engaged")
    println(employee2.name + " " + employee2.position)

    var employee3 = Employee("Evans", "Director", 880000.00, "single")
    println(employee3.name + " " + employee3.position)

    var employee4 = Employee("Victor", "Accountant", 710000.00, "married")
    println(employee4.name + " " + employee4.position)


}