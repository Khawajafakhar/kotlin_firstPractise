package com.example.myfirstapp

fun main(){
    /*set remove duplicates from a itterable
    Set are also immutable
     */
    var fruit = setOf("Orange","Apple","Grape","Apple","Orange")
    println(fruit.toSortedSet())


    /*
    maps are also mutable
    We have to convert it mutable in order t update them
     */
    val daysOfTheWeek = mapOf(1 to "Monday",2 to "tuesday",3 to "wednesday")

    for (key in daysOfTheWeek.keys){
        print("$key is to ${daysOfTheWeek[key]} ")
    }

    val fruitsMap = mapOf("Fav" to Fruit("Grape",2.5),
        "ok" to Fruit("Apple",1.0))
    println(fruitsMap)

    val newFruit = fruitsMap.toMutableMap()
    newFruit["close"] = Fruit("banana" , 3.6)
    println(newFruit.toSortedMap())

}