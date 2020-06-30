package companionObject

fun main() {
    /*
        companion object have access to private properties and methods of that in closing class
     */
    //val entity = EntityFactory.Companion.create()
    val entity1 = EntityFactory.create() //shorten this by moving the reference to companion altogether
    val entity2 = EntityFactory.Factory.create()
    EntityFactory.id
}