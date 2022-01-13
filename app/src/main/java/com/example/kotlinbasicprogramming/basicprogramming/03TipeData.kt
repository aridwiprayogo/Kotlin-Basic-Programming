import kotlin.math.roundToInt

fun main() {
    numericIntVariable()
    /*numericFloatingPointVariable()*/
    /*booleanVariable()*/
    /*charactersVariable()*/
    /*stringsVariable()*/
    /*stringLiteral()*/
    /*stringTemplate()*/
    /*arrayVariable()*/
    /*arrayPrimitive()*/
}

fun numericIntVariable() {
    val one: Int = 1 //Int
    val threeBillion: Long = 3_000_000_000
    val oneLong = 1L
    val oneByte: Byte = 1
    println("one = $one.")
    println("threeBillion = $threeBillion")
    println("oneLong = $oneLong")
    println("oneByte = $oneByte")
}

fun numericFloatingPointVariable() {
    val phi: Int = 3.14.roundToInt()
    val oneDouble = 1.0
    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // Float, actual value is 2.7182817
    println("phi = $phi")
    println("oneDouble = $oneDouble")
    println("e = $e")
    println("eFloat = $eFloat")
}

fun booleanVariable() {
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)
}

fun charactersVariable() {
    val aChar: Char = 'a'

    println(aChar)
    println('\n') //prints an extra newline character
    println('\uFF00')

}

@ExperimentalStdlibApi
fun stringsVariable() {
    val str = "abcd 123"

    for (c in str) {
        println(c)
    }

    val string = "abcd"
    println(string.uppercase()) // Create and print a new String object
    println(string) // the original string remains the same
}

fun stringLiteral() {
    val s = "Hello, world!\n"

    val tripleQuote = """
    for (c in "foo")
        print(c)
    """
    println("text = $tripleQuote")

    val trimMargin = """
        |Tell me and I forget
        |Teach me and I remember
        |Involve me and I learn
        |(Benjamin Franklin)
    """.trimMargin()
}

fun stringTemplate() {
    val i = 10
    println("i = $i") // prints "i = 10"

    val s = "abc"
    println("$s.length is ${s.length}") // prints "abc.length is 3"

    val price = """
    ${'$'}_9.99
    """
    println("price = $price")

}

fun arrayVariable() {
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }
}

fun arrayPrimitive(){
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]

    // Array of int of size 5 with values [0, 0, 0, 0, 0]
    val arr1 = IntArray(5)

    // e.g. initialise the values in the array with a constant
    // Array of int of size 5 with values [42, 42, 42, 42, 42]
    val arr2 = IntArray(5) { 42 }

    // e.g. initialise the values in the array using a lambda
    // Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialised to their index value)
    var arr3 = IntArray(5) { it * 1 }

}