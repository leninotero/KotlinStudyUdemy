package fundamentos.controle

fun main(args: Array<String>) {
    var opcao: Int = 0

    while (opcao != -1) {
        print("Digite um valor: ")
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0

        println("Voce digitou o valor $opcao")
    }
    println("Loop finalizado... Até a proxima!")

    //outro exemplo - contador
    var contador:Int = 1
    println("\nContador de 1 até 10")
    while (contador <= 10){
        println(contador)
        contador++
    }

}