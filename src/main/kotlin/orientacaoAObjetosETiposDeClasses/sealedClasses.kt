package orientacaoAObjetosETiposDeClasses

sealed class Mammal (val name: String) //Sealed class de mamífero (Mammal) com propriedade name

//Classe gato com parâmetro catName, que é passado para name de Mammal
class Cat (val catName: String) : Mammal(catName)

//Classe humano com parâmetro humanName, que é passado para name de Mammal, e parâmetro job
class Human (val humanName: String, val job: String) : Mammal(humanName)


//Usar name (da superclasse) ao invés de humanName e catName permite criação de função genérica para saudar ambos
fun greetMammal (mammal: Mammal) : String { //Função de saudação
    return when (mammal) {
        is Human -> "Hello, ${mammal.name}! You're working as a ${mammal.job}" //se mammal for Human
        is Cat -> "Hello, ${mammal.name}!" //se mammal for Cat
    }
}

fun main() {

    println(greetMammal(Cat("Snowy"))) //Print de saudação para Cat com name "Snowy" -> Imprime: Hello, Snowy!

    val cat = Cat("Fofinho") //Instância de Cat
    val human = Human("Jéssica", "Student") //Instância de Human

    println(greetMammal(cat)) //Imprime: Hello, Fofinho!
    println(greetMammal(human)) //Imprime: Hello, Jéssica! You're working as a Student

}