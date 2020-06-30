package classKotlin

fun main() {
    val person = Persons("Hao","Han")

//    person.firstName
//    person.lastName
//    person.nickName = "Shades"
//    person.nickName = "New nick name"
//    println(person.nickName)
    person.printInfo()   // output the returned value is null    Hao Han no nick name

    val obj = Persons()
}