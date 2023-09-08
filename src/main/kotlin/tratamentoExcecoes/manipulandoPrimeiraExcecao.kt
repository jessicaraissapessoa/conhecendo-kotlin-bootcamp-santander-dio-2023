package tratamentoExcecoes

fun main() { //Código da segunda parte da aula

    val a = 10
    val b = 0

    try { //Tenta executar
        val divisao = a / b
    //Tratamento das exceções em caso de erro ao tentar executar:
    } catch (e: ArithmeticException) { //Em caso de exceção aritmética...
        println("Ocorreu uma exceção aritmética.") //Cai nessa exceção, logo, ao executar, aparece essa mensagem
    } catch (e: Throwable) { //Tratamento genérico, visto que, no Kotlin, as exceções herdam de Throwable
        println(e.message)
    } finally { //O finally é executado independentemente de dar certo (try) ou não (catch)
        println("Finally executado")
    }

    /* Impressão final:
    Ocorreu uma exceção aritmética.
    Finally executado
     */

}

/* Código da primeira parte da aula:

fun main() {

    val a = 10
    val b = 0

    try { //Tenta fazer

        val divisao = a/b //Não é possível, matematicamente, dividir um número por zero (b=0)

    //Se der erro, eu gostaria de tratar essa exceção:
    } catch (e: Throwable) { //Toda exceção em Kotlin herda de Throwable. "e" é a exceção capturada
        //Segue tratamento da exceção:

        e.printStackTrace() //Imprimindo a pilha de erro da exceção e com printStackTrace()

        println(e.message) //Imprimindo apenas a mensagem do erro -> Imprime -> / by zero


    }

}

 */