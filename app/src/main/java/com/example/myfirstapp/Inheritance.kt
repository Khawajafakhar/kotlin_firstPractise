package com.example.myfirstapp

open class Car(name: String, Model : String){
   open var range: Double = 0.0
   open fun extendRange(amount: Double){
        if (amount > 0){
            range += amount
        }
    }

   open fun distanceCovered(distance: Double){
        println("Distance covered by car is $distance")
    }

}

class ElectricCar(name: String, Model: String,batteryLife: Double):Car(name, Model){
    override var range: Double = batteryLife*6

    override fun distanceCovered(distance: Double) {
        println("Distance covered by electeric car @override  $distance")
        super.distanceCovered(distance)
    }
      fun distanceCovered(){
          println("Distance By Prious $range")
      }
}

fun main(){
    var hondaCity = Car("Honda","2017")
    var prious = ElectricCar("Prious","2017",80.0)

    prious.distanceCovered(250.0)
    prious.distanceCovered()

}