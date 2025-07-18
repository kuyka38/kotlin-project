//classes borrow what other classes have
//this is the parent class/ super class/ base class
 open class Animal{

    var hasFeathers = true
    var hasWings = false

    fun speak(){
        println("Animal is speaking")
    }

}


//child class/second class
class Duck : Animal(){
    var color = "white"
    fun swim (){
        println("Duck is swimming")
    }
}

fun main() {
        var a = Animal()


        var d = Duck()
        d.speak()
    println(d.color)
    println(d.hasFeathers)
}