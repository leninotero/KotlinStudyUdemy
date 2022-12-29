package fundamentos.controle

fun main(args: Array<String>) {
    val nota: Double = 8.5

    if (nota >= 7){
        println("Aprovado")
    } else {
        println("Reprovado")
    }

    //Estrutura de If como expressão
    val num1: Int = 24
    val num2: Int = 14

    var maior = if (num1 > num2) {
        println("processando If...")
        num1
    }else {
        println("processamdo Else...")
        num2
    }
    println("O maior valor é: $maior .")

    //If aninhado
    val notaFinal: Int = 9

    if (notaFinal in 9..10){
        print("Fantástico")
    } else if (notaFinal in 7..8){
        println("Parabens")
    } else if (notaFinal in 4..6){
        println("Dá pra recuperar")
    } else if (notaFinal in 0..3) {
        println("Se lascou veio!")
    } else {
        println("Nota Inválida!")
    }
}