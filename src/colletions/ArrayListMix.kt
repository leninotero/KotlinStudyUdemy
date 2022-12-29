package colletions

fun main(args: Array<String>) {
    val listaMix = arrayListOf("Maria", true, 4, 7.43, 'B')

    for (item in listaMix){
        if (item is String){    //smart cast
            println(item.uppercase())
        } else
            println(item)
    }
}