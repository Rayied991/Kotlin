package Control_flow

fun main() {
    //Control Flow
    //if-else expression

    val num1=10
    val num2=20
    //We can use a single if if we want
    //But cannot use single else
   // if(num1>num2){
//        println("$num1 is greater than $num2")
//
//    }
    //Writing code in 1 line
    //val result2=if(num1>num2)"$num1 is greater than $num2"  else "$num2 is greater than $num1"
  //  println(result2)


    //if you don't want to store the result into a variable then u should code this way(use print/println)
//    if(num1>num2){
//        println("$num1 is greater than $num2")
//
//    }
//    else{
//        println("$num2 is greater than $num1")
//
//    }




    //if you  want to store the result into a variable then u should code this way(no print/println)
    val result=if(num1>num2){
        "$num1 is greater than $num2"
    }
    else{
        "$num2 is greater than $num1"

    }
    println(result)
    //if-else ,if-else ladder expression

    val num=10
    val answer=if(num>0){
        "$num is Positive"
    }
    else if(num<0){
        "$num is Negative"
    }
    else{
        "$num is Zero"
    }
    println(answer)
    //nested if expression

    val number1=25
    val number2=20
    val number3=30
    val res=if(number1>number2){
        val max=if(number1>number3){
            number1
        }
        else{
            number3
        }
        "Body of if "+max
    }
    else if(number2>number3){
        "Body of else if"+number2
    }
    else{
        "Body of else"+number3
    }
    println("$res")

}