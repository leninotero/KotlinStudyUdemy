package funcoes

class Operacao {
    fun somar (a: Int, b: Int): Int{
        return a + b
    }
}

fun soma(a: Int, b: Int) : Int{
    return a + b
}

fun calc (a: Int, b: Int, funcao: (Int, Int) -> Int): Int{
    return funcao (a, b)
}

fun main(args: Array<String>){
    //chamando o método que esta dentro da classe
    println(calc(12, 15, Operacao()::somar))

    //chmando o método top-level
    println(calc(14, 18, ::soma))
}