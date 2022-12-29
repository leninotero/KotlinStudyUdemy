package fundamentos.controle

fun main(args: Array<String>) {
    //for simples
    println("Contador Crescente")
    for (i in 1..10){
        println(i)
    }

    println("\nContador Decrescente")
    for (i in 10 downTo 1){
        println(i)
    }

    println("\nContador Crescente com intervalo")
    for (i in 0..100 step 5){
        println(i)
    }

    println("\nContador Decrescente com intervalo")
    for (i in 100 downTo 0 step 5){
        println(i)
    }

    println("\nFor a partir de uma lista")
    val alunos = arrayListOf("Joao", "Maria", "Jose", "Geronimo")

    for ((indice, aluno) in alunos.withIndex()){
        println("${indice + 1} = $aluno")
    }

    println("\nFor com Break")
    for(i in 1..10){
        if (i == 5){
            break
        }
        println("imprimindo:  $i")
    }

    println("\nFor com Continue")
    for(i in 1..10){
        if (i == 5){
            continue
        }
        println("imprimindo:  $i")
    }

}