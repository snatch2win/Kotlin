

fun main(){
    println("hi! It's calculator")
    while (true) {

        println("введите первое число")
        val first = readLine()?.toDoubleOrNull()

        println("введите второе число")

        val second = readLine()?.toDoubleOrNull()

        println("введите желаемое действие (+ - * /)")

        val action = readLine()

        if (first == null || second == null || action.isNullOrEmpty() ){
            println("данные введены с ошибкой")
        } else {
            val result = calculate(first, second, action)

            println("Result is $result")
        }
    }
}

fun calculate(first: Double, second: Double, action: String): Double {
    var res = 0.0

    when (action) {
        "+" -> res = first + second
        "-" -> res = first - second
        "*" -> res = first * second
        "/" -> res = first / second
    }
    return res
}












