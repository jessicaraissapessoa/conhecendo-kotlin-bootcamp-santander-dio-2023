package controleDeFluxoEColecoes.controleDeFluxo

fun main() {

    for (i in 0..3) { //0 a 3 inclusive → imprime: 0 1 2 3
        print("$i ")
    }
    print(" - ")

    for (i in 0 until 3) { //0 a 3 exclusive → imprime: 0 1 2
        print("$i ")
    }
    print(" - ")

    for (i in 2..8 step 2) { //2 a 8 inclusive, saltando de 2 em 2 → imprime: 2 4 6 8
        print("$i ")
    }
    print(" - ")

    for (i in 3 downTo 0) { //3 a 0 (decrescimento) → imprime: 3 2 1 0
        print("$i ")
    }

}