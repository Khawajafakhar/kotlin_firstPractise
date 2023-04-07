package com.example.myfirstapp

fun main(){
  var fakhar = Person("Khawaja","Fakhar")
    var saad = Person()
    var samsung = MobilePhone();
    var apple = MobilePhone("IOs","Apple","Iphone 14")
    saad.age ="26"
    println(saad.age)
    println("heigth of Saad is ${saad.height}")
    saad.height =5.6
    println("Height updated ${saad.height}")
   val user1 = User(1,"Fakhar")
    println("Data class user ${user1.name}")
    user1.name ="Saad"
    println("Data class user name updated ${user1.name}")
    println("User details : $user1")

    apple.chargeBattery(30);

}

//We can also create a data class
data class User(val id:Int,var name:String)

class Person(firstName: String = "Saad", lastName: String = "Malik"){
   lateinit var age: String
    // init is an initializer block that will auto run when any object will be created
    init {
        println("Person created $firstName $lastName")
    }

    //we can also create custom setter in the below format
    var height: Double = 6.1
        get() {
            return field
        }
        set(value) {
            field = if (value > 5.5) value else height
        }
}

class MobilePhone(osName: String ="Android",brand: String ="Samsung",model: String = "Galaxy S20 Ultra"){
   var battery: Int = 45

    init {
        println("Mobile Phone $osName $brand $model")

    }
//Challenge solved
    fun chargeBattery(battery: Int){
        var batteryToBeCharged =battery
        println("Phone had ${this.battery} battery and phone is charged by 30 and now it has ${this.battery + batteryToBeCharged}")
        println(this.battery)
    }
}