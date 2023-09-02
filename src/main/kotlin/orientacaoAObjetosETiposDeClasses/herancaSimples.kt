package orientacaoAObjetosETiposDeClasses

open class Dog { //Superclasse. Precisa estar aberta para que subclasses herdem e/ou sobrescrevam suas propriedades
    open fun sayHello() { //Função aberta para poder ser herdada e/ou sobrescrita
        println("wow wow!")
    }
}

class Yorkshire: Dog() { //Subclasse de Dog. Extensão de Dog. Herda suas propriedades
    override fun sayHello() { //Sobrescrita da função sayHello da superclasse Dog
        println("wif wif!")
    }
}

fun main() {

    val dog : Dog = Yorkshire() //dog é uma instância de Yorkshire com inferência do tipo Dog (superclasse)
    //Usando inferência de tipo: val dog = Yorkshire()

    dog.sayHello() //imprime "wif wif!", que é o sayHello sobrescrito

}