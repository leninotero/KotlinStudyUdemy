package colletions

fun main(args: Array<String>) {
    val numeros = Array<Int>(10) { i -> i * 10 }

    for (num in numeros){
        println(num)
    }

    val strings = arrayListOf("Carro", "Avião", "Moto", "Barco")
    for (str in strings){
        println(str.uppercase())
    }

    val pares = arrayListOf(2, 4, 6)
    val impares = intArrayOf(1, 3, 5)

    for (n in impares.union(pares).sorted()){
        print("$n  ")
    }
}