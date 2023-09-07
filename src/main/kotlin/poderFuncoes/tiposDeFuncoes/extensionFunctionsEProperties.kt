package poderFuncoes.tiposDeFuncoes


data class Item (val name: String, val price: Float) //Item tem nome e preço
data class Order (val itens: Collection<Item>) //Pedido recebe itens, que é uma coleção de Item


//Extension function - Pega valor do item mais caro de itens. Se não receber um valor, retorna valor 0F
fun Order.maxPricedItemValue(): Float = this.itens.maxByOrNull { it.price }?.price ?: 0F

//Extension function - Pega nome do item mais caro de itens. Se não receber um valor, retorna valor "NO_PRODUCTS"
fun Order.maxPricedItemName() = this.itens.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

//Extension property - Propriedade que traz em uma String todos os nomes dos itens concatenados e separados por vírgula
val Order.commaDelimitedItemNames: String
    get() = itens.map { it.name }.joinToString()

fun main() {


    //Instância de Order, que é composta pela coleção de Item, que possui name e price
    val order = Order(listOf(Item("Pão", 25.0F), Item("Vinho", 29.0F), Item("Água", 12.0F)))

    println("Nome do item mais caro: ${order.maxPricedItemName()}") //Imprime -> Nome do item mais caro: Vinho
    println("Valor do item mais caro: ${order.maxPricedItemValue()}") //Imprime -> Valor do item mais caro: 29.0
    println("Itens: ${order.commaDelimitedItemNames}") //Imprime -> Itens: Pão, Vinho, Água

}