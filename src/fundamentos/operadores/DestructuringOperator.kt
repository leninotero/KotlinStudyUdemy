package fundamentos.operadores

data class Carro (val marca: String, val modelo:String)

fun main(args: Array<String>) {
    val(marca, modelo) = Carro("Ford", "Fussion")
    println("Marca: $marca e Modelo: $modelo")

    val (aluno1, aluno2) = listOf("Maria", "Joao")
    println("Aluno 1: $aluno1 e Aluno 2: $aluno2")

    val(_, _, terceiro) = listOf("Kimi", "Hamilton", "Alonso")
    println("Terceiro lugar: $terceiro")
}