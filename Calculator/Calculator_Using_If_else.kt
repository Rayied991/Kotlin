package Calculator

import java.util.*

fun main() {
    var input=Scanner(System.`in`)
    println("Enter first Number:")
    var num1:Float=input.nextFloat()
    println("Enter Second Number:")
    var num2:Float=input.nextFloat()
    choice(num1,num2)


}
fun choice(num1:Float,num2:Float) {
    println("1.Addition")
    println("2.Subtraction")
    println("3.Multiplication")
    println("4.Division")
    println("5.Remainder")
    println("6.Exit")
    println("Choose an Option:")
    var input = Scanner(System.`in`)
    var sum: Float;
    var sub: Float;
    var mul: Float;
    var div: Float;
    var rem: Float;
    var choice: Int = input.nextInt()
    while (true) {
        if (choice == 1) {
            sum = num1 + num2;
            println("Summation is= $sum")
            break

        } else if (choice == 2) {
            sub = num1 - num2;
            println("Subtraction is= $sub")
            break

        } else if (choice == 3) {
            mul = num1 * num2;
            println("Multiplication is= $mul")
            break

        } else if (choice == 4) {
            div = num1 / num2;
            println("Division is= $div")
            break

        } else if (choice == 5) {
            rem = num1 % num2
            println("Remainder is= $rem")
            break

        } else if (choice == 6) {
            break

        } else {
            println("Wrong Option Chosen")
            break

        }
    }
}

