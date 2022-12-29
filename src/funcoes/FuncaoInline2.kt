package funcoes

inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T{
    println("Executado a função $nomeFuncao...")
    try {
        return funcao()
    }finally {
        println("Método $nomeFuncao finalizado...")
    }
}

fun somando(a: Int, b: Int): Int{
    return a + b
}

fun main(args: Array<String>){
    val resultado = executarComLog("somando"){
        somando(13, 25)
    }

    println(resultado)
}
