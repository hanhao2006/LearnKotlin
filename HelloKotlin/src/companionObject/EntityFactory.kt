package companionObject

interface IdProvider{
    fun getId(): Int
}


class EntityFactory private constructor(val id: Int){
    companion object Factory : IdProvider{
        const val id = 2
        fun create() = EntityFactory(getId())

        override fun getId(): Int {
            return 3
        }
    }
}