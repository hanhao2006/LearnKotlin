package objectDeclarations
/*
    object declarations is a convenient way of creating treads saved singletons within kotlin
 */

object Entity{
    fun create() = EntityFactory("1","hao")
}
class EntityFactory(val id: String, val name: String){
    override fun toString(): String {
        return "id: $id name: $name"
    }
}