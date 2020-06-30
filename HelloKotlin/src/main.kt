
private var greeting: String? = "hello"  // top lever valuable
val nameNull: String? = null


fun main(args: Array<String>) {

    val name: String = "Nate"  // val assign once valuable we can not modify
    var nameVar = ""           // var can be change valuable

    greeting = "hi"
    println(greeting)

    greeting = null
    print(greeting)
}