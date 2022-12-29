package lambdas

data class CasaNova(var endereco: String = "", var numero: Int = 0)

fun main(args: Array<String>) {
    var casa = CasaNova()

    casa.run {
        casa.endereco = "Rua miseria"
        casa.numero = 105
    }

    println(casa)
}