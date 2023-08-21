package introducao

fun main() {

    var a : String = "inicial"
    println(a) //imprime "inicial"
    a = "final" //mudei o valor de a
    println(a) //imprime "final

    val b : Int = 1
    println(b) //imprime "1"

    val c = 3 //Kotlin irá inferir o tipo, compreendendo que trata-se de Int
    println(c) //imprime "3"


    //val é usado em uma variável declarada para posteriormente ser inicializada

    fun someCondition() = true

    val d : Int = if (someCondition()) {
        1
    } else {
        2
    }

    println(d)

}