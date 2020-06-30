
private fun sayHello(greeting: String, itemsToGreet:List<String>) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun main() {
    // array, lists, maps

    // create an array of whatever the inferred type
    val interestingThings = arrayOf("Kotlin","Programming","Comic Books")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))




    for(intersetingThing in interestingThings){
        println(intersetingThing)
    }

    interestingThings.forEach {
        println(it)
    }

    interestingThings.forEach { interestingThing -> println(interestingThing) }

    interestingThings.forEachIndexed { index, s ->
        println("$s is at index $index")
    }

    // List
    val interestinThingList = listOf("Kotlin", "Programming", "Comic Books")
    interestinThingList.forEach { interestingThing ->
        println(interestingThing)
    }

    sayHello("HI",interestinThingList)


    // map: paris key value
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { t, u -> println("$t -> $u") }
    val mapMutable = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    mapMutable.put(4, "d")



    // mutableListof can add
    val interestinThingMutableList = mutableListOf("Kotlin", "Programming", "Comic Books")

    interestinThingMutableList.add("Dogs")


}