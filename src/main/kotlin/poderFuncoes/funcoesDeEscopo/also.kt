package poderFuncoes.funcoesDeEscopo

data class Person2 (var name: String, var age: Int, var about: String) { //Data class com dados de Person2
    constructor(): this("", 0, "") //Sobrecarga de construtor para chamadas de construtor vazio
}

fun writeCreationLog(p: Person2) {
    println("A new person ${p.name} was created") //Função que imprime a informação de que uma instância de Person2 foi criada
}

fun main() {

    val jessie = Person2("Jéssica", 32, "Future Android Developer") //Cria instância de Person 2 -> jessie
        .also { //Além de instanciar, faz...
            writeCreationLog(it) //Aplicação da função writeCreatingLog o objeto jessie, instância de Person2
        }

}