package Loops_Break_Continue

fun main() {
    //break
    for (i in 1..10 step 2){
        println("Before if:$i")
        if (i==7){
            break
        }
        println("After if:$i")
    }
    //continue
    for (i in 1..10 step 2){
      //  println("Before continue:$i")
        if (i==7){
            continue
        }
        println("Continue:$i")
    }
    //return
}