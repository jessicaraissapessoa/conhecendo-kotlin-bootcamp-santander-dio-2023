package introducao

fun main() {

    //Função que imprime vários valores do tipo String na lista messages
    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }
    //printAll("Hello", "Hallo", "Salut", "Hola")   ---> Será chamada função log ao invés de printAll

    //Função que imprimirá cada m da lista message precedido de prefixo
    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola",
        prefix = "Greeting: "
    )

    //Função vararg que imprime log aplicando a função vararg printAll
    fun log(vararg entries: String) {
        printAll(*entries)
    }
    log("Hello", "Hallo", "Salut", "Hola")

}