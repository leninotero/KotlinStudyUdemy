package fundamentos.operadores

import java.util.Date

fun main(args: Array<String>) {
    val(v1, v2, v3, v4) = listOf(14, 23, 10, 34)

    val soma = v1 + v2
    val subtracao = v4 - v3
    val multiplicacao = v1 * v3
    val divisao  = v4 / v1
    val resto = v2 % 2

    println("$soma $subtracao $multiplicacao $divisao $resto")

    var d1 = Date(0)
    var d2 = Date(0)

    //Igualdade referencial
    println("Resultado com '===' ${d1 === d2}")

    //Igualdade estrutural
    println("Resultado com '==' ${d1 == d2}")
}