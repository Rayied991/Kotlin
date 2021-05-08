package Operators

fun main() {

//kotlin Operators
//1.Arithmetic Operators
    var a=10
    var b=5
    println(a+b)
    println(a-b)
    println(a*b)
    println(a/b)
    println(a%b)
//2.Relational Operators

    val a1=5
    val b1=10
    val max= if(a1!=b1)
    {
        println("a1 is greater than b1")

        a1

    }
    else{
        println("b1 is greater than a1")
        b1

    }
    println("max= $max")
//3.Assignment Operators

    var num=10
    num=num+5
    println(num)
    num+=5
    println(num)
    num-=5
    println(num)
    num*=5
    println(num)
    num/=5
    println(num)
    num%=190
    println(num)
//4.Unary Operators(increment and decrement)
    var a2=10
    var b2=5
    var flag=true
    println("+a:"+ +a2)//10
    println("-a:"+ -b2)//-5
    println("++a:"+ ++a2)//11
    println("--b:"+ --b2)//4
    println("a++:"+ a2++)//11
    println( a2)//12
    println("b++:"+ b2++)//4
    println( b2)//5
    println("!flag:"+ !flag)//false

//5.Logical Operators
    var c=10
    var d=5
    var e=15
    var check=false
    var result:Boolean
    result=(c>d) && (c>e)
    println("(c>d) && (c>e):$result")//flase
    result=(c>d) || (c>e)
    println("(c>d) && (c>e):$result")//true
    result=!check
    println("!check:$result")//true
//6.Bitwise Operators
    var a3=10
    var b3=2

    //shl->left shift
    println("Left shift:"+a3.shl(b3)) //a3=10 b3=2 ; a3 will be doubled the times of b3
    //if a3=10 b3=3 result=10//20//40//80(for times 3)
    println("Right shift:"+a3.shr(b3))// a3=10 b3=2 ; a3 will be halfed by the times of b3
    //if a3=10 b3=2 result=10//5//2(for times 2)
    println("Unassigned right shift:"+a3.ushr(b3))
    println("And:"+a3.and(b3))
    println("Or:"+a3.or(b3))
    println("X-OR:"+a3.xor(b3))
    println("Inverse:"+a3.inv())


}