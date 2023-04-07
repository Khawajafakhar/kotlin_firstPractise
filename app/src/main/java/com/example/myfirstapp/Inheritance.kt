package com.example.myfirstapp


interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("brake pressed")
    }
}

open class Car(name: String, Model : String, override val maxSpeed: Double): Drivable{
   open var range: Double = 0.0
   open fun extendRange(amount: Double){
        if (amount > 0){
            range += amount
        }
    }

    override fun drive(): String {
        return "This is a drive feature of interface in Car"
    }

   open fun distanceCovered(distance: Double){
        println("Distance covered by car is $distance")
    }

}

class ElectricCar(name: String, Model: String, batteryLife: Double, maxSpeed: Double):Car(name, Model,
    maxSpeed
){
    override var range: Double = batteryLife*6

    override fun distanceCovered(distance: Double) {
        println("Distance covered by electeric car @override  $distance")
        super.distanceCovered(distance)
    }
      fun distanceCovered(){
          println("Distance By Prious $range")
      }

    override fun drive(): String {
        super.drive()
        return "In electric Car"
    }


}

fun main(){
    var hondaCity = Car("Honda","2017",300.0)
    var prious = ElectricCar("Prious","2017",80.0,500.0)

    prious.distanceCovered(250.0)
    prious.distanceCovered()

   println(hondaCity.drive())
    println(prious.drive())
    prious.brake()

}