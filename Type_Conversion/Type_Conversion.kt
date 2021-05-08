package Type_Conversion

fun main() {
    //Kotlin Type Conversion
    //type Conversion is a process in which one data type variable is converted into another data type
   //Type casting in kotlin
    var number=10
    var num2:Long=number.toLong()
    println(num2)

    var num1:Long=1234556
    var num3:Int=num1.toInt()
    println(num3)

    var n1:Double=123.456778
    var n2:Long=n1.toLong()
    println(n2)
    var nn:Int=n2.toInt()
    println(nn)

    var str:String="10"
    println(str+10)
    var n:Int=str.toInt()
    println(n)
    println(n+10)

    var n5:Int=20
    var s1:String=n5.toString()
    println(s1)
}