package orientacaoAObjetosETiposDeClasses

open class Tiger (val origin: String) { //Superclasse Tiger. val origin: String é o construtor com parâmetro
    fun sayHello() { //Não é uma função open. Não pode ser sobrescrita
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger: Tiger("Siberia") //"Siberia" é o parâmetro passado para Tiger da subclasse SiberianTiger

fun main() {

    val tiger: Tiger = SiberianTiger() //tiger é objeto da classe SiberianTiger, que é extensão de Tiger

    tiger.sayHello() //Imprime: "A tiger from Siberia says: grrhhh!"

}