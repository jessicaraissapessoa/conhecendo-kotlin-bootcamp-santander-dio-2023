package poderFuncoes.tiposDeFuncoes

fun operation(): (Int) -> Int { //Função operator tem como retorno "(Int) -> Int", que é outra função
    return ::square //O retorno "(Int) -> Int" é a função square
}

fun square(x: Int) = x * x //Função square recebe x que é Int e retorna o resultado de x*x que é Int -> "(Int) -> Int"

fun main() {

    val func = operation() //Instância da função operation
    println(func(2))//Impressão chamando func passando 2 como parâmetro -> 2 * 2 -> Imprime: 4

}