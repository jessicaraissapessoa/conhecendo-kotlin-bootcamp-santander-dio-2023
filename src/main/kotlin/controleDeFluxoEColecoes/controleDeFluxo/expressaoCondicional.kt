package controleDeFluxoEColecoes.controleDeFluxo

fun main() {

    /* Uso do if ternário:
    Função que determina o maior em uma comparação entre dois números (a, b)
    Se a for maior que b, maiorNumero = a, senão maiorNumero = b
     */
    fun maiorNumero(a: Int, b: Int) = if (a > b) a else b

    println(maiorNumero(99, -42))

    /*
    Versão extensa da fun maiorNumero:

    fun maiorNumero(a: Int, b: Int): Int  {
        if(a > b) {
            return a
        } else {
            return b
        }
    }
     */

}