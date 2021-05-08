package Datatypes_Variables

fun main() {
    println("Hello Kotlin")
    //Kotlin Variables
    //Variable refers to a memory location.It is used to store data.The data of a variable can be changed and reused depending on condition or on information passed to the Program.
    var lang="Java"//it can  be changed
    println(lang)
    lang="Kotlin"
    println(lang)
    val sal=3000.99//It cannot be changed
    println(sal)
    //sal=20000
    val language="Java"//val=final keyword; it cannot be changed
    //language="Kotlin"
    println(language)

    //Declaring Datatypes
    var Name:String
    Name="Rayied"
    println("My name is : "+Name)
    println("Your Name is:$Name")

    var number1:Int=10
    var number2:Int=20
    var sum:Int=number1+number2
    println("Addition without variable sum= ${number1+number2}")
    println("Addition is= $sum")
}