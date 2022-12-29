package colletions

fun main(args: Array<String>) {
    val nomes = hashSetOf("João", "Maria", "Pedro", "Ana", "Juana")

    println("Set sem ordem")
    for (pessoas in nomes){
        pessoas.print()
    }

    val nomesOrdenados = linkedSetOf("João", "Maria", "Pedro", "Ana", "Juana")
    println("\nSet Ordenado como inseridos")
    for (pessoas in nomesOrdenados){
        pessoas.print()
    }

    val nomesOrdemAlfabetica = sortedSetOf("João", "Maria", "Pedro", "Ana", "Juana")
    println("\nSet Ordenados Alfabeticamente")
    for (pessoas in nomesOrdemAlfabetica){
        pessoas.print()
    }

    //Ordem Customizada
    println("\nSet Ordem Customizada")
    nomes.sortedBy { it.substring(1) }.print()
}