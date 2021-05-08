package Functions

import java.util.*

fun main() {
    /*
    Kotlin Function
    Function is a group of inter related  block of code  which performs  a specific task
    it makes reusability of code and makes program  more manageable.
     */
    //Standard library function

    println(Math.max(10,20))
    println(Math.min(10,20))
    println(Math.PI)
    println(Math.abs(-1))
    println(Math.ceil(2.9999))
    println(Math.floor(2.9999))
    //User defined Function
    println(greater(20,30))
    println(sum())//30
    var input=Scanner(System.`in`)
    println("Enter any Number:")
    var num=input.nextInt()
    var evenodd=Evenodd(num)
    println(evenodd)



}
//User defined function must be created outside the main function
fun greater(num1:Int,num2:Int):Int{//Parameterized function
                if(num1>num2){
                    return  num1
                }
    else{
        return  num2
                }
}
fun sum(){//non parameterized function
    var num1=10
    var num2=20
    var sum=num1+num2
    println(sum)


}
fun Evenodd(number1:Int){
    if (number1%2==0){
        println("$number1 is Even")
    }
    else{
        println("$number1 is Odd")
    }

}