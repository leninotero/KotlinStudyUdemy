package lambdas

class Calcular{
    var resultado = 0

    fun soma (v1: Int, v2: Int){
        resultado += v1 + v2
    }


    fun add(valor: Int){
        resultado += valor;
    }
}

fun main(args: Array<String>) {
    val calc = Calcular()

    calc.apply { soma(12, 45) }.apply { add(10) }.apply { println(resultado) }

    calc.apply {
        soma(23, 45)
        add (30)
        println("\n$resultado")
    }

    //funcao inline
    with(calc){
        soma(66, 33)
        add (20)
        println("\n$resultado")
    }
}