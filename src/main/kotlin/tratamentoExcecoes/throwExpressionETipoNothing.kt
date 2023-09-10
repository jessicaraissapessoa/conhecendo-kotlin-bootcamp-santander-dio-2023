package tratamentoExcecoes

data class Person (val name: String?) //Classe para uma pessoa com atributo name nullable

fun fail (message: String) : Nothing { //Colocando o lançamento da exceção como uma função
    throw IllegalArgumentException(message)
    //O fato da função retornar um Nothing faz com que a exceção seja lançada na linha assim para daí propagar
}

fun main() {

    val person1 = Person("Jéssica") //Instância de Person. Pessoa com atributo do nome com valor "Jéssica"
    val person2 = Person(null) //Instância de Person. Pessoa que não recebeu valor no nome -> null

    //Tendo name da instância feita, se tiver recebido valor, esse é recebido em s. Senão (null), lança a exceção da função
    val teste1 = person1.name ?: fail("Name required") //Recebe valor ("Jéssica")
    val teste2 = person2.name ?: fail("Name required") //Não recebe valor (null) -> vai para throw

    println(teste1) //s recebeu o valor "Jéssica" de person1.name -> Imprime: "Jéssica
    println(teste2) //s não recebe valor (null) de person2.name -> Imprime exceção

}