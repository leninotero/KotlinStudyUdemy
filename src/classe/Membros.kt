package classe

class Data (var dia: Int, var mes: Int, var ano:Int){
    fun formatar(): String{
        return "$dia/$mes/$ano"
    }
}

fun main (args: Array<String>){
    var nascimento = Data(dia = 6, mes=9, ano=1981)
    println(nascimento.formatar())

    nascimento.mes =7
    println(nascimento.formatar())
}
