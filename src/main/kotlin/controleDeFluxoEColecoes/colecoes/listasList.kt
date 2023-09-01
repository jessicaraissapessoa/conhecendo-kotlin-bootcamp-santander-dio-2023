package controleDeFluxoEColecoes.colecoes

//Criando uma variável imutável que recebe uma mutableList: a variável só pode receber outra instância que não essa lista
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)

//Atribuindo a variável anteriormente criada a uma variável nova (sudoers). Sudoers: cópia read-only de systemUsers
val sudoers: List<Int> = systemUsers

//Função que adiciona novo usuário à systemUsers
fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}


//Função que retorna a variável que é a lista read-only
fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {

    addSystemUser(4) //Adição de novo usuário

    println("Tot sudoers: ${getSysSudoers().size}") //Impressão do total de usuários na lista read-only

    //Percorrendo todos os elementos da lista read-only para verificar se o usuário adicionado está aqui
    getSysSudoers().forEach {
        i -> println("Some useful info on user $i")
    }

    //getSysSudoers().add(5) <- Erro, pois não pode adicionar novo elemento à lista read-only

}