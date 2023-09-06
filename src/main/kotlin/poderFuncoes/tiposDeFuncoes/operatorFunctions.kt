package poderFuncoes.tiposDeFuncoes

fun main() {

// Primeira operator function

    //Operator function para a função times que recebe uma String. A função aplica repeat "this" vezes nessa String
    operator fun Int.times(str: String) = str.repeat(this)

    println(2 * "Bye ") // Com infix function similar, fazíamos println(2 times "Bye ") -> Imprime: Bye Bye

// Segunda operator function

    //Operator function da função get que recebe um range (tamanho) em inteiro e faz uma substring da String original indo até esse range
    operator fun String.get(range: IntRange) = substring(range)

    val str = "Paçoca é uma delícia. Não dá para confiar em quem não gosta de paçoca"
    println(str.length) //Imprime tamanho da String str completa -> 69
    println(str[0..20]) //Imprime a String str do caractere 0 ao caractere 20 inclusive -> Imprime: Paçoca é uma delícia.

}