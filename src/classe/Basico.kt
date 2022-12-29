package classe

class Cliente {
    var nome: String = ""
}

class Pessoa1 (var name:String)

class Pessoa2 (val name: String)

class Pessoa3 (nomeInicial: String){
    val nomePessoa = nomeInicial
}

fun main(args: Array<String>) {
    val cliente = Cliente()
    cliente.nome = "Frederico"
    println("O nome do cliente é ${cliente.nome}")

    val p1 = Pessoa1("Joao")
    p1.name = "Guilherme"
    println("${p1.name} sabe prgramar!")

    val p2 = Pessoa2 (name = "Maria")
    val p3 = Pessoa3(nomeInicial = "Geronimo")
    println("${p2.name} e ${p3.nomePessoa} são pessoas legais")
}