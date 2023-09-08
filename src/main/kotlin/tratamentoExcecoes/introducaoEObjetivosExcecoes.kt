package tratamentoExcecoes

fun main() {

    throw Exception("Hi There")

    /*
    - throw -> tradução -> lançar
    - Estamos lançando uma exceção cuja mensagem é "Hi There"
    - Ao executar, veremos a mensagem de exceção
    - java.lang.Exception -> tipo da exceção
    - Hi There - Mensagem da exceção
    - at tratamentoExcecoes.IntroducaoEObjetivosExcecoesKt.main(introducaoEObjetivosExcecoes.kt:5)
        - Erro ocorreu na linha 5 (throw Exception("Hi There"))
        - Da main
    - Endereçamento: at tratamentoExcecoes.IntroducaoEObjetivosExcecoesKt.main(introducaoEObjetivosExcecoes.kt)
        - tratamentoExcecoes.IntroducaoEObjetivosExcecoesKt.main
            - nomepacote.nomearquivo+formato.escopodaexceção
        - (introducaoEObjetivosExcecoes.kt)
            - nomedoarquivo.formato
        - Restante da mensagem de exceção (caso haja mais) são as consequências (hierarquia da exceção)
     */

}