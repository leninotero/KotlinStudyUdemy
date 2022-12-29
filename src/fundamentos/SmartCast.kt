package fundamentos

fun comparaComIf(x: Any){
    if (x is String){
        println(x.uppercase())
    } else if (x is Int){
        println(x.plus(3))
    }
}

fun comparaComWhen(x: Any){
    when(x){
        is String -> println(x.uppercase())
        is Int -> println(x.plus(3))
        else -> println("Tipo não reconhecido")
    }
}

fun main(args: Array<String>) {
    comparaComIf("teste")
    comparaComIf(54)

    comparaComWhen("ola")
    comparaComWhen(12)
    comparaComWhen(true)
}
