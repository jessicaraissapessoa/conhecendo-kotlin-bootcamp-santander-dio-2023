package introducao

//classe de pilha que tem como parâmetro uma lista vararg itens composta de elementos E, sendo E elementos de qualquer tipo
class MutableStack<E>(vararg itens: E) {

    //Propriedade que são os elementos que estão chegando como parâmetro construtor.
    //Essa propriedade converte elementos para mutableList
    private val elements = itens.toMutableList()


    //funções que simulam ações em uma pilha
    fun push(element: E) = elements.add(element) //Função que adiciona elemento
    fun peek(): E = elements.last() //Função que pega o último elemento, sem removê-lo, só o observando
    fun pop(): E = elements.removeAt(elements.size - 1) //Função que remove o elemento que está em uma posição x, sendo x = tamanho da lista - 1
    fun isEmpty() = elements.isEmpty() //Função que verifica se a lista está vazia
    fun size() = elements.size //Função que retorna o tamanho da lista


    //Sobrescrita do método toString para converter a lista para um texto a ser enxergado pelo console
    override fun toString() = "MutableStack(${elements.joinToString()})"

}

fun main() {

    val stack = MutableStack(0.62, 3.14, 2.7) //Criação de uma pilha que é objeto da classe MutableStack, inicializando-a com valores

    stack.push(9.87) //Adição de mais um elemento à stack
    println(stack) //print da stack que usa o template criado em override fun toString. Exibe: MutableStack(0.62, 3.14, 2.7, 9.87)

    println("peek(): ${stack.peek()}") //usa função peek para pegar último elemento (topo da pilha). Exibe: peek(): 9.87
    println(stack) //pilha continua intacta

    println(stack.size()) //exibição do tamanho (quantidade de elementos) da pilha

    println(stack.isEmpty()) //exibindo se stack está vazia. Exibe: false


    //laço que remove os elementos da pilha um por um:
    for (i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }

    println(stack.isEmpty()) //exibindo se stack está vazia. Exibe: true


    //Outro objeto da classe MutableList com um tipo diferente do anterior (stack -> Double)
    val stack2 = MutableStack("a", "b", "c")
    println(stack2)

}