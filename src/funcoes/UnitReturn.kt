package funcoes

fun imprimeMaior (a: Int, b: Int){
    println(Math.max(a, b))
}

fun imprimeMaiorComUnit (a: Int, b: Int): Unit{
    println(Math.max(a, b))
}

fun imprimeMaiorConUnitReturn(a: Int, b: Int): Unit{
    println(Math.max(a, b))
    return
}

fun imprimeMaiorUnitReturnUnit(a: Int, b: Int): Unit{
    println(Math.max(a, b))
    return Unit
}

fun imprimeMaiorReturnUnit(a: Int, b: Int){
    println(Math.max(a, b))
    return Unit
}

fun main(args: Array<String>) {
    imprimeMaior(2, 1)
    imprimeMaiorComUnit(2, 1)
    imprimeMaiorConUnitReturn(2, 1)
    imprimeMaiorUnitReturnUnit(2, 1)
    imprimeMaiorReturnUnit(2, 1).run { 2 > 1 }.run { print("Resultado= $this" ) }
}