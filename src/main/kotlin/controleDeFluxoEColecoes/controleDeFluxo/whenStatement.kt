package controleDeFluxoEColecoes.controleDeFluxo

fun main() {

    //Cadeia de chamadas da função cases:
    cases("Olá") //console: Beleza?
    cases(1) //console: Um
    cases(0L) //console: Tipo Long
    cases(MyClass()) //console: Não é String
    cases("olá") //console: Desconhecido

}

//Função cases que recebe obj como parâmetro. obj está tipado como Any (recebe valores de qualquer tipo)
fun cases(obj: Any) {

    when (obj) { //quando obj tiver como valor...
        1 -> println("Um") //...1, imprime "Um"
        "Olá" -> println("Beleza?") //..."Olá", imprime "Beleza?"
        is Long -> println("Tipo Long") //...algo de tipo Long, imprime "Tipo Long"
        !is String -> println("Não é String") //... algo que não for uma String (! -> falso), imprime "Não é String"
        else -> println("Desconhecido") //...qualquer outra coisa, imprime "Desconhecido"
    }

}

class MyClass
