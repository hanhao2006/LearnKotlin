package classKotlin

// internal mean that this class is public within the module
// a protected property or method will only be available within that class or within subclasses
class Persons (val firstName: String = "Hao", val lastName: String = "Han"){
    // getter , setter
    var nickName: String? = null
        set(value) {
            field = value
            println("the new nick name is $value")
        }
        get() {
            println("the returned value is $field")
            return field
        }
    fun printInfo(){
        val nickNameToPrint = if(nickName != null) nickName else "no nick name"
        val nickNameToPrint1 = nickName ?:"no nick name" // if nick name is not null
        println("$firstName $lastName $nickNameToPrint1" )
    }

}

/*
==========================================Class one===========================================
// add primary constructor
class Persons(_firstName: String, _lastName: String){
    // define properties for firstName, and lastName

    val firstName: String = _firstName
    val lastName: String = _lastName

//    init { // initialized properties
//        firstName = _firstName
//        lastName = _lastName
//    }
}

*/

/*
==========================================Class two=============================================
class Persons (val firstName: String, val lastName: String){
    // init always going to run before the secondary constructor
    init {
        println("init 1")
    }
    // secondary constructor
    constructor(): this("Peter","Parker"){
        println("Secondary constructor")
    }
    init {
        println("init 2")
    }
}

 */