package fundamentos.conversao

fun main(args: Array<String>) {
    var a = 1

    println(a.toString() + 1)
    println("5.7".toDouble() + 4)
    println("Teste".toIntOrNull())
    println("Teste".toIntOrNull() ?: 0)
}