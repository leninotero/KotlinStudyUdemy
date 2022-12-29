package colletions

class Objeto (val nome : String, val descricao: String){
    override fun hashCode(): Int {
        return nome.length
    }

    override fun equals(other: Any?) = if (other is Objeto){
        nome.equals(other.nome, ignoreCase = true)
    } else {
        false
    }
}

fun main(args: Array<String>) {
    val conjunto = hashSetOf(
        Objeto("Cadeira", "..."), //hashCode = 7
        Objeto("Mesa", "..."), //hashCode = 4
        Objeto("Faca", "..."), //hashCode = 4
        Objeto("Copo", "...") //hashCode = 4
    )

    // Utiliza o HashCode para comparar primeiro os nomes que tem o mesmo tamanho
    // para depois comparar a String ignorando as maiúsculas
    conjunto.contains(Objeto("faca", "???")).print()

}