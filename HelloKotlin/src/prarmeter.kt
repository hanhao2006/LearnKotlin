

private fun sayHello(greeting: String, vararg itemsToGreet:String) { // vararg pass in a value after the initial greeting
    // argument and let us have greater flexibility
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

// name argument

private fun greetPerson (greeting: String, name: String) = println("$greeting $name")

private fun greetPerson2 (greeting: String = "Hi", name: String = "Kotlin")= println("$greeting $name")

fun main() {
    val interestinThingList = listOf("Kotlin", "Programming", "Comic Books")
    sayHello("Hi","Kotlin","Programing","Comic Books")

    // sayHello("Good Morning",*interestinThingList) Require Array, not allow to use in the list

    val interestinThing = arrayOf("Kotlin", "Programming", "Comic Books")

    sayHello("Hello", *interestinThing) // add * before the array variable when you pass it in as an argument value
    sayHello(greeting = "Hi", itemsToGreet = *interestinThing)
    sayHello(itemsToGreet = *interestinThing, greeting = "Hi")



    // name argument
    greetPerson("hi","hao")
    greetPerson(name = "hao",greeting = "it is morning day")

    greetPerson2(name="Hao Han")




}