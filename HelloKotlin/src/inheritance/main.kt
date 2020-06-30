package inheritance

import interfaceKotlin.Persons

fun main() {
    val provider = FanyInfoProvider()
    //provider.sessionid
    provider.printInfo(Persons())
}