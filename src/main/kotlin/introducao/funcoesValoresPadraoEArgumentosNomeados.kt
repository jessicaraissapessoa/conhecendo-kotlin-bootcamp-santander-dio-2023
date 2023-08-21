package introducao

//função para imprimir uma mensagem a partir do parâmetro message (de tipo String) recebido
fun printMessage(message: String): Unit {
    println(message)
}

//função para imprimir uma mensagem a partir dos parâmetros message e prefix (cujo valor padrão é "Info"
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

//função para calcular a soma dos valores dos parâmetros x e y e que retorna um valor de tipo Int
fun sum(x:Int, y:Int): Int {
    return x + y
}

//inline function  que multiplica valores dos parâmetros x e y e retorna o resultado da operação
fun multiply(x:Int, y: Int) = x * y

//função main que executa as chamadas para as funções
fun main(){

    //imprimindo mensagem. "Hello" é o valor atribuído ao parâmetro message da função
    printMessage("Hello")

    //imprimindo mensagem com prefixo. "Hello" vai para parâmetro message e "Log" para parâmetro prefix
    printMessageWithPrefix("Hello", "Log")

    //imprimindo mensagem com prefixo. "Hello" vai para parâmetro message. prefix não recebeu valor, então adotará o valor padrão "Info"
    printMessageWithPrefix("Hello")

    //imprimindo mensagem com prefixo. Parâmetro nomeado. Foi determinado que valor vai para message e que valor vai para prefix
    printMessageWithPrefix(prefix = "Log", message = "Hello")

    //imprimindo resultado de x + y a partir da chamada da função sum
    println(sum(1, 2))

    //imprimindo resultado de x * y a partir da chamada da função multiply
    println(multiply(2, 4))

}