package funcoes

fun relacaoTrabalho (chefe: String, funcionario: String): String{
    return ("$funcionario é subordinado de $chefe")
}

//parametros padrões
fun potenciaNumero (base: Int = 2, expoente: Int = 3): Int{
    return Math.pow(base.toDouble(), expoente.toDouble()).toInt()
}

fun main(args: Array<String>) {
    println(relacaoTrabalho(chefe="Maria", funcionario = "Joaozim"))

    //Passando parâmetros e utilizando parâmetros padrões
    println(potenciaNumero(3, 7))
    println(potenciaNumero(10))
    println(potenciaNumero(base = 12))
    println(potenciaNumero(expoente = 5))
}