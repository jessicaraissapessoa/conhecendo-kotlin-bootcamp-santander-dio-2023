package controleDeFluxoEColecoes.controleDeFluxo

fun main() {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers) //TRUE - authors e writers possuem a mesma estrutura -> mesmos elementos
    println(authors === writers) //FALSE - Endereços de memória diferentes

}