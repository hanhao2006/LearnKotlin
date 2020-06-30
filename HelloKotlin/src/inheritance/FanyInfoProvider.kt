package inheritance

import interfaceKotlin.BasicInfoProvider
import interfaceKotlin.Persons

/* if we want to inherited from or extended. To extend this basic info provider, we need to add open key word before class
    of basic info provider
*/
class FanyInfoProvider: BasicInfoProvider(){

    override val sessionid: String
        get() = "Fancy session"

    override val providerInfo: String
        get() = "Fancy info provider"


    override fun printInfo(persons: Persons) {
        super.printInfo(persons)
        println("Fancy info")
    }
}