fun main() {

    //while loop - has 3 parts

    var count = 45
    while(count <= 50){
        println("Number is $count")
        count++
    }

    // program 2
   var number = 10
    while (number >=5 ){
        println(number)
        number--
    }

    // Do while loop
    var x = 1
    do {
        println("Number is $x")
        x++
    }
        while (x <= 5 )



      // for loop
    for (num in 30..40){
        println("Number is $num")

    }

    for (letter in 'a'..'d'){
        println("The letter is $letter")
    }

    //break
    var i = 0
    while (i < 20) {
        println(i)
        i++
        if (i == 18) {
            break
        }
    }

    //continue
    var y = 0
    while (y < 10) {
        if (y == 4) {
            y++
            continue
        }
        println(y)
        y++
    }









}