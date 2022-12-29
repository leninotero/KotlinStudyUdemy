package lambdas

interface Operacao {
    fun executar (a: Int, b: Int) : Int
}

class Multiplicacao: Operacao{
    override fun executar(a: Int, b: Int): Int {
        return a * b
    }
}

class Calculadora{
    fun calcular(a: Int, b: Int): Int{
        return a + b
    }

    fun calcular(a: Int, b: Int, operacao: Operacao): Int{
        return operacao.executar(a, b)
    }
}

//simplificando o exemplo acima utilizando lambda
class Calculadora2{
    fun calcular(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
        return operacao(a, b)
    }
}

fun main(args: Array<String>) {
    val calc = Calculadora()
    val result1 = calc.calcular(4, 7)
    val result2 = calc.calcular(7, 9, Multiplicacao())

    println("Chamando a soma $result1 e agora multiplicacao $result2")

    //===== chamando a implementação com lambda
    //definindo uma função lambda para ser passada por parâmetro
    val subtracao = { a: Int, b: Int -> a - b}
    val divisao = {a: Int, b: Int -> a/b }

    val result3 = Calculadora2().calcular(12, 5, subtracao)
    val result4 = Calculadora2().calcular(12, 4, divisao)
    println("Resultado da operação Sub: $result3")
    println("Resultado da operação Div: $result4")

}