package fundamentos.controle

fun main(args: Array<String>) {
    var opcao: Int

    do {
        print("Digite um valor: ")
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0

        println("Voce digitou o valor $opcao")
    } while(opcao != -1)
    println("Loop finalizado... Até a proxima!")
}