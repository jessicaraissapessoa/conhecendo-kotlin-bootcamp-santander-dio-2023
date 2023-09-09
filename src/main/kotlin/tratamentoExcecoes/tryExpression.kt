package tratamentoExcecoes

fun main() {

    var a = 10
    var b = 0

    //variável divisao recebe ou resultado de a/b caso seja possível (try) ou resultado do tratamento de exceção (catch)
    var divisao = try { a/b } catch (e: ArithmeticException) { null } //Kotlin faz inferência "val divisao : Int?"
    println(divisao) //Cai no tratamento de exceção (catch) -> Imprime: null


    println("--------------------------------------------------")
    //EXTRA (teste com divisão válida):

    a = 8
    b =  2

    divisao = try { //Aplicando com divisão válida
        print("Divisão realizada com sucesso -> $a / $b = ")
        a/b
    } catch (e: ArithmeticException) {
        null
    }
    println(divisao) //Cai no try pois a divisão é válida -> Imprime: "Divisão realizada com sucesso -> 8 / 2 = 4"


    println("--------------------------------------------------")
    //VOLTANDO À AULA (Ampliando o código):

    a = 10
    b = 0

    divisao = try {
        println("Tentando fazer divisão...")
        a/b
    } catch (e: ArithmeticException) {
        println("Divisão com erro!")
        null
    } finally {
        println("Finally")
    }

    println(divisao) //Pega valores reatribuídos "EXTRA" -> Imprime: "Divisão realizada com sucesso -> 8 / 2 = 4"

    /* Impressão final:
    null
    --------------------------------------------------
    Divisão realizada com sucesso -> 8 / 2 = 4
    --------------------------------------------------
    Tentando fazer divisão...
    Divisão com erro!
    Finally
     */

}