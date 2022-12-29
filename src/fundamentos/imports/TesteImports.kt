package fundamentos.imports

import fundamentos.pacoteA.mostraTexto as imprimeTexto
import fundamentos.pacoteA.Exemplo
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

fun main(args: Array<String>) {
    println(imprimeTexto("Exemplo"))

    val exemplo =  Exemplo("Geronimo")
    println(exemplo.nome)

    println(CARA)

    println("Soma: ${soma(14, 34)} - Subtração: ${subtracao(45, 12)}")

}