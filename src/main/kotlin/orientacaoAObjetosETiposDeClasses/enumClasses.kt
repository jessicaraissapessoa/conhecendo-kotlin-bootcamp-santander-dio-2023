package orientacaoAObjetosETiposDeClasses


//Enum class simples:
enum class State { //Classe Enum State. Estado de uma execução: parado, rodando, finalizado
    IDLE, RUNNING, FINISHED
}

//Enum class de estrutura mais complexa:
enum class Color (val rgb: Int) { //Enum class que recebe rgb

    //Cada cor com seu valor em hexadecimal (representações inteiras de cores)
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    //Função que verifica se quem está chamando ela possui algum aspecto que coincide com red
    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

fun main() {

//Aplicação da enum class simples:

    val state = State.RUNNING //Instância de State -> state -> RUNNING

    val message = when (state) { //Valor de message de acordo com o state. state está em RUNNING
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }

    println(message) //message para state em RUNNING -> Imprime: It's running

//Aplicação da enum class de estrutura mais complexa:

    val red = Color.RED //Instância red de Color com valor RED

    println(red) //Imprime: RED
    println(red.containsRed()) //verificação containsRed para instância red -> True
    println(Color.BLUE.containsRed()) //Verificação containsRed para valor BLUE -> False
    println(Color.YELLOW.containsRed()) //Verificação containsRed para valor YELLOW -> True

}