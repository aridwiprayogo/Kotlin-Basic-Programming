fun main() {
    `check number 'in' Range`()
    `check Number Out Of Range`()
    `Iterate over a range`()
    `Or over a progression`()
}

fun `check number 'in' Range`(){
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }
}

fun `check Number Out Of Range`(){
    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
}

fun `Iterate over a range`(){
    for (x in 1..5) {
        print(x)
    }
}

fun `Or over a progression`(){
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}