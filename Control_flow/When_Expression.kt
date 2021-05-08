package Control_flow

fun main() {
    //Kotlin When Expression
    /*

    Kotlin,when expression is  a conditional expression which returns the value .Kotlin,
    when expression is replacement of switch statement .Kotlin,
    when expression is works with a switch  statement of other language(Java,C,C++)
     */
    var number=7
    //Using when with range function
    val ran=when(number){
        in 1..5-> "Input is provided in the  range 1 to 5"
        in 6..10-> "Input is provided in the  range 6 to 10"
        else-> "None of the Above"
    }
    println(ran)




//   val sea= when(number){
//        3,4,5,6->
//            "This is Summer Season"
//        7,8,9->
//            "It is Rainy Season"
//        10,11->
//          "It is Autumn Season"
//        12,1,2->
//            "It is Winter Season"
//        else->
//           "Invalid Input"
//    }
//    println(sea)




//    when(number){
//        1-> {println("One")
//            println("This is One")}
//        2->{println("Two")
//            println("This is two")
//            }
//        3->{println("Three")
//            println("This is Three")
//        }
//        4->{println("Four")
//            println("This is four")
//        }
//        5->{println("Five")
//            println("This is five")
//        }
//        else->println("Invalid Number")
//
//    }




//    var numberprovided=when(number){
//        1->"One"
//        2->"Two"
//        3->"Three"
//        4->"Four"
//        5->"Five"
//        else->"Invalid Number"
//
//    }
    //println("Your provided Number is= $numberprovided")
}