package classe

import com.sun.org.apache.xpath.internal.operations.Bool

enum class DiaSemana{
    DOMINGo, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
}

enum class DiaSemanaAvancado(val id: Int, val nome: String, val util: Boolean){
    DOMINGO(1, "Domingo", false),
    SEGUNDA(2, "Segunda", true),
    TERCA(3, "Terça", true),
    QUARTA(4, "Quarta", true),
    QUINTA(5, "Quinta", true),
    SEXTA(6, "Sexta", true),
    SABADO(7, "Sábado", false)
}

fun main(args: Array<String>) {
    println("O melhor dia da semana é ${DiaSemana.SABADO}")

    for (dia in DiaSemanaAvancado.values()){
        println("${dia.nome} é um dia ${if (dia.util) "util" else "do fim de semana"}.")
    }
}