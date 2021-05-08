package Argument

fun main() {
    //Kotlin function Default and Name Argument
     run(10,'M')
    run(10)
    run(letter = 'K')
}
fun run(num:Int=5,letter:Char='x'){
    println("Parameter in function definition $num and $letter ")
}