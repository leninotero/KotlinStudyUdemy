package lambdas

fun main(args: Array<String>) {
    val soma = {x: Int, y: Int -> x + y }

    println(soma(23, 17))

    //TAKEIF
    println("\nDigite uma mensagem: ")
    var entrada = readLine()
    var mensagem = entrada.takeIf { it?.trim() != "" } ?: "Mensagem padrão"

    println(mensagem)

    //LET
    val listWithNulls: List<String?> = listOf("A", null, "B", null, "C", null)
    println("\nImprimndo lista omitindo valores nulos")
    for (item in listWithNulls){
        item?.let { println(it) }
    }
}