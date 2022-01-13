fun main() {

    println("sum of 3 and 5 is ${sumBody(3, 5)}")
    println("sum of 3 and 5 is ${sumExpression(3,5)}")
}

fun sumBody(a: Int, b: Int): Int {
    return a + b
}

fun sumExpression(a: Int, b: Int) = a + b