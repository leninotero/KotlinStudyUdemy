package fundamentos

fun main(args: Array<String>) {
    print("Primeiro")
    println(" programa")

    //Variveis (var)
    var a: Int
    var b = 20
    a = 10
    println("Soma de variaveis =  ${a + b}")

    //constantes (val)
    val A: Int = 3
    val B = 5
    println("Imprime constante = $B")

    //misturando kotlin com java
    val raio = 4.15
    println(raio * raio * Math.PI)

    //tipos de variaveis
    //numericos inteiros
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9_223_372_036_854_775_807

    //numericos reais
    val num5: Float = 3.14F
    val num6: Double = 3.14

    //Caracter
    val letra:Char = '?'

    //Boolean
    val verifica:Boolean = true

    println(listOf(num1, num2, num3, num4, num5, num6, letra, verifica))
    println(2 is Int)
    println(2147483648 is Long)
    println(1.0 is Double)

    //valores nulos de forma segura
    var numNull: Int? = null //safe call operator

    println(numNull?.dec())

    println("Forçando o nullPointer")
//    println(numNull!!.inc())    //utilizamos !!

    //operador Elvis
    val opcional: String? = null
    val obrigatorio = opcional ?: "omite o null só se for null"

    println(obrigatorio)
}