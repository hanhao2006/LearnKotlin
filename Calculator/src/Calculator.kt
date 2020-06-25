import sun.tools.tree.AssignDivideExpression
import kotlin.properties.Delegates

class Calculator {
    var num1 by Delegates.notNull<Double>()
    var num2 by Delegates.notNull<Double>()

    fun add(num1: Double, num2: Double):Double = num1 + num2
    fun sub(num1: Double, num2: Double):Double = num1 - num2
    fun mul(num1: Double,num2: Double):Double = num1 * num2
    fun div(): Double = this.num1 / this.num2
    fun checkDivisor():Boolean{
        return when(num2.toInt()) {
            0 -> false
            else -> true
        }
    }


}
