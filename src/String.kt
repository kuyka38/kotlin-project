//to print out a single character you use the index position which uses the special brackets

fun main() {
    var text = "Hello world"
    var firstname = "Kuyka"
    var lastname = "Kunji"

    println(text)
    println(text[1]) // printing a single variable in a text
    println( firstname + lastname) // string concatination using the + sign
    println( firstname + " " +lastname)// when creating space between two words use the ""


    //Modifying a string
    println(text.uppercase())// to print in uppercase just use fullstop and it will bring options
    println(firstname.lowercase())


    //string interpolation - write everything in a single line but the variables should be accompanied by a dollar sign
    println("My fullname is $firstname $lastname")


}