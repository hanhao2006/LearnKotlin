import java.lang.Exception

fun main() {
    var result: Double?
    var cal = Calculator()
    var check:Boolean
    var option: String

    displayTitle("Welcome to use simply calculator in Kotlin")
    var choose = menu();
    //println(choose is Byte)
    when (choose) {
        1.toByte() -> {
            do{
                println("Addition")
                cal.num1 = getNum("Please enter number 1")
                cal.num2 = getNum("Please enter number 2")
                result= cal.add(cal.num1,cal.num2)
                println("Result for ${cal.num1} + ${cal.num2} = ${result.toInt()}")
                option = option();
            }while (option == "Y")

        }
        2.toByte() -> {
            do{
                println("Subtraction")
                cal.num1 = getNum("Please enter number 1")
                cal.num2 = getNum("Please enter number 2")
                result= cal.sub(cal.num1,cal.num2)
                println("${cal.num1} - ${cal.num2} = ${result.toInt()}")
                option = option()
            }while (option == "Y")

        }
        3.toByte() -> {
            do{
                println("Multiplication")
                cal.num1 = getNum("Please enter number 1")
                cal.num2 = getNum("Please enter number 2")
                result = cal.mul(cal.num1,cal.num2)
                println("${cal.num1} * ${cal.num2} = ${result}")
                option = option()
            }while (option == "Y")
        }
        4.toByte() -> {
            do {
                println("Division")
                cal.num1 = getNum("Please enter number 1")
                do {
                    cal.num2 = getNum("Please enter number 2")
                    check = cal.checkDivisor();
                }while (!check)
                val str: String = String.format("%.2f", cal.div())
                println("${cal.num1} * ${cal.num2} = $str")
                option = option()
            }while (option == "Y")
        }
    }
}

fun displayTitle(title: String){
    println(title)
    for(t in title.indices){
        print("*")
    }
    println()
}

fun menu():Byte{
    println("1 - Addition")
    println("2 - Subtraction")
    println("3 - Multiplication")
    println("4 - Division")
    print("Select your choose (1-4) ")
    return readLine()!!.toByte()

}

fun getNum(str:String): Double {
    var check: Boolean = true
    var num: Double? = 0.0

    while (check) {
        try {
            print("\n${str}: ")
            num = readLine()!!.toDouble()
            check = false
            return num
        } catch (e: Exception) {
            println("Please enter number")
            check = true
        }
    }
    return 0.0
}

fun option():String{
    println("Do you want to Calculator again?(Y/N) ")
    return readLine().toString()
}


