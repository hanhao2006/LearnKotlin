fun main(args: Array<String>) {

    println(getGreeting())
    sayHello()
    println(getGreeting1())
    sayHelloParam("Kotlin")
    sayHelloParam1("Hi ", "World")
}

private fun getGreeting():String{
    return "Hello kotlin"
}

private fun getGreeting1():String = "Hello Kotlin" // can remove :String

private fun sayHello():Unit{  // can remove unit, meaning void
    println(getGreeting())
}

// function parameters

private fun sayHelloParam(itemToGreet: String){
    val message = "Hello $itemToGreet"
    val msg = "Hello $itemToGreet"
    println(message)
    println(msg)

}

private fun sayHelloParam1 (greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")