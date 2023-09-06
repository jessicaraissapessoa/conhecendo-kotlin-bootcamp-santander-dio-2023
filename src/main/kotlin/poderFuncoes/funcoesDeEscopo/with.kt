package poderFuncoes.funcoesDeEscopo

class Configuration (val host: String, val port: Int) //Classe com propriedades host e port

fun main() {

    val configuration = Configuration(host = "127.0.0.1", port = 9000) //Instância configuration da classe Configuration

    with(configuration) { //Com with, acessamos diretamente suas propriedades
        println("$host:$port") //Imprime -> 127.0.0.1:9000
    }

    // Como seria sem o with:
    println("${configuration.host}:${configuration.port}") //Imprime -> 127.0.0.1:9000

    // Alternativa com run:
    configuration.run {
        println("$host:$port") //Imprime -> 127.0.0.1:9000
    }

}