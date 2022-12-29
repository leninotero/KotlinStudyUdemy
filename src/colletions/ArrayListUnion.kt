package colletions

fun main(args: Array<String>) {
    val numeros = arrayListOf(1, 2, 3, 4, 5)
    val strings = arrayListOf("Joao", "Maria", "Jose", "Pedro", "Luis")

    val union = numeros + strings

    for (todo in union){
        println(todo)
    }
}