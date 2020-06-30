package objectExpression

import interfaceKotlin.PersonInfoProvider
import interfaceKotlin.Persons


fun main() {

    /*
        an object expression allows you to create an anonymous inter class so you do not have to create a new named
        class. so this might be useful for things like a click listener
     */
    val provider = object: PersonInfoProvider{
        override val providerInfo: String
            get() ="New info provider"

        fun getSessionId() = "id"
    }
    provider.getSessionId()
    provider.printInfo(Persons())

}