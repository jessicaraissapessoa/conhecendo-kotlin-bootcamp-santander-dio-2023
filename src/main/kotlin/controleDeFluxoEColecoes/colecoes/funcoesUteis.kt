package controleDeFluxoEColecoes.colecoes

fun main() {

    val numbers = listOf(1, -2, -4, 5, -6)

    println("Numbers: $numbers") //Printa todos

//filter - Filtrar elementos

    val positives = numbers.filter { x -> x > 0 } //Filtro para positivos: x > 0. Primeira forma de fazer
    val negatives = numbers.filter { it < 0 } //Filtro para negativos: x < 0. Segunda forma de fazer

    println("Positive numbers: $positives") //Printa positivos
    println("Negative numbers: $negatives") //Printa negativos

//map - Aplicar transformação em todos os elementos

    val doubled = numbers.map { x -> x * 2 } //Duplica o valor de todos os elementos de numbers
    val tripled = numbers.map { it * 3 } //Triplica o valor de todos os elementos de numbers

    println("Doubled numbers: $doubled") //Printa duplicados
    println("Tripled numbers: $tripled") //Printa triplicados

//any - Verifica se há ao menos um elemento que atenda a um dado critério

    val anyNegative = numbers.any { it < 0 } //Verifica se há algum número menor que 0 em numbers: True
    val anyGT6 = numbers.any { it > 6 } //Verifica se há algum número maior que 6 em numbers: False

    println("Is there any number less than 0: $anyNegative") //Imprime resultado da verificação para < 0
    println("Is there any number greater than 6: $anyGT6") //Imprime resultado da verificação para > 6

//flatMap - Transforma os elementos em iteráveis e faz uma lista à parte com eles

    val fruitsBag = listOf("apple", "orange", "banana", "grapes") //Lista de uma sacola de frutas
    val clothesBag = listOf("shirts", "pants", "jeans") //Lista de uma sacola de roupas

    val cart = listOf(fruitsBag, clothesBag) //As duas sacolas dentro do carrinho

    val mapBag = cart.map { it } //map mantém as estruturas originais. Ver print 1
    val flatMapBag = cart.flatMap { it } //flatMap junta todos os elementos em uma nova e única estrutura. Ver print 2

    //Print 1: Your bags are: [[apple, orange, banana, grapes], [shirts, pants, jeans]]
    println("Your bags are: $mapBag")

    //Print 2: The things you bought are: [apple, orange, banana, grapes, shirts, pants, jeans]
    println("The things you bought are: $flatMapBag")
}