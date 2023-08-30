package controleDeFluxoEColecoes.controleDeFluxo

fun eatACake() = println("Eat a cake") //Função que imprime "come um bolo"

fun bakeACake() = println("Bake a Cake") //Função que imprime "cozinha um bolo"

fun main() {

    var cakesEaten = 0 //Variável que determina a quantidade de bolos comidos
    var cakesBaked = 0 //Variável que determina a quantidade de bolos cozinhados

    //Enquanto a quantidade de bolos comidos for menor que 5...
    //executa função de comer bolo e acrescenta +1 aos bolos comidos
    while (cakesEaten < 5) {
        eatACake()
        cakesEaten ++
    }

    //Executa função de cozinhar um bolo, acrescenta +1 aos bolos cozinhados...
    //e continua executando essa função enquanto a quantidade de bolos cozinhados for menor que a quantidade de comidos
    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

}