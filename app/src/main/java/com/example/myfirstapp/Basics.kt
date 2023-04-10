package com.example.myfirstapp

fun main(){
    //Three ways of writing arrays
   val numbers:IntArray = intArrayOf(1,2,3,4,5,6)
    val number = intArrayOf(1,2,3,4,5,6)
    val numb = arrayOf(1,2,3,4,5,6)

    //println(numb.contentToString())

   // for(element in numbers){
    //    print(element)
   // }

    //Modifying elements in an array
    println(number[3])
    number[3] = 7
    println(number[3])

      val fruits = arrayOf(Fruit("apple",2.5),Fruit("Mango",3.5))

}

data class  Fruit(val name: String, val price: Double)