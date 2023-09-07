package poderFuncoes.tiposDeFuncoes

///Extension function para qualquer tipo (T) que possa ser nullable. Exibe em String se houver valor. Se for null, exibe "NULL"
fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"

fun main() {

    println(null.nullSafeToString()) //Imprime: NULL
    println("Kotlin".nullSafeToString()) //Imprime: Kotlin

}