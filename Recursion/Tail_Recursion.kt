package Recursion

fun main() {
    /*
    Kotlin Tail Recursion
    Tail recursion is a  recursion which performs the calculation first,
    then makes the recursive call.
    The result of current step is passed into the next recursive call
     */
   // println(recursivesum(10))
    println(recursivesum(100000))//to solve this problem we will use tail recursion

}
//tail recursive
tailrec fun recursivesum(num:Long,answer:Long=0):Long{
    return if(num<=0){
        answer
    }
    else{
        recursivesum((num-1),num+answer)
    }
}