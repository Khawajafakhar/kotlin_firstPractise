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

    /*There are several differences between a list and an array
       extra functionality to perform on list etc list.size
       lists are immutable , we cannot update list until we make it a mutable list

     */
    val months = listOf("Jan","Feb","Mar")
    println(months[1])
    val anotherList = months.toMutableList()
    val moreMonths = arrayOf("Apr,May,June")
    anotherList.addAll(moreMonths)
    println(anotherList)
    anotherList.addAll(2,arrayOf("Mid Feb").toList())
    println(anotherList)
    anotherList.addAll(arrayOf("july","august","september","oct","Nov","Dec"))
    println(anotherList)

    /*
    We can also make the list mutable when we create it
     */

    val days = mutableListOf<String>("Mon","tue","thur")
    println("mutable list $days")
    days.add("wed")
    days[2] = "fri"
    days.removeAt(0)
    println("mutable list $days")


}

data class  Fruit(val name: String, val price: Double)