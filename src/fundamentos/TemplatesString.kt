package fundamentos

fun main(args: Array<String>) {
    val aprovados = listOf("Joao", "Maria", "jose")
    val bomHumor = false

    println("O primeiro aprovado é: ${aprovados[0]}")

    println("Hoje estou ${if (bomHumor) "Feliz" else "Triste"}.")
}