package fundamentos.controle

fun main(args: Array<String>) {
    val nota = 10

    when(nota){
        10, 9 -> println("fantastico")
        7, 8 -> println("Parabens")
        in 4..6 -> println("Da para recuperar")
        in 0..3 -> println("Se lascou vey!")
        else -> println("Nota inválida!")
    }
}