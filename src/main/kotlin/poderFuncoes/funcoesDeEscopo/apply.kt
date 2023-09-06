package poderFuncoes.funcoesDeEscopo

data class Person (var name: String, var age : Int, var about: String) { //data class -> classe preparada para armazenar dados
    constructor() : this("", 0, "") //Sobrecarga de construtor para caso alguém chame construtor vazio
}

fun main() {

    val jake = Person() //Chamando construtor vazio em inicialização de instância

    val stringDescription = jake.apply {//Usando apply para atribuir valores das propriedades
        name = "Jake"
        age = 30
        about = "Android developer"
    }.toString() //Traz todos os valores para um formato String para impressão

    println(stringDescription) //Imprime: Person(name=Jake, age=30, about=Android developer)
    //Se não aplicar o toString no jake.apply, pode usar println(jake.toString()) para fazer a mesma impressão

}