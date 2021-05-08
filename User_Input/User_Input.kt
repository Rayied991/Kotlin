package User_Input

import java.util.*

fun main() {
    //Kotlin Standard Input/output

    val input= Scanner(System.`in`)//Taking integer input using Scanner
    println("Enter your age:")
    var age:Int
    age=input.nextInt()
    println("Enter your name:")
    val name= readLine()//taking String input
    //Taking input as a integer
    var sal=Integer.valueOf(readLine())
    println("My name is= $name")
    println("My Age is= $age")
    println("Enter your salary:")
    println("My salary is:$sal")


}