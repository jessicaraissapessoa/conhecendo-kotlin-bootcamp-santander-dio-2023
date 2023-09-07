package poderFuncoes.tiposDeFuncoes

/* Função calculate:
- 1. Recebe x (Int), Recebe y (Int)
- 2. Recebe operation que recebe uma declaração de função: dois valores Int resultando em um Int
- 2. calculate tem um retorno do tipo Int determinado por operation com x e y recebidos em calculate
- Calculate é genérica, simplesmente pega dois valores e realiza alguma operação como podemos ver em //3
 */
fun calculate (x: Int, y: Int, operation: (Int,Int) -> Int) : Int { //1 //2 Tipo do retorno ": Int"

    return operation(x, y) //2
}


fun sum (x: Int, y: Int) = x + y //função sum recebe x e y de tipo Int e realiza a soma (x + y)


fun main() {

    val x : Int = 4 //Variável local x cujo valor será usados em sumResult e mulResult
    val y : Int = 5 //Variável local y cujo valor será usados em sumResult e mulResult

    //3. Recebe x, y e o resultado da função sum em calculate, que retorna operation com esses valores
    val sumResult = calculate(x, y, ::sum)

    //3. Recebe x, y e o resultado função dinâmica com expressão dinâmica { a, b -> a * b } em calculate, que retorna operation com esses valores
    val mulResult = calculate(x, y) { a, b -> a * b }

    println("Resultado da soma de $x e $y: $sumResult\nResultado da multiplicação de $x e $y: $mulResult")
    /* Imprime:
    Resultado da soma de 4 e 5: 9
    Resultado da multiplicação de 4 e 5: 20
     */

}