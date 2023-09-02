package controleDeFluxoEColecoes.colecoes

//Criando uma variável imutável que recebe um mutableSet: a variável só pode receber outra instância que não esse set
val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

//Função que recebe uma descrição e adiciona à mutableSet e retorna se adição ocorreu (true) ou não (false)
fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}

//Função que retorna String impressa falando o status (se foi adicionado ou não)
fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected." //Essa é uma conditional expression
}
/*
Forma ainda mais simplificada da função acima:
fun getStatusLog(isAdded: Boolean) = if (isAdded) "registered correctly." else "marked as duplicate and rejected."
}
*/

fun main() {

    val aNewIssue: String = "uniqueDescr4" //Inclusão de uma issue que ainda não existe
    val anIssueAlreadyIn: String = "uniqueDescr2" //Inclusão de uma issue já existente (sendo uma duplicata)

    //Feedback sobre o status de adição das variáveis acima:
    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")

}