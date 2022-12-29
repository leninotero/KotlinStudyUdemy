package classe

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca:String, val polegadas: Int)

fun main (args: Array<String>){
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Geladeira("Brastemp", 320)

    println(g1 == g2)
    println(g1.toString())

    val tv1 = Televisao("Samsung", 75)
    val tv2 = Televisao("Samsung", 75)

    println(tv1 == tv2)  //equal - compara todos os atributos da classe
    println(tv1 === tv2) //compara referencia de memória
    println(tv1.toString())
    println(tv1.copy(polegadas = 50))

    //Destructing em DataClass
    val (marca, pol) = tv1
    println("$marca $pol'")
}