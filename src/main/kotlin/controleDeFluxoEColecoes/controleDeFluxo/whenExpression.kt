package controleDeFluxoEColecoes.controleDeFluxo

fun main() {

    println(whenAssign("Oi")) //result = 1
    println(whenAssign(3.4)) //result = 42
    println(whenAssign(1)) //result = "um"
    println(whenAssign(MyClassExample())) //result = 42
}

fun whenAssign(obj: Any) : Any {
    val result = when (obj) {
        1 -> "um"
        "Oi" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class MyClassExample