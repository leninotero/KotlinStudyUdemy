package funcoes

class Produto(val nome: String, val preco: Double)

infix fun Produto.maisCaro(produto: Produto): Boolean = this.preco > produto.preco

fun main(args: Array<String>) {
    val p1 = Produto("ipad", 1234.00)
    val p2 = Produto(preco = 4.50, nome = "Caneta")

    println(p1 maisCaro p2)
}