package funcoes

fun <E> filtrarNomes (lista: List<E>, filtrar: (E) -> Boolean): List<E>{
    val listaFiltrada = ArrayList<E>()
    for (e in lista){
        if (filtrar(e)){
            listaFiltrada.add(e)
        }
    }
    return listaFiltrada
}

fun nomeTresLetras(nome: String) : Boolean{
    return nome.length == 3
}

fun main (args: Array<String>){
    val nomes = listOf("Ana", "Pedro","Bia", "Gui", "Rebeca", "Leo")
    println(filtrarNomes(nomes, ::nomeTresLetras))
}