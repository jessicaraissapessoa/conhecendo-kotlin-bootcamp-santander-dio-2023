package orientacaoAObjetosETiposDeClasses

/* Exemplo de implementação desnecessária:

import java.util.*

class LuckDispatcher { //Exemplo de função que funcionaria sem a necessidade dessa instância
    fun getNumber() {
        var objRandom = Random()
        println(objRandom.nextInt(90))

    }
}
fun main() {
    //Criando múltiplas instâncias para chamar a função
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()
    d1.getNumber()
    d2.getNumber()
}

 */


//Object Expression - Expressão dinâmica
fun rentPrice (standardDays: Int, festivityDays: Int, specialDays: Int) : Unit {

    //Função que calcula preço com estrutura de dados auxiliar

    val dayRates = object { //object criando estrutura dinâmica. Preço do tipo de dia * quantidade de dias do tipo
        var standard : Int = 30 * standardDays
        var festivity : Int = 50 * festivityDays
        var special : Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    println("Total price: $$total")
}


//Object Declaration - Classe como object. Acessa diretamente membros da classe
object DoAuth { //função de autenticação
    fun takeParams(username: String, password: String) { //Função que recebe username e password e faz uma impressão
        println("input auth parameters = $username.$password")
    }
}


//Companion Objects - Acesso direto às funções do companion object sem necessidade de instância
class BigBen { //Classe que imprime BONG de acordo com uma quantidade de vezes
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1..nTimes) {
                println("BONG")
            }
        }
    }
}


fun main() {

//Object Expression

    rentPrice(10, 2, 1) //Valor do aluguel. Imprime: Total price: $500

//Object Declaration

    DoAuth.takeParams("foo", "qwerty") //Imprime: input auth parameters = foo.qwerty

//Companion Objects

    BigBen.getBongs(12) //Imprime 12 vezes: BONG

}


