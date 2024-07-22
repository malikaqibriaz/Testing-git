package com.example.gemnine1
import java.lang.Exception
class `fun` {

    fun main(){
        val city="Isb"
        var weight=100.1F
        weight= 230.1F
        val height=1.22
        val alive=true
        println(city)
        println(weight)
        println(height)
        println(alive)



        var number1=10.3
        var number2=20.5
        var result:Double
        result= number1 + number2
        println("$number1 + $number2 = $result")
        try {
            print("Emter 1st number: ")
            var num1 = Integer.valueOf(readLine())
            print("Enter 2nd numbr: ")
            var num2 = Integer.valueOf(readLine())
            var results = num1 + num2
            println("Answer is: $num1 + $num2= $results")
        } catch (e: Exception){
            println("Enter Integer Values only")
        }
        var app= mutableListOf<String>("Aqib", "Malik", "Ali")
        app.add("Faisal")
        app.add(2, "Pakistani")
        println(app)
        var summ: String? =null
        if (summ != null) {
            println("Not Null")
        } else {
            println("Null")
        }
        try {
            fun String.getaask(): String {
                return when {
                    last() == '?' -> "Questioning"
                    last() == '!' -> "Excuse"
                    last() == '*' -> "Detail"
                    else -> "No Emotions"
                }
            }
            print("How are you")
            var a = readLine()
            if (a != null) {
                println(a.getaask())
            }
        }
        catch (e: Exception) {
            println("Invalid Answer")
        }
    }
}