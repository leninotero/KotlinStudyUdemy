package classe

val dirementeDoArquivo = "Bom dia"

fun topLevel(){
    val localTop = "Fulano!"
    println("${dirementeDoArquivo} $localTop")
}

class Coisa{
    var variavelDeInstancia: String = "Boa Noite"

    companion object{
        @JvmStatic val constanteDeClasse = "Constante Stática"
    }

    fun fazer(){
        val localFun: Int = 7
        if (localFun > 3){
            val variavelDeFuncao = "Variavel de função"
            println("$variavelDeInstancia, $constanteDeClasse, $localFun e $variavelDeFuncao")
        }
    }
}

fun main(args: Array<String>){
    topLevel()
    Coisa().fazer()
    println(Coisa.constanteDeClasse)
}