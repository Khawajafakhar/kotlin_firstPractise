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

}

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
    init {
        println("Mobile Phone $osName $brand $model")

    }
}