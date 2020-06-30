package interfaceKotlin

fun main() {
    val provider = BasicInfoProvider()
    provider.printInfo(Persons())
    provider.printInfo(Animal())
    provider.getSession()
    checkType(provider) // output: is a session info provider
                        // the past in info provider was also an instance of a session in both provider

}

fun checkType(infoProvider: PersonInfoProvider){
    if(infoProvider is SessionIntoProvider){
        println("is a session info provider")

        //how typecasting works
        //(infoProvider as SessionIntoProvider).getSession()
        infoProvider.getSession()
    }else{
        println("not is a session info provider")
    }
}