package fundamentos

fun imprimeSituacao(nota: Any){
    when (nota as? Int){        // "?" omite o erro de exception
        2, 3, 4 -> println("Se lascou :(")
        5, 6-> println("Da pra recuperar :|")
        7, 8, 9, 10 -> println("Se deu bem hein :)")
        else -> println("nota inválida")
    }
}
fun main(args: Array<String>) {
    val notas = listOf(2.5, 5.7, 7.6, 10.3)

    for (nota in notas){
        imprimeSituacao(nota.toInt())
    }

}