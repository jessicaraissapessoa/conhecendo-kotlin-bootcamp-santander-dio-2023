package poderFuncoes.funcoesDeEscopo

//Função que recebe uma String em s e imprime s em uppercase (conversão para maiúsculo)
fun customPrint (s: String) {
    print(s.uppercase()) //imprime convertendo para maiúsculo toda a String s
}

fun main() {

    //Texto "test" usando let como função de escopo
    val empty = "test".let { //"test" é o valor que chamou let
        customPrint(it) //Chama customPrint passando it -> it -> linha anterior -> "test" -> valor que chamou o let
        it.isEmpty() //Última instrução -> puxa objeto de it para verificação se está vazio
    }

    println(" is empty: $empty") //Printa resposta se está vazio. Imprime -> TEST is empty: false

    //Função que recebe str que pode ser null
    fun printNonNull (str: String?) {

        print("Printing \"$str\":") //Print da String sem validação alguma de null. Ver uso em linhas com "printNonNull(null)" e "printNonNull("my string")

        str?.let { //Faz o let executar apenas se str não for null. Forma de acesso seguro do null
            //Impressão extra com validação de null. Ver uso em linha com "printNonNull("my string")

            print("\t") //tabulação ("espaçamento de início de parágrafo"
            customPrint(it) //chama função customPrint passando it -> it -> $str
            println() //print com propósito de gerar uma quebra de linha
        }
    }

    //Função que encadeia let e tem duas Strings de entrada que podem ser null. O let faz com que, se não forem null, imprima
    fun printIfBothNonNull (strOne: String?, strTwo: String?) {
        strOne?.let { firstString -> //Determinação de quem é firstString a ser puxado por let. Não sendo null, segue let
            strTwo?.let { secondString -> //Determinação de quem é secondString a ser puxado por let. Não sendo null, segue let
                customPrint("$firstString: $secondString") //chama função customPrint
                println() //print com propósito de gerar uma quebra de linha
            }
        }
    }

    printNonNull(null) //Usa o print sem validação de printNonNull. Imprime -> Printing "null":
    printNonNull("my string") //print anterior de printNonNull + print do str?.let -> printa -> Printing "my string":MY STRING

    printIfBothNonNull("First", "Second") //printa -> FIRST: SECOND

}