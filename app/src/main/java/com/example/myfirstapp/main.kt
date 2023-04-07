package com.example.myfirstapp

fun main(){
  var name :String = "Fakhar"
    //name variable is not of nullable type so we cant assign null to it
   // name =null

    var nullableName :String? = "Khawaja"
    //Question mark with a type makes a variable nullable
   // nullableName = null

    var len = name.length
    //To access nullable variable properties you have to use '?' to tell it can be null
    var len2 = nullableName?.length

   val nameWithElvis = nullableName ?: "Guest"
    println("Name is $nameWithElvis")

   println(nullableName!!.lowercase())

}