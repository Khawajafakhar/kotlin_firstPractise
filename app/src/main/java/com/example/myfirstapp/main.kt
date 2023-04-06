package com.example.myfirstapp

fun main(){
    // Control Flows
    // If Statements
    val age = 17
    if(age >= 21){
        println("now you may drink in the US")
    }
    // Else If Statement - only executed if the if statement is not true
    else if(age >= 18){
        println("now you may vote")
    }
    // Else If Statement - only executed if the foregoing else if statement is not true
    else if (age >= 16){
        println("you now may drive")
    }
    // else is only executed if all of the foregoing statements weren't true
    else{
        println("you're too young")
    }

    // Kotlin’s "when" expression is the replacement of the switch statement
    // from other languages like C, C++, and Java.
    // It is compact and more powerful than switch statements.
    var season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> println("Fall")
        4 -> println("Winter")
        else -> println("Invalid Season")
    }
    var month = 3
    when(month) {
        1,2,3 -> println("Spring")
        in 4..6 -> println("Summer")
        in 7..9 -> println("Fall")
        in 10..12 -> println("Winter")
        else -> println("Invalid Season")
    }

    // challenge - translate the if statement with the age to a when expression
    when(age){
        // with the !in it's the same as saying not in ...
        !in 0..20  -> println("now you may drink in the US")
        in 18..20  -> println("now you may vote")
        16,17 -> println("you now may drive")
        else -> println("you're too young")
    }

    var x : Any = 13.37
    when(x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }


    var numb = 100

    while (numb >= 0){
        print(numb)
        numb -= 2
    }
    println("\nWhile Loop is done")

    //will start from 1 and end at 10
    for(num in 1..10){
        print("$num")
    }
    println("\nfor loop is done")

  // will start from 1 and ends before 15
    for(i in 1 until 15){
        print("$i ")
    }
    println("\nUNTIL KEYWORD for loop is done")

     for (i in 10 downTo 1 step 3){
         print("$i ")
     }
    println("\nDOWNTO KEYWORD for loop is done")


    for (i in 0 until 10000){

        if(i == 8001){
            println("IT'S OVER 8000")
        }else if (i == 9001){
            println("IT'S OVER 9000")
        }
    }

    var humidityLevel = 80
    var humidity = "humid"

    while(humidityLevel >= 60){
        if (humidity == "humid"){
            humidityLevel -= 5
            println("humidtyLevel Decreased")
        }
    }
    if(humidityLevel < 60){
        println("It's comfy now")
        humidity = "comfy"
    }

}