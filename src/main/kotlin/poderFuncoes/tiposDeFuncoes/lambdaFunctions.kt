package poderFuncoes.tiposDeFuncoes

fun main() {

//Todos os exemplos de criação de uma função objeto que transforma String com uppercase. São funções de String para String

    //1. Tipagem (String) explícita interna e externamente
    val upperCase1: (String) -> String = { str: String -> str.uppercase() }

    //2. Inferência de tipo (String) interna em "srt ->". Já está inferido externamente
    val upperCase2: (String) -> String = { str -> str.uppercase() }

    //3. Inferência de tipo (String) externa, pois tipagem foi definida internamente em "str: String -> str.uppercase()"
    val upperCase3 = { str: String -> str.uppercase() }

    //4. Erro, pois não tipagem não foi definida em momento algum
    //val upperCase4 = { str -> str.uppercase() }

    //5. Tipagem (String) definida externamente e, ao invés de variável nomeada (str), it equivalendo a elemento que usa expressão
    val upperCase5: (String) -> String = { it.uppercase() } //it quando só há um parâmetro de entrada para ser variável de escopo

    //6. Tipagem definida externamente e chamada do uppercase de forma direta -> notação :: para passar uma função em outra
    val upperCase6: (String) -> String = String::uppercase


//Aplicando cada uma das formas (Exceto val upperCase4). Todos imprimem: HELLO

    println(upperCase1("hello")) //1
    println(upperCase2("hello")) //2
    println(upperCase3("hello")) //3
    println(upperCase5("hello")) //5
    println(upperCase6("hello")) //6

}