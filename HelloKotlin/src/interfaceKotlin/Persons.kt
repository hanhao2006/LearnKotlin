package interfaceKotlin

class Persons (val firstName: String = "Hao", val lastName: String = "Han"){
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
      //  val nickNameToPrint = if(nickName != null) nickName else "no nick name"
        val nickNameToPrint1 = nickName ?:"no nick name" // if nick name is not null
        println("$firstName $lastName $nickNameToPrint1" )
    }
}
