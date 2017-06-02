/**
 * Created by carlosjoseanguiano on 02/06/17.
 */

fun main(args: Array<String>) {
    printProducto("2", "a")
    printProducto("2", "3")
    printProducto("c", "b")
    printProducto("2", "7")
}

fun printProducto(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        println(x * y)
    } else {
        println("value '$arg1' or '$arg2' is not a number")
    }

}

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}
