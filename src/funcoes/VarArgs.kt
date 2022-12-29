package funcoes

fun ordenar (vararg numeros: Int) : IntArray {
    return numeros.sortedArray()
}

fun main(args: Array<String>) {
    for (n in ordenar(12, 3, 39, 100, 23)){
        println("$n ")
    }
}