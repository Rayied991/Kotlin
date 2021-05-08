package Loops_Break_Continue

fun main() {
    //Kotlin for loop
    //in for loop outside of loop no variable is not need to declare
    val number= arrayOf(10,20,30,40,50)
    println(number[0])
    for (i in number.indices) {//indices=index number
        //indices used for printing position
        println("Index->$i=${number[i]}")
    }
    //without position
    for(i in number){
        println("Just Print=$i")
    }
    //Printing number from 1 to 5
    for (i in 1..5){
        println("Upwards=$i")
    }
    //Printing number from 5 to 1
    for (i in 5 downTo 1){
        println("Downwards=$i")
    }
    //Printing odd numbers
    for (i in 1..10 step 2){
        println("Odd numbers=$i")
    }
    //Printing downwards and also odd numbers
    for (i in 10 downTo 1 step 3){
        println("Even Numbers with downwards=$i")
    }



    //Kotlin While loop
    //in for loop outside of loop no variable is not need to declare
    //but in while loop you need to declare

    var i=1
    while (i<=5){
        println("Inside while loop:")
        println(i)
        i++
    }
    //infinite loop
//    while (true){
//        println("Infinite loop")
//    }
    //Kotlin Do-While loop
    ///in do-while if the condition is false then the code will run at least 1 time

    var i1=100
    do {
        println(i1)
        i1++
    } while (i1<=5)
}