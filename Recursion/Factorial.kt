package Recursion

import java.util.*

fun main() {
    /*
    kotlin Recursion function
    Recursion function is a function which calls itself continuously
    This technique is called recursion
     */
    Recursion()
    var input=Scanner(System.`in`)
    println("Enter a number:")
    var num=input.nextInt()
    print("Factorial of $num is=")
    println(factorial(num))

}
var count=0
fun Recursion(){
    count++
    if(count<=10){
        println("This number= $count")
        Recursion()
    }

}
fun factorial(num:Int):Long{
    return if(num==1){
        num.toLong()
    }
    else{
        num* factorial(num-1)
    }
}