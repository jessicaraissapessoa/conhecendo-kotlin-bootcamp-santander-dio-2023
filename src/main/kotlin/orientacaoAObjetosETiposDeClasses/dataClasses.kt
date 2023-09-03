package orientacaoAObjetosETiposDeClasses

data class User (val name: String, val id: Int) { //Data Class. Vários métodos são gerados automaticamente

    //Sobrescrita da função equals: não quer fazer comparação de todas as propriedades. Quer comparar apenar id
    override fun equals (other: Any?) =
        other is User && other.id == this.id //Novo usuário (other) = User? id de other = ir de usuário?


    //override de hashCode() que foi recomendado pelo Sonarlint/Itellij. Função ausente na aula
    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + id
        return result
    }
}

fun main() {

    val user = User("Alex", 1) //Criação de usuário
    println(user) //Impressão: User(name=Alex, id=1). DataClass permitiu esse toString já legível

    val secondUser = User("Alex", 1) //Criação de segundo usuário. Second tem mesma estrutura do primeiro
    val thirdUser = User("Max", 2) //Criação de terceiro usuário

    println("user == secondUser: ${user == secondUser}") //Comparação entre primeiro e segundo usuários. Equals: True
    println("user == thirdUser: ${user == thirdUser}") //Comparação entre primeiro e terceiro usuários. Equals: False

    // hashCode() function - Código hash que basicamente gera um valor a partir das propriedades de um objeto
    println(user.hashCode()) //Hashcode impresso: 63347075
    println(secondUser.hashCode()) //Hashcode impresso (igual ao de user): 63347075
    println(thirdUser.hashCode()) //Hashcode impresso: 2390846

    // copy() function - Cópia de valores de uma instância em uma nova instância
    println(user.copy()) //Imprimindo uma cópia criada de user
    println(user == user.copy()) //Imprimindo comparação estrutural entre user e user.copy -> Mesma estrutura -> True
    println(user === user.copy()) //Imprimindo comparação referencial entre user e user.copy -> Referências diferentes -> False
    println(user.copy(name = "Max")) //Imprimindo user.copy, passando valor diferente de name -> Imprime: User(name=Max, id=1)
    println(user.copy(id = 3)) //Imprimindo user.copy, alterando id -> Imprime: User(name=Max, id=3)

    // component - acessa componentes de uma instância de acordo com ordem de declaração das propriedades no construtor
    println("name = ${user.component1()}") //componente 1 de user -> name -> Imprime: name = Alex
    println("id = ${user.component2()}") //componente 2 de user -> name -> Imprime: id = 1

}