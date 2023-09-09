package tratamentoExcecoes

class IllegalVoterException (message: String) : Throwable(message) //Exceção que criamos para esse caso

@Throws(IllegalVoterException::class) //Aviso de lançamento de exceção
fun vote(name: String, age: Int) { //Função para votar
    if (age < 16) { //Caso pessoa votando tenha idade menor do que 16 anos
        throw IllegalVoterException("$name não pode votar.") //Lançamento de exceção padrão de argumento
    }
    println("Voto de $name realizado com sucesso!")
}

fun main() {

    var quantidadeVotos = 0 //Variável para contar votos inicializada com zero votos

    quantidadeVotos += try { // += -> quantidadeVotos vai ser seu valor atual +1 caso o try deu certo
        vote("Jéssica", 32) //Imprime: "Voto de Jéssica realizado com sucesso!"
        1 //Retorno do try que adiciona +1 a quantidadeVotos
    } catch (e: IllegalVoterException) {
        0 //Retorno do catch que adiciona +0 a quantidadeVotos (voto não deu certo -> não contabilizado)
    }

    quantidadeVotos += try { // += -> quantidadeVotos vai ser seu valor atual +1 caso o try deu certo
        vote("Fulana", 10) //Imprime exceção para menores de 16 contento "Fulana não pode votar."
        1 //Retorno do try que adiciona +1 a quantidadeVotos
    } catch (e: IllegalVoterException) {
        0 //Retorno do catch que adiciona +0 a quantidadeVotos (voto não deu certo -> não contabilizado)
    }

    quantidadeVotos += try { // += -> quantidadeVotos vai ser seu valor atual +1 caso o try deu certo
        vote("Sicrano", 50) //Não executa, pois estourou exceção anteriormente
        1 //Retorno do try que adiciona +1 a quantidadeVotos
    } catch (e: IllegalVoterException) {
        0 //Retorno do catch que adiciona +0 a quantidadeVotos (voto não deu certo -> não contabilizado)
    }

    println("Quantidade final de votos: $quantidadeVotos")

}