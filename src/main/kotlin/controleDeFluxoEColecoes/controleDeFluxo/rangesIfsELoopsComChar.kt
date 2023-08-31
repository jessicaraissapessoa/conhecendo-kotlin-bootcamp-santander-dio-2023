package controleDeFluxoEColecoes.controleDeFluxo

fun main() {

    //Range com char

    for (c in 'a'..'d') {
        print("$c ")
    }

    print(" -  ")

    for (c in 'z' downTo 's' step 2) {
        print("$c ")
    }

    println(" ")

    //Range em if

    val x = 2

        //Se x estiver no intervalo de 1 a 5 inclusive
    if (x in 1..5) {
        print("$x está entre 1 a 5 inclusive")
    }

    println(" ")

    //Se x não estiver no intervalo de 6 a 10 inclusive
    if (x !in 6..10) { // !in -> não é/está
        print("$x não está entre 6 a 10 inclusive")
    }

}