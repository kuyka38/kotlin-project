fun main() {
    var language = arrayOf("kotlin", "javascript","java")
    println( language [1])

    language [1] = "python"  // reassigning an element
    println(language[1])


    //looping through an array - displaying elements one at a time
    for (lang in language){
        println(lang)
    }


//determining the size of an array
    println(language. size)



}