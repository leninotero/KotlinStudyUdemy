package fundamentos

//função sem retorno
fun somarNumero (a: Int, b: Int){
    println(a + b)
}

//Função com retorno e um parâetro padrão
fun somaValoresComParametro( a: Int, b: Int = 15): Int{
    return a + b;
}

fun main(args: Array<String>) {
    //Chamada de função sem retorno
    println("=== Função sem Retorno ===")
    somarNumero(13, 35)

    //chama de função co retorno
    println("\n=== Função com Retorno ===")
    println(somaValoresComParametro(20, 18))
    println(somaValoresComParametro(20))
}