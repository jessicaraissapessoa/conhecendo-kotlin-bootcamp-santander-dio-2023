package introducao

class MutableStackExample<E>(vararg itens: E) {

    private val elements = itens.toMutableList() //elements é a mutableList do conjunto dos itens

    fun push(element: E) = elements.add(element) //Adiciona element, do tipo E, em elements
    fun peek(): E = elements.last() //captura o último elemento em elements
    fun pop(): E = elements.removeAt(elements.size - 1) //remove elemento de índice [tamanho de elements - 1] de elements
    fun isEmpty() = elements.isEmpty() //retorna se elements ésta vazia (true ou false)
    fun size() = elements.size //retorna o tamanho de elements (quantos elementos)
    override fun toString() = "MutableStack(${elements.joinToString()})" //sobrescrita customizando retorno em String de todos os elementos de elements
}

fun <E> mutableStackOf(vararg elements: E) = MutableStackExample(*elements)
//Função de tipo genérico E que recebe vararg de elements de tipo genérico E
//Por meio do operador *, mutableStackOf manterá o parâmetro do tipo vararg de elements, ao invés de converter em um array

fun main() {
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}