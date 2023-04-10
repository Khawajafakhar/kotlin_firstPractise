package com.example.myfirstapp

fun main(){
    var sum= 0.0
    val data = ArrayList<Double>()
    data.addAll(arrayListOf(20.0,30.0,40.0,50.0,60.0))
    println(data.size)
    for (i in data){
      sum +=i
    }

    println(sum/data.size)
}