package controleDeFluxoEColecoes.controleDeFluxo

fun main() {

    //variável bolos recebe uma "lista de". Os itens da lista são: cenoura, baunilha, chocolate
    val bolos = listOf("cenoura", "baunilha", "chocolate")

    //bolo é cada item na lista de bolos.
    for (bolo in bolos) { //para cada bolo em bolos,... <imprime a frase>
        println("Hmmm... este é um bolo de $bolo")
    }

}