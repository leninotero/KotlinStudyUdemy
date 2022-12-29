package lambdas

data class Aluno(val nome: String, val nota: Double)

class Produto(val nome: String, val preco:Double)

val materialEscolar = arrayListOf(
    Produto("Fichário escolar", 21.90),
    Produto("Lápis de cor", 11.90),
    Produto("Borracha bicolor", 0.70),
    Produto("Apontador com depósito", 1.80)
)

fun main(args: Array<String>) {
    //ordenação
    val nomes = arrayListOf("Renata", "Bernardo", "William", "Andreia", "Caio")
    nomes.sortedBy { it }.apply { println(this) }

    //filtro e ordenação
    val alunos = arrayListOf(
            Aluno("Pedro", 7.4),
            Aluno("Artur", 8.0),
            Aluno("Rafael", 9.7),
            Aluno("Ricardo", 5.7)
                )
    val aprovados = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nome }

    println("\nLista de Aprovados:\n $aprovados \n")

    //map
    val pessoas = arrayListOf("Geronimo","Jonas", "Maria")
    pessoas.map { it.toUpperCase() }.apply { println(this) }

    //map reduce
    val totalizar = { total: Double, atual: Double -> total + atual}
    val precoTotal= materialEscolar.map { it.preco }.reduce(totalizar)

    println("\nO preço medio dos produtos é: ${precoTotal / materialEscolar.size}.")
}