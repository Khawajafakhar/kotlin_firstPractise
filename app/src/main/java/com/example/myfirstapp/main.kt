package com.example.myfirstapp

fun main(){
  var fakhar = Person("Khawaja","Fakhar")
    var saad = Person()
    var samsung = MobilePhone();
    var Apple = MobilePhone("IOs","Apple","Iphone 14")
}

class Person(firstName: String = "Saad", lastName: String = "Malik"){

    // init is an initializer block that will auto run when any object will be created
    init {
        println("Person created $firstName $lastName")
    }
}

class MobilePhone(osName: String ="Android",brand: String ="Samsung",model: String = "Galaxy S20 Ultra"){
    init {
        println("Mobile Phone $osName $brand $model")

    }
}