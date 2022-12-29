package colletions

data class Fruta (val nome: String, val preco: Double)

fun main(args: Array<String>) {
    val frutas = arrayListOf(Fruta("Banana", 1.50),
        Fruta ("Morango", 3.45),
        Fruta("Pera", 3.45))

    for (itens in frutas){
        println("${itens.nome} - ${itens.preco}")
    }

    println(frutas.distinctBy { it.preco })
}