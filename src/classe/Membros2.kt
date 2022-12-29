package classe

class Calculadora {
    private var resultado: Int = 0

    fun somar(vararg valores: Int) : Calculadora{
        valores.forEach { resultado += it }
        return this
    }

    fun multiplicar (valor: Int): Calculadora{
        resultado *= valor
        return this
    }

    fun limpar() : Calculadora{
        resultado = 0
        return this
    }

    fun print(): Calculadora{
        println(resultado)
        return this
    }

    fun obterResultado(): Int{
        return resultado
    }
}

fun main (args: Array<String>){
    val calc = Calculadora()
    calc.somar(3, 4, 7).multiplicar(5).print()
    calc.somar(4, 7).print().limpar()
    println(calc.obterResultado())
}