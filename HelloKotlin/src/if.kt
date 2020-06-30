private val name = "Nate"
private var greeting: String? = null

fun main(args: Array<String>) {

    // if statement
    if(greeting !=null){
        println(greeting)
    }else{
        println("Hi")
    }
    println(name)

    // when statement
    // greeting = "Hello"
    when(greeting){
        null -> println("Hi")
        else -> println(greeting)
    }
    println(name)


    val greetingToPrint = if(greeting != null) greeting else "Hi"
    println(greetingToPrint)
    println(name)

    val greetingToPrint1 = when(greeting){
        null -> "Hi"
        else -> greeting
    }
    println(greetingToPrint1)
    println(name)

}