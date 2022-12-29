package colletions

fun main(args: Array<String>) {
    val alunos = arrayListOf("Mariana", "Lucio", "Carlos", "Joselia")

    for ((indice, aluno) in alunos.withIndex()){
        println("$indice - $aluno" )
    }

    //forEach
    alunos.forEach{ println( it ) }
}