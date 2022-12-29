package classe

class Filme {
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome: String, anoLancamento: Int, genero: String){
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

class NovoFilme(val nome: String, val anoLancamento:Int, val genero: String)

class FilmeNovo(nome: String, anoLancamento: Int, genero: String){
    val nome: String
    val anoLancamento: Int
    val genero: String

    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main(args: Array<String>) {
    val filme = Filme("Poderoso Chefão", 1972, "Drama")
    println("O ${filme.genero} - ${filme.nome} foi lançado no ano de ${filme.anoLancamento}")

    val novoFilme = NovoFilme("Monstros SA", 2001, "Desenho Animado")
    println("O ${novoFilme.genero} - ${novoFilme.nome} foi lançado em ${novoFilme.anoLancamento}")

    val filmeNovo = FilmeNovo("Vingadores", 2001, "Ação")
    println("O filme de ${filmeNovo.genero} - ${filmeNovo.nome} foi em lançado em ${filmeNovo.anoLancamento}")
}