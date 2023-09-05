package poderFuncoes.funcoesDeEscopo

fun main() {

    //Função que recebe como parâmetro uma String ns que pode ser null
    fun getNullableLength(ns: String?) : Int {
        println("for \"$ns\":") // \" -> caractere de escape para aparecer " na String

        return ns?.run { //Verificação -> Se não for null, executa bloco de código do run
            println("\tis empty? " + isEmpty()) // \t -> caractere de escape para tabulação | Chamando isEmpty direto
            println("\tlength = $length") // Texto que indica o tamanho da String
            length//Chamando a propriedade length direto para retornar
        } ?: 0 // EXTRA: Elvis operator para caso seja null
    }

    getNullableLength(null)
    /* Impressão:

    for "null":
	    0

     */

    getNullableLength("")
    /* Impressão:

    for "":
	    is empty? true
	    length = 0

     */

    getNullableLength("some string with Kotlin")
    /* Impressão:

    for "some string with Kotlin":
	    is empty? false
	    length = 23

     */

    //Imprimindo a função com retorno, antes do que é impresso pelo run (nos não null), imprime o length
    println(getNullableLength(null)) // Resultado do elvis operator -> Imprime length -> 0
    println(getNullableLength("")) // Imprime length -> 0
    println(getNullableLength("some string with Kotlin")) // Imprime length -> 23

}