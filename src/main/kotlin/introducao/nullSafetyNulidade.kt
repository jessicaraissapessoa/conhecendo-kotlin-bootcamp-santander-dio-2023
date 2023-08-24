package introducao

fun main() {

    var neverNull : String = "Não pode ser nula"
    //neverNull = null --> Dá erro pois não foi determinado que essa variável poderia receber nulo

    var nullable : String? = "Pode ser nula"
    nullable = null // --> Pode receber nulo pois o operador ? trata disso

    //Inferência de tipo:
    var inferredNomNull = "O compilador assume que não é nulo" // --> O Kotlin não recebeu instruções de que essa variável pode receber valor null
    // inferredNomNull = null --> Erro pois não foi instruída a possibilidade de receber valor null


    fun strLength(notNull: String): Int {
        return notNull.length
    }

    //Solução para a função anterior:
    fun strLengthSolution(str: String?): Int {
        return str?.length ?: 0 // ?: -> Elvis operator -> "Caso seja null, retorna..."
    }


    strLength(neverNull)
    //strLength((nullable)) --> Erro por poder ser nulo

    //solicitando exibição do número de caracteres das variáveis de tipo String:
    println(strLengthSolution(neverNull))
    println(strLengthSolution(nullable))


    //Lidando com nulo por meio de if/else

    fun describeString(maybeString: String?): String {
        return if (maybeString != null && maybeString.length > 0) { //
            "String de tamanho ${maybeString.length}"
        } else {
            "String vazia ou nula"
        }
    }

    println(describeString(null)) //"String vazia ou nula"
    println(describeString("")) //"String vazia ou nula"
    println(describeString("dio.me")) //"String de tamanho ${maybeString.length}"

}