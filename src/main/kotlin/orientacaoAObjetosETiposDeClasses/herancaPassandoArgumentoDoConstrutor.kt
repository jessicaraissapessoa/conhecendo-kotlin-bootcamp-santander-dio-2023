package orientacaoAObjetosETiposDeClasses

open class Lion (val name: String, val origin: String) { //Classe-mãe Lion. Propriedades: name, origin. Funções: sayHello
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic (name: String) : Lion(name = name, origin = "India") //Classe-filha Asiatic com propriedade (parâmetro) name
//Asiatic propaga name que recebe para name de Lion e passa valor fixo de origin "India" para Lion

fun main() {

    val lion : Lion = Asiatic("Rufo") //lion de subclasse Asiatic da superclasse Lion com name de valor "Rufo"

    lion.sayHello()

}