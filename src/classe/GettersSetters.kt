package classe

class NovoCliente{
    constructor(nome: String) {
        this.nome = nome
    }

    var nome: String
        get() = "Meu nome é ${field}"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
        }
}

fun main(args: Array<String>) {
    val c1 = NovoCliente("")
    println(c1.nome)

    val c2 = NovoCliente("Gerônimo")
    println(c2.nome)
}