package interfaceKotlin

interface PersonInfoProvider{
    val providerInfo : String
    fun printInfo(persons: Persons){
        println(providerInfo)
       // println("under interface of basic info provider for persons")
        persons.printInfo()
    }
    fun printInfo(animal: Animal){
        println("under interface of basic info provider for animal")
    }
}


// abstract this mean it doesn't need to implement all the methods available on the interfaces that includes
// but it also can not be instantiated
open class BasicInfoProvider : PersonInfoProvider, SessionIntoProvider {

    override val providerInfo: String
        get() = "basic info provider for persons"

    protected open val sessionid = "Session"

    override fun printInfo(persons: Persons) {
        super.printInfo(persons)
        println("additional print statement")
    }

    override fun printInfo(animal: Animal) {
        super.printInfo(animal)
        println("Additional print statement for animal class")
    }

    override fun getSession(): String {
       return sessionid
    }

    //    override fun printInfo(persons: Persons) {
//       println("basic info provider for persons")
//        persons.printInfo()
//    }

//    override fun printInfo(animal: Animal) {
//       println("basic info provider for animal")
//    }

}
