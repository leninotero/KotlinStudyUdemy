package colletions

fun main(args: Array<String>) {
    var map = HashMap<Long, String>()

    map.put(10020030040, "João")
    map.put(30040050060, "Maria")
    map.put(60070080090, "Pedro")

    for (pares in map){
        println(pares)
    }

    map.put(60070080090, "Pedro Filho")

    println("\nSomente Nomes (Value)")
    for (nomes in map.values){
        println(nomes)
    }

    println("\nSomente CPFs (Keys)")
    for (cpf in map.keys){
        println(cpf)
    }

    println("\nCom Destructor")
    for ((cpf, nome) in map){
        println("$nome (CPF: $cpf)")
    }

    println("\nMétodos")
    map.size.print()
    map.get(10020030040)?.print()
    map.contains(30040050060).print()
    map.remove(30040050060)?.print()
    map.clear()
    map.isEmpty().print()

    val par = hashMapOf(1 to "Gerardo", 2 to "Simone", 3 to "Pedrão")

    println("\nCom HashMapOf")
    for ((id, nome) in par){
        println("$id) $nome")
    }


}