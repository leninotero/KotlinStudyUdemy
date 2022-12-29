package funcoes

inline fun transacao(funcao: () -> Unit){
    println("Abrindo a transação...!")
    try {
        funcao()
    } finally {
        println("Fechando a transação...!")
    }
}

fun main(args: Array<String>) {
    //chamando a função inline e colocando o código da funçao q esta sendo chamada por parâmetro
    transacao {
        println("Executando o código 1...")
        println("Executando o código 2...")
        println("Executando o código 3...")
    }
}