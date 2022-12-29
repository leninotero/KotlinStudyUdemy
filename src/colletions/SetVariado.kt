package colletions

fun Any.print() = println( this )

fun main(args: Array<String>) {
    val conjunto = hashSetOf(3, 'a', true, "texto", 4.23)

    conjunto.add(3).print()
    conjunto.add(10).print()

    conjunto.size.print()

    conjunto.remove("a").print()
    conjunto.remove('a').print()

    conjunto.contains('a').print()
    conjunto.contains("Texto").print()
    conjunto.contains("texto").print()

    val nums = setOf(1, 2, 3) //somente leitura.. ou seja, não permite adicionar (add) mais elementos

    (conjunto + nums).print()
    (conjunto - nums).print()

    conjunto.intersect(nums).print()    //não muda o conjunto
    conjunto.retainAll(nums)    //muda o conjunto
    conjunto.print()

    conjunto.clear()
    conjunto.isEmpty().print()
}