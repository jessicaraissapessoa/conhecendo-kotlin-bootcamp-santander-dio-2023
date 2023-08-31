package controleDeFluxoEColecoes.controleDeFluxo

class Animal(val name: String) //Classe animal com propriedade imutável (val) nome (nome do animal)

class Zoo (val animals: List<Animal>) { //Classe zoo recebe uma lista imutável de animais

    operator fun iterator(): Iterator<Animal> { //Função que permite iterar dentro da classe Zoo
        //Nome da função é iterator e ela retorna Iterator<Animal>
        return animals.iterator()
    }
}

fun main() {

    val animals = listOf(Animal("zebra"), Animal("lion")) //animals recebe uma lista de todos os animal
    val zoo = Zoo(animals) //zoo é objeto da classe Zoo que recebe uma lista de animal (animals)
    //Forma resumida: val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }

}
