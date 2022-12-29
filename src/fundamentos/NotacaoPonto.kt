package fundamentos

fun main(args: Array<String>) {
    val a: Int = 33.dec()  //chama o método dec() q decrementa um valor
    var b: String = a.toString()
    var c = "Teste"

    println("Int $a")
    println("O primeiro char da String é ${c.first()}") //.first() chama o caracter inicial de uma String


}